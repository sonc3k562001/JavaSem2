package T1908a.lap7.GeometricObject;

public class Tesstcircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(20);
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());
        // resize radius
        Resizable r1 = new ResizableCircle(20);
        System.out.println("radius is the resize= "+ r1.resize(4));
    }
}
