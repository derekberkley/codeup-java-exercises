package src;

import java.util.Random;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
//        String changeMe = "hello codeup!";
//
//        changeString(changeMe);
//
//        System.out.println(changeMe);
diceRoll();
TernaryTester();
    } //end psvm

public class TernaryTester {
    public void main(String[] args) {
        int x = 5;
        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
    }
}

// This doesn't have a return statement, it doesn't permanently change the variable.
    // this only reassigns the storage location as the s-String below w/in this method.

//    public static void changeString (String s) {
//        s = "Wub a lub a dub dub";
//    } //End changeString

    //TODO: Create an application that simulates dice rolling.
    public static void diceRoll() {
        Scanner sc = new Scanner(System.in);

        //TODO: Ask the user to enter the number of sides for a pair of dice.
        System.out.println("How many sides are on your dice?");
        int sides = sc.nextInt();

        //TODO: Prompt the user to roll the dice.
        System.out.println("Great! Do you want to roll your pair of dice with " + sides + " sides? (y/n)");
        String doRoll = sc.next();
        if (doRoll.equals("n")) {
            System.out.println("fine, keep your dice. bye.");
            return;
        }
        //TODO: "Roll" two n-sided dice, display the results of each, and then ask the user if
        // he/she wants to roll the dice again. Use static methods to implement the method(s) that generate
        // the random numbers. Use the .random method of the java.lang.Math class to generate random numbers.
        Random rand = new Random();
        int upperbound = sides;
        int dice1 = rand.nextInt(upperbound);
        int dice2 = rand.nextInt(upperbound);
        System.out.println("You rolled a " + dice1 + " and " + dice2);

        System.out.println("Nice roll! Do you want to roll again? (y/n)");
        doRoll = sc.next();
        if (doRoll.equals("n")) {
            System.out.println("fine, keep your dice. bye.");
            return;
        }

    }






} //end Practice Class
