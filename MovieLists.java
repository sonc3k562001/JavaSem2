package jav2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> movies = new ArrayList<>();
        System.out.printf("number the movie:");
        int n =scanner.nextInt();
        for(int i = 0;i<n; i++){
            movies.add(scanner.next());
        }
        System.out.println("\n the movies :"+ movies);
        System.out.println("enter the movie's name:");
        String b = scanner.next();
        movies.remove(b);
        System.out.println(movies);
        System.out.println("enter name the movie:");
        String c = scanner.next();
        System.out.println("the movies name need seacher:"+ movies.indexOf(c)+" name : "+c);
    }
}
