package T1908a.lap7.Movable;

public class TestMovable {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5,6,10,15);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovableCircle(20,2,3,4,5);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
}
