package pr3;

public class TestMovable{
    public static void main(String[] args) {
        Movable move = new MovablePoint(5,4,3,2);
        move.moveLeft();
        move.moveUp();
        System.out.println(move);
        Movable moveCircle = new MovableCircle(10,9,8,8,5);
        System.out.println(moveCircle);
        moveCircle.moveUp();
        moveCircle.moveRight();
        System.out.println(moveCircle);

    }
}
