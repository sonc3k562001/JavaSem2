package T1908a.lap6;

public class circles extends Shape {
    private double radius;
    public circles(String color,double radius){
        super(color);
        this.radius = radius;
    }
    //getter and setter of the radius
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return radius* radius* Math.PI;
    }
    @Override
    public String toString(){
        return "Circle[radius = "+ this.radius+",color ="+super.getColor()+"]";
    }
}
