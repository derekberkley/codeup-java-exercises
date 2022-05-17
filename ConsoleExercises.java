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
//   method. Then, display that sentence back to the user.  Then, rewrite the above example using the nextLine method.

        System.out.println("Enter a sentence: ");
        String userSentence = userInt.nextLine();
        System.out.printf("Your sentence is: \"%s\"", userSentence); //only captures the first word

//  TODO: Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//      Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get
//          the user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.
//      Assume that the rooms are perfect rectangles.
//      Assume that the user will enter valid numeric data for length and width.

            System.out.println("What is the length of your room in feet?");
            String roomLength = userInt.next();
            System.out.println("What is the width of your room in feet?");
            String roomWidth = userInt.next();
            Double roomPer = Double.parseDouble(roomWidth) * 2 + Double.parseDouble(roomLength) * 2;
            Double roomArea = Double.parseDouble(roomWidth) * Double.parseDouble(roomLength);
            System.out.printf("Your %s by %s foot room has a perimeter of %s ft and an area of %s sq. ft.", roomWidth, roomLength, roomPer, roomArea);


    }
}
