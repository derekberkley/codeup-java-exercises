import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {


//        TODO: Write some Java code that uses the variable pi to output the following:
//        TODO: Don't change the value of the variable; instead, reference one of the links above and use
//         System.out.format to accomplish this.

        double pi = 3.14159;
        System.out.format("The value of pi is: %s", pi);
        System.out.print(System.lineSeparator());

//        TODO: Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

        Scanner userInt = new Scanner(System.in);

        System.out.println("Pick any whole number: ");
        int userInput = Integer.parseInt(userInt.next());

        System.out.println("You entered: --> \"" + userInput + "\" <--");


    }
}
