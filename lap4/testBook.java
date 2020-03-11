package T1908a.lap4.bookandauthor;

import T1908a.lap4.bookandauthor.author;
import T1908a.lap4.bookandauthor.book;

public class testBook {
    public static void main(String[] args) {
        author Author = new author("John","john12345@gmail.com",'m');

        book b1 = new book("Đắc nhân tâm",12.3,124,Author.getName());
        System.out.println(b1.toString());

    }
}
