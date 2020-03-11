package T1908a.lap7;

 public abstract class shape {
    private String color;
    private double radius;

    public shape (String color,double radius){
        this.color = color;
        this.radius = radius;
    }
    public String getColor(){
        return this.color = color;
    }
    public void setColor(String color ){
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public abstract void getArea();
    public String toString(){
        return "shape[color ="+ this.color +"]";
    }


}
