package T1908a.lap7.Shape;

import T1908a.lap6.Shape;

public abstract class Shape7 {
        private String color = "Red";
        private boolean filled = true;

        public Shape7(String color,boolean filled){
            this.color = color;
            this.filled = filled;
        }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();
    public String toString(){
        return "Shape[ color ="+ this.color+",filled = "+this.filled+"]";
    }

}
