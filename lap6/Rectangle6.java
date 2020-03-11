package T1908a.lap6;

public class Rectangle6 extends Shape {
    private int length, width;
    public Rectangle6(String color,int length,int width){
        super(color);
        this.length = length;
        this.width =width;
    }
    public int getLength(){
        return length ;
    }
    public int getWidth(){
        return width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public String toString(){
        return "Rectangle[length ="+ this.length + " width ="+ this.width+super.toString();
    }
}
