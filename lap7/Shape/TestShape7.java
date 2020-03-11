package T1908a.lap7.Shape;

import T1908a.lap3.Employee1_4.Circle1_3.Rectangle;
import T1908a.lap6.Shape;

public class TestShape7 {
    public static void main(String[] args) {
        Circle7 ss1 = new Circle7("RED",false,5.5);
        System.out.println(ss1);
        System.out.println(ss1.getArea());
        System.out.println(ss1.getPerimeter());
        System.out.println(ss1.getColor());
        System.out.println(ss1.isFilled());
        System.out.println(ss1.getRadius());

        Circle7 c1 = (Circle7)ss1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        Shape7 s3 = new Rectangle7("Broww",false,1.0,2.0);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(s3.toString());

        Square s4 = new Square("blue",false,2.5,3.5,6.6);
        System.out.println(s4.getArea());
        System.out.println(s4.getPerimeter());
        System.out.println(s4.isFilled());
        System.out.println(s4.getSide());
        System.out.println(s4.getLength());
    }
}
