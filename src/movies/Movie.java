package src.movies;
import src.movies.MoviesApplication;
import src.Person;

import java.util.Arrays;

public class Movie {

    private String title;
    private String category;

    public Movie(String name, String type) {
        title = name;
        category = type;
    }

    public void getMovieInfo(){
        //TODO: return the person's name
        System.out.println("title: " + title);
        System.out.println("category: " + category);

    }

    public void setMovieInfo(String changeTitle, String changeCat){
        //TODO: change the name field to the passed value
        title = changeTitle;
        category = changeCat;
        System.out.println("new title: " + title);
        System.out.println("new category: " + category);
    }

    public String toString() {
        String yourResult = "Title: " + this.title + ", Category: " + this.category; // + ...
        return yourResult;
    }


    public static void output(int num) {
        if (num == 0) {
            System.out.println("OK, have a nice day. bye.");
            return;
        } else if (num == 1) {
            MoviesArray.findAll();
        } else if (num == 2) {
            Movie[] findit = MoviesArray.findAll();
                for (int i = 0; i < findit.length; i++) {
                    if (findit[i].category.equals("animated")) {
                        System.out.println(findit[i].toString());
                    }
                }
        } else if (num == 3) {
            Movie[] findit = MoviesArray.findAll();
            for (int i = 0; i < findit.length; i++) {
                if (findit[i].category.equals("drama")) {
                    System.out.println(findit[i].toString());
                }
            }
        } else if (num == 4) {
            Movie[] findit = MoviesArray.findAll();
            for (int i = 0; i < findit.length; i++) {
                if (findit[i].category.equals("horror")) {
                    System.out.println(findit[i].toString());
                }
            }
        } else if (num == 5) {
            Movie[] findit = MoviesArray.findAll();
            for (int i = 0; i < findit.length; i++) {
                if (findit[i].category.equals("scifi")) {
                    System.out.println(findit[i].toString());
                }
            }
//        } else {
//            System.out.println("Please pick again.");
//            //get input
//            outpu(//pass input to output again
        }


    } //end output method


//
    public static void main(String[] args) {
        output(2);
    } //end psvm

} // end Movie class
