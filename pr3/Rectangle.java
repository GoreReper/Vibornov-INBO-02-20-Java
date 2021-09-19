package pr3;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super();
    }

    public Rectangle(double width, double length) {
        super();
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        double area = width * length;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * (width + length);
        return perimeter;
    }

    @Override
    public String toString() {
        return ("Color of Rectangular is " + this.color + " width is " + this.width + " length is " + this.length + " and filled is " + this.filled);
    }
}
