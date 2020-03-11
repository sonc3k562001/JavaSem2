package T1908a.lap7.Shape;

import T1908a.lap6.Shape;

public class Rectangle7 extends Shape7 {
    private  double width = 1.0;
    private double length = 1.0;

    public Rectangle7(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea(){
        return this.width * this.length ;
    }
    @Override
    public double getPerimeter(){
        return (this.length + this.width)*2;
    }
    public String toString(){
        return "Rectangle[shape[color ="+super.getColor()+"filled = "+super.isFilled()+",] width ="+this.width+",length ="+this.length+"]";
    }
}
