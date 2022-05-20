package src;

import java.util.Objects;
import java.util.Scanner;

public class Bob {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, I'm src.Bob.");
        String userInput;

        do {
            userInput = scanner.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("whoa, chill out.");
            } else if (userInput.equals("")) {
                System.out.println("fine, be that way.");
            } else {
                System.out.println("whatever");
            }
            System.out.println("userInput before conditional: " + userInput);
        } while (!userInput.equals("bye"));
//        Sting is NOT a data type. must use .equals to compare strings since it is a method

        System.out.println("finally. bye.");

    };  // End psvm


//    public static void talktoBob() {
//        Scanner scanner = new Scanner(System.in);
//
//        String userInput = scanner.nextLine();
//
//        if (userInput.endsWith("?")) {
//            System.out.println("sure.");
//            talktoBob();
//        } else if (userInput.endsWith("!")) {
//            System.out.println("whoa, chill out.");
//            talktoBob();
//        } else if (userInput.equals("")) {
//            System.out.println("fine, be that way.");
//            talktoBob();
//        } else {
//            System.out.println("whatever");
//            talktoBob();
//        }
//        return;
//    };

} //End Public Class src.Bob
