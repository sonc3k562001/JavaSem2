package T1908a.lap4.poinandcircle;

import T1908a.lap4.poinandcircle.MyCircle;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(12,12,23);
        MyCircle c2 = new MyCircle(24,24,46);
        System.out.println(c1.Circumference(c2));
    }
}
