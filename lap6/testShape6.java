package T1908a.lap6;

public class testShape6 {
    public static void main(String[] args){
        Shape  s1 = new Rectangle6("red",24,12);
        System.out.println(s1.toString());
        System.out.println("the area is:"+ s1.getArea() );
        System.out.println("the color is :"+ s1.getColor());

        //Triangle

        Shape s2 = new Triangle("blue",23,12);
        System.out.println(s1.toString());
        System.out.println("the area is:"+s2.getArea());
        System.out.println(" the color is:"+ s2.getColor());

        // Circle
        Shape  s3 = new circles("broww",24.2);
        System.out.println(s3.toString());
        System.out.println("the area is:"+s3.getArea());
    }
}
