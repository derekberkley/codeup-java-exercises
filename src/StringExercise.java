package src;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringExercise {

//TODO: Create a class named src.StringExercise with a main method.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Retrieves a property that permits \n to start a new line.
        String newLineChar = System.getProperty("line.separator");

//        TODO: For each of the following output examples: create a String variable that contains
//         the desired output and print it out to the console, you can do this with only one String
//         variable and one print statement for each output example.
        String lyrics = "We don't need no education\nWe don't need no thought control\n";
        System.out.print(lyrics);

        String checkitOut = "Check \"this\" out!, \"s inside of \"s!\n";
        System.out.print(checkitOut);

        String mainDrive = "In windows, the main drive is usally C:\\\n";
        System.out.println(mainDrive);

        String lookatMe = "I can do backslashes \\, double backslashes \\\\, and the amazing triple backslash \\\\\\!\n";
        System.out.println(lookatMe);


    }

}
