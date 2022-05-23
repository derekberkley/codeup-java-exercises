package src.util;

import java.util.Scanner;


public class Input {

    private static Scanner scanner;
//    String userInput = scanner.next();

    public Input() {
        scanner = new Scanner(System.in);
    }

    static String getString() {
        String response = scanner.nextLine();
        System.out.printf("word: %s", response);
        return response;
    }

    boolean yesNo() {
        String response = scanner.next();
        if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static int getInt(int min, int max) {
        int userInput = scanner.nextInt();

        if (userInput < min || userInput > max) {
            System.out.println("Wrong input. Please enter a # between 1 and 10.");
            userInput = getInt(1, 10);
        }
        System.out.println("Your #: " + userInput + " is between 1 and 10.");
        return userInput;
    }

//    int getInt() {}

public static double getDouble(double min, double max) {
    double userDecInput = scanner.nextDouble();

    if (userDecInput < min || userDecInput > max) {
        System.out.println("Wrong input. Please enter a # between 1 and 10.");
        userDecInput = getDouble(1, 10);
    }
    System.out.println("Your #: " + userDecInput + " is between 1 and 10.");
    return userDecInput;
}
//    double getDouble() {}

    public void main(String[] args) {


    }

} //end input class
