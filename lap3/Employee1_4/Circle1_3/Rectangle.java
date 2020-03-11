package T1908a.lap3.Employee1_4.Circle1_3;

public class Rectangle {
    private  float length;
    private  float width;

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    public double getArena(){
        return getArena();
    }
    public double getPerimeter(){
        return getPerimeter();
    }
    public String toString(){
        return "rectangle[leng " + length +"width="+width +"]";
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,6);
        System.out.println(r1.toString());

    }
}
