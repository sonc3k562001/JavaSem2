package T1908a.lap5;

public class circle {
    private  double radius = 1.0;
    private  String color="red";

    public circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public String toString(){
        return "radius:"+ radius+"color:"+ color;
    }

    public double getArea(){
        return  radius *radius * Math.PI;
    }

}
