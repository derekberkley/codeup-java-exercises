package src.movies;
import src.movies.MoviesApplication;
import src.Person;
import src.util.Input;

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
        Movie[] findit = MoviesArray.findAll();
        if (num == 0) {
            System.out.println("OK, have a nice day. bye.");
            return;
        } else if (num == 1) {
            for (int i = 0; i < findit.length; i++) {
                System.out.println(findit[i].toString());
            }
        } else if (num == 2) {
                for (int i = 0; i < findit.length; i++) {
                    if (findit[i].category.equals("animated")) {
                        System.out.println(findit[i].toString());
                    }
                }
        } else if (num == 3) {
            for (int i = 0; i < findit.length; i++) {
                if (findit[i].category.equals("drama")) {
                    System.out.println(findit[i].toString());
                }
            }
        } else if (num == 4) {
            for (int i = 0; i < findit.length; i++) {
                if (findit[i].category.equals("horror")) {
                    System.out.println(findit[i].toString());
                }
            }
        } else if (num == 5) {
            for (int i = 0; i < findit.length; i++) {
                if (findit[i].category.equals("scifi")) {
                    System.out.println(findit[i].toString());
                }
            }
        } else {
            System.out.println("Not sure how we got here.");
        }
        MoviesApplication.askUser();
        int choice = Input.getInt(0, 5);
        output(choice);

    } //end output method


//
    public static void main(String[] args) {

    } //end psvm

} // end Movie class
