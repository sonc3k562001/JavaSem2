package T1908a.lap4.bookandauthor;

import T1908a.lap4.bookandauthor.author;

public class book {
    String name;
    double price;
    int qty = 0;
    author Author = new author("John","john12345@gmail.com",'m');
    author Author2 = new author("Peter","Perter12345@gmail.com",'m');

    public book(String name, double price, int qty, String author) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public book(String name, double price, author author) {
        this.name = name;
        this.price = price;
        this.Author=author;
    }

    public author getAuthor2() {
        return Author2;
    }

    public void setAuthor2(author author2) {
        Author2 = author2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
    public String getAthorName(){
        return Author.getName();
    }
    public String getAllName(){
        return Author.name+Author2.name;
    }

    public String toString(){
        return "Book[name="+name+",Author[name"+getAthorName()+",email="+Author.email+",gender="+Author.gender+",],price="+price+",qty="+qty+"]";
    }


}
