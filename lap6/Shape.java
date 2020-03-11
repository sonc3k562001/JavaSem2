package T1908a.lap6;

public class Shape {
    private String color;

    public Shape(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color ;
    }
    public void setCOlor(String color){
        this.color = color;
    }
    public double getArea(){
        System.out.println("Shape unknown! Cannot computer area !");
        return 0;
    }
    @Override
    public String toString (){
       return "Shape[Color = " + this.color+"]";
    }
}
