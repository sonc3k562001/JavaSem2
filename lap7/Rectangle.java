package T1908a.lap7;

public class Rectangle extends shape {
    private double length;
    private double width;

    public Rectangle(String color,double radius,double length,double width){
        super(color, radius);
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return this.length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(){
        this.width = width ;
    }
    @Override
    public void getArea(){
         double area = this.length * this.width *0.5 ;
    }
    @Override

    public String toString(){
        return "Rectangle = ";
    }

}
