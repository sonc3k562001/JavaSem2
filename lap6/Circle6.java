package T1908a.lap6;

public class Circle6 {
    private double radius;
    public Circle6(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public String toString(){
        return "Circle[ radius ="+ radius + "]";
    }
}
