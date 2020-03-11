package T1908a.lap7.GeometricObject;

public class Circle implements GeometricObject {
    private double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString(){
        return "";
    }
    @Override
    public double getPerimeter(){
        return this.radius*2.0*Math.PI;
    }
    @Override
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
}
