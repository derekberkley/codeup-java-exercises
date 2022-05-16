import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {


//  TODO: Write some Java code that uses the variable pi to output the following:
//  TODO: Don't change the value of the variable; instead, reference one of the links above and use
//        System.out.format to accomplish this.

        double pi = 3.14159;
        System.out.format("The value of pi is: %s", pi);
        System.out.print(System.lineSeparator());

//  TODO: Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

        Scanner userInt = new Scanner(System.in);

        System.out.println("Pick any whole number: ");
        int userInput = Integer.parseInt(userInt.next());

        System.out.println("You entered: --> \"" + userInput + "\" <--");

//  TODO: Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them
//        back in the console, each on a newline.

        System.out.println("Type in any word (1/3): ");
        String userWord1 = userInt.next();
        System.out.println("Type in any word (2/3): ");
        String userWord2 = userInt.next();
        System.out.println("Type in any word (3/3): ");
        String userWord3 = userInt.next();
        System.out.printf("You entered: --> %s, %s, and %s <--", userWord1, userWord2, userWord3);
        System.out.print(System.lineSeparator());

//  TODO: Prompt a user to enter a sentence, then store that sentence in a String variable using the next
//   method. Then, display that sentence back to the user.

        System.out.println("Enter a sentence: ");
        String userSentence = userInt.nextLine();
        System.out.printf("Your sentence is: \"%s\"", userSentence); //only captures the first word


    }
}
