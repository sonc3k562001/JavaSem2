package T1908a.lap7;

public class ThePoint implements animal {
    private int x,y;

    public ThePoint(int x , int y){
        this.x = x;
        this. y = y;
    }
    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public void moveUp() {
        y-- ;
    }
    public String toString(){
        return "the Point = x ="+ this.x+ ",y = "+ this.y;
    }

}
