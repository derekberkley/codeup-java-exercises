package src.util;

import java.util.Scanner;


public class Input {

    private Scanner scanner;
//    String userInput = scanner.next();

    public Input() {
        scanner = new Scanner(System.in);
    }


    boolean yesNo() {
        String response = scanner.next();
        if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
            System.out.println("yes = true");
            return true;
        } else {
            System.out.println("no = false");
            return false;
        }
    }

//    public static int alterString(String num) {
//        int userMod = Integer.parseInt(num);
//        System.out.println("userMod: " + userMod);
//        return userMod;
//    }

    static String getString() {
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next();
        System.out.println(String.format("word: %s", response));
        return response;
    }
    String getStringNoStatic() {
        String response = scanner.next();
//        System.out.printf("word: %s", response);
        return response;
    }


    public static int getInt(int min, int max) {
//        Scanner scan1 = new Scanner(System.in);
        int userInput = 0;
        String s = getString();
        try {
            userInput = Integer.valueOf(s);
        } catch (NumberFormatException e) {
            System.out.println("woops, that isn't the format we are looking for.");
            System.out.println("Enter an integer between 1 and 10: ");
            return getInt(min, max);
        }

        if (userInput < min || userInput > max) {
            System.out.println("Not in range of the min and max. Enter an integer between " + min + " and " + max);
            getInt(min, max);
        } else {
            System.out.println("Your #: " + userInput + " is between " + min + " and " + max);
        }


        return userInput;
    }

    public int getIntNoStatic(int min, int max) {
//        Scanner scan1 = new Scanner(System.in);
        int userInput = 0;
        String s = getStringNoStatic();
        try {
            userInput = Integer.valueOf(s);
        } catch (NumberFormatException e) {
            System.out.println("woops, that isn't the format we are looking for.");
            System.out.println("Enter an integer between 1 and 10: ");
            return getInt(min, max);
        }

        if (userInput < min || userInput > max) {
            System.out.println("Not in range of the min and max. Enter an integer between " + min + " and " + max);
            getInt(min, max);
        } else {
            System.out.println("Your #: " + userInput + " is between " + min + " and " + max);
        }


        return userInput;
    }


public double getDouble(double min, double max) {
//    double userDecInput = scanner.nextDouble();
    double userDecInput = 0;
    String s = getString();

    try {
        userDecInput = Double.valueOf(s);
    } catch (NumberFormatException e) {
        System.out.println("woops, that isn't the format we are looking for.");
        System.out.println("Enter a double-typed number between 1 and 10: ");
        return getDouble(min, max);
    }

    if (userDecInput < min || userDecInput > max) {
        System.out.println("Wrong input. Please enter a double-typed number between 1 and 10.");
        getDouble(1, 10);
    } else {
        System.out.println("Your double-typed number: " + userDecInput + " is between " + min + " and " + max);
    }
    return userDecInput;
}

    public void main(String[] args) {

    }

} //end input class
