import java.util.Scanner;

public class Bob {

    public static void main (String[] args) {
        System.out.println("Hi, I'm Bob.");
        talktoBob();





    }  // End psvm

    public static void talktoBob() {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        if (userInput.endsWith("?")) {
            System.out.println("sure.");
            talktoBob();
        } else if (userInput.endsWith("!")) {
            System.out.println("whoa, chill out.");
            talktoBob();
        } else if (userInput.equals("")) {
            System.out.println("fine, be that way.");
            talktoBob();
        } else {
            System.out.println("whatever");
            talktoBob();
        }
        return;
    };

} //End Public Class Bob
