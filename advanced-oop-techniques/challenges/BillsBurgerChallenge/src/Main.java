public class Main {

    public static void main(String[] args) {

        Item coke = new Item(Type.DRINK, "coke", 1.5);
        coke.printItem();
        coke.setSize(Size.LARGE);
        coke.printItem();

        Item avocado = new Item(Type.TOPPING, "avocado", 1.5);
        avocado.printItem();
    }
}
