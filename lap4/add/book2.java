package T1908a.lap4.add;
import java.util.Arrays;
public class book2 {
    private String name;
    private double privce;
    private author2[] Author;
    private int qty=0;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrivce(double privce) {
        this.privce = privce;
    }

    public void setAuthor(author2[] author) {
        Author = author;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public double getPrivce() {
        return privce;
    }

    public author2[] getAuthor() {
        return Author;
    }

    public int getQty() {
        return qty;
    }

    public book2(String name, double privce, author2[] author, int qty) {
        this.name = name;
        this.privce = privce;
        Author = author;
        this.qty = qty;
    }
    public String toString(){
        return  "Book[ name = "+ name+",author["+Arrays.toString(Author)+"]"+",price="+privce+"qty="+qty;
    }

}
