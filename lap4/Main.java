package T1908a.lap4.add;

public class Main {
    public static void main(String[] args) {
        author2[] Authors = new author2[2];
        Authors[0]= new author2("john","john@gmail.com",'m');
        Authors[1] = new author2("mary","mary@gmail.com",'f');
        book2 b1 = new book2("java",120000,Authors,123);
        System.out.println(b1.toString());
    }
}
