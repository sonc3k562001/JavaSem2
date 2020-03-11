package T1908a.lap7;

public class testPoint {
    public static void main(String[] args) {
        ThePoint po1 = new ThePoint(3,5);
        System.out.println(po1 .toString());

        ThePoint po2 = new ThePoint(2,4);
        po2.moveDown();
        System.out.println(po2);
        ThePoint po3 = new ThePoint(2,4);
        po3.moveUp();
        System.out.println(po3);
        ThePoint po4 = new ThePoint(2,4);
        po4.moveLeft();
        System.out.println(po4);
        ThePoint po5 = new ThePoint(2,4);
        po5.moveRight();
        System.out.println(po5);
    }
}
