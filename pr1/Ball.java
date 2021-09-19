package pr1;
import java.lang.*;

public class Ball {
    private String name;
    private int size;
    private int weight;
    public Ball(String name, int size) {
        this.name = name;
        this.size = size;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }
    public int getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return "Ball{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", weight=" + weight +
                '}';
    }
}
