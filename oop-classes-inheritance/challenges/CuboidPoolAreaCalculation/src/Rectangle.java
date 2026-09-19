public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double height) {
        if (width < 0) width = 0;
        if (height < 0) height = 0;
        this.width = width;
        this.length = height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }
}
