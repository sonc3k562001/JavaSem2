package T1908a.lap7;

public class testShape {
    public static void main(String[] args) {
        shape s12 = new Rectangle("blue",2.4,2.5,2.6);
        shape s22 = new Triangle("red",4.5,2.5,5.6);

        System.out.println(s12.toString());
        System.out.println(s22.toString());
    }
}
