package pr3;

public class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return this.length;
    }
    public void setSide(double side){
        this.length = side;
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public String toString(){
        return ("Side of Square is " + this.width + " colour is " + this.color + " filled is " + this.filled);
    }
}
