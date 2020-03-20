package jav2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieLists {
    private ArrayList<String> movieList = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("====== Movie List =======");

        MovieLists list = new MovieLists();

        list.addMovie("Titanic");
        list.addMovie("Catch me if you can");
        list.addMovie("Noting Hills");
        list.addMovie("Chessapeke");
        list.addMovie("You hava got email");

        Scanner scanner = new Scanner(System.in);
        int Selection, n;
        String name;
        do {
            System.out.println("0.exit\n" +
                    "1.add to the Movie\n" +
                    "2.update to the Movie\n" +
                    "3.remove to the Movie\n" +
                    "4.print to the Movie\n" +
                    "5.Search to the Movie\n");
            System.out.println("please enter selection:");
            Selection = scanner.nextInt();
            switch (Selection) {
                case 0:
                    break;
                case 1:
                    System.out.println("enter number add:");
                    n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter the movie's name:");
                        name = scanner.next();
                        list.addMovie(name);
                    }
                    continue;
                case 2:
                    System.out.println("enter index:");
                    int index = scanner.nextInt();
                    String movie = scanner.next();

                    list.updateMovie(index,movie);
                    continue;
                case 3:
                    System.out.println("enter index need remove:");
                    int indexs = scanner.nextInt();
                    list.removeMovie(indexs);
                    continue;
                case 4:
                    System.out.println("the movies:");
                    list.displayList();
                    continue;
                case 5 :
                    System.out.println("enter movie need seacher:");
                    String search = scanner.next();
                    list.findMovie(search);
                    continue;
                default:
                    break;
            }
        }while (Selection != 0) ;

    }

    public void addMovie(String movie){
        movieList.add(movie);
    }
    public void displayList(){
        System.out.println("You have"+ movieList.size()+"movie:");
        for(int j =0; j<movieList.size();j++){
            System.out.println("Movie "+ (j+1)+ " "+movieList.get(j));
        }
    }
    public void updateMovie(int index,String movie){
        movieList.set(index, movie);
        System.out.println("updated: ");
        System.out.println("Movie "+(index + 1)+ " "+ movie);
    }
    public void removeMovie(int index){
        String movie = movieList.get(index);
        System.out.println("Removed "+ movie);
    }
    public String findMovie(String search){
        int position = movieList.indexOf(search);
        if(position >0){
            return movieList.get(position);
        }
        return null;
    }
}
