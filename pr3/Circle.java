package pr3;

public class Circle extends Shape{
    protected double radius;
    private double pi=3.14;
    public Circle(){
        super();
    }
    public Circle(String color, boolean filled, double radius){
        super(color,filled);
        this.radius = radius;
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        double area = pi*radius*radius;
        return area;
    }
    @Override
    public double getPerimeter(){
        double perimeter = 2*pi*radius;
        return perimeter;
    }
    @Override
    public String toString(){
        return ("Color of Circle is " + this.color + " , radius is " + this.radius + " and filled is " + this.filled );
    }
}
