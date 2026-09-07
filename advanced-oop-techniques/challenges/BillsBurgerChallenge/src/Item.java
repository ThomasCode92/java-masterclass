enum Type {
    BURGER,
    DRINK,
    SIDE,
    TOPPING
}

enum Size {
    SMALL,
    MEDIUM,
    LARGE
}

public class Item {

    private Type type;
    private String name;
    private double price;
    private Size size = Size.MEDIUM;

    public Item(Type type, String name, double price) {
        this.type = type;
        this.name = name.toUpperCase();
        this.price = price;
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n", name, price);
    }

    public String getName() {
        if (type.equals(Type.SIDE) || type.equals(Type.DRINK)) {
            return size + " " + name;
        }
        return name;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return switch (size) {
            case SMALL -> getBasePrice() - 0.5;
            case LARGE -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }
}