package T1908a.lap7.Shape;

public class Circle7 extends Shape7 {
    private double radius = 1.0;

    public Circle7(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return radius*radius * Math.PI;
    }
    @Override
    public double getPerimeter(){
        return radius*2.0 *Math.PI ;
    }
    public String toString(){
        return "Circle[ Shape [color = "+ super.getColor()+ ",filled = "+super.isFilled()+"], radius = "+ this.radius +"]";

    }
}
