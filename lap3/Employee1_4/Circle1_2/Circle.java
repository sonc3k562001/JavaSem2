package T1908a.lap3.Employee1_4.Circle1_2;

public class Circle {
    private String color;
    private  double radius =2.3;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.color = "red";
        c1.radius = 2.3;
        Circle c2 = new Circle();
        c2.radius =3.4;
        c2.color= "blue";
        System.out.println(c1.color);
        System.out.println(c1.radius);
        System.out.println(c2.color);
        System.out.println(c2.radius);
    }
    public double getArea(){
        return  radius * radius *Math.PI;
    }
}
