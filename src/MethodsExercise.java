package src;

import java.sql.SQLOutput;
import java.util.Scanner;

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

        System.out.println("Enter another number to factorialize between 1 and 10: ");
        int userInput = factorial(1, 10);
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

    public static int factorial(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num < min || num > max) {
            System.out.println("Wrong input. Please enter a # between 1 and 10.");
            num = factorial(1, 10);
        }
        int c = num
        System.out.println("factorial: " + num);
        return num;

    }

}; //End public class methodExercise


