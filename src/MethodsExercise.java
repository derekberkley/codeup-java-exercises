package src;

import java.util.Scanner;
import java.util.Random;

public class MethodsExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        addition(2, 3);
        subtraction(3, 4);
        multiplication(5, 6);
        division(8, 2);
        multLoop(5, 6);
        multRec(4, 5);
//        division(9, 0); Error: Exception in thread "main" java.lang.ArithmeticException: / by zero
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        factorial();
        diceRoll();

    }

//TODO: Create four separate methods. Each will perform a different arithmetic operation.
    static int addition(int a, int b) {
        int i = a + b;
        System.out.println(i);
        return i;
    }
    static int subtraction(int a, int b) {
        int i = a - b;
        System.out.println(i);
        return i;
    }
    static int multiplication(int a, int b) {
        int i = a * b;
        System.out.println("mult:" + i);
        return i;
    }
    static int division (int a, int b) {
        int i = a / b;
        System.out.println(i);
        return i;
    }

//  TODO: Create your multiplication method without the * operator (Hint: a loop might be helpful).
    static int multLoop(int a, int b) {
        int c = 0;
        for (int i = 1; i <= b; i++) {
            c += a;
        }
        System.out.println("loop Multiplication:" + c);
        return c;
    }

//  TODO: Do the above with recursion.
    static int multRec(int a, int b) {
        if (a == 0 || b == 0){
            System.out.println(0);
            return 0;
        } else {
            int c = a + multRec(a, b-1);
            System.out.println("c" + c);
            return c;
        }
    }

// TODO: Create a method that validates that user input is in a certain range and returns
//  that input as an integer if it is within the given range. If not, prompt the user to
//  input their number again until the input is within range.

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if (userInput < min || userInput > max) {
            System.out.println("Wrong input. Please enter a # between 1 and 10.");
            userInput = getInteger(1, 10);
        }
        System.out.println("userInput: " + userInput);
        return userInput;
    }

// TODO: Calculate the factorial of a number.
    public static long factorial() {
        Scanner sc = new Scanner(System.in);
        long lastFact = 1;

        //TODO: Prompt the user to enter an integer from 1 to 10.
        System.out.println("Enter a number between 1 and 10: ");
        int num = sc.nextInt();

        //TODO: Assume that the user will enter an integer, but verify it’s between 1 and 10.
        if (num > 10 || num < 1) {
            System.out.println("Try again, Enter a number between 1 and 10: ");
            num = sc.nextInt();
        }

        //TODO: Display the factorial of the number entered by the user.
        System.out.println("Thanks, you picked: " + num);

        //TODO: Ask if the user wants to continue. Continue only if the user agrees to.
        System.out.println("Do you want to calculate the factorial of your number? (y/n)");
        String userCont = sc.next();

        if (userCont.equals("n")) {
            System.out.println("fine, we're done.");
            return lastFact;
        }

        //TODO: Use a for loop to calculate the factorial.
        for (int i = num; i > 0; i--) {
            lastFact *= i;
            System.out.println("iteration: " + i + ", lastFact: " + lastFact);
        }

        System.out.println("!" + num + " = " +lastFact);
        return lastFact;
    } //End factorial method

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



}; //End public class methodExercise


