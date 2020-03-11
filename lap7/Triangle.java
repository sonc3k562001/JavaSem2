package T1908a.lap7;

public class Triangle extends shape {
    private double base;
    private double height;

    public Triangle(String color, double radius, double base, double height) {
        super(color, radius);
        this.base = base;
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
    @Override
    public void getArea(){
        double area = height* 0.5*base;
    }

    @Override
    public String toString(){
        return "Triangle =";
    }
}
