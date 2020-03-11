package T1908a.lap7.Movable;

public class MovablePoint implements Movable {
    int x,y,xSpeed,ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "";
    }
    @Override
    public void moveUp(){
        y-= ySpeed;
        System.out.println(y);
    }
    @Override
    public void moveDown(){
        y += ySpeed;
        System.out.println(y);

    }

    public void moveLeft(){
        x-= xSpeed;
        System.out.println(x);

    }
    public void moveRight(){
        x+= xSpeed;
        System.out.println(x);

    }
}
