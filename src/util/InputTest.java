package src.util;

public class InputTest {

    public static void main(String[] args) {
        Input userInput = new Input(); //creates a new INSTANCE of the Input Class Object
//
//        System.out.println("Type in any word.");
//        userInput.getString();
//
//        System.out.println("Please type in yes or no.");
//        userInput.yesNo();

        System.out.println("Enter an integer between 1 and 10: ");
        userInput.getInt(1, 10);


//        runIt.getInt();

        System.out.println("Enter a Double typed number between 1 and 10 (you may choose a decimal). ");
        userInput.getDouble(1, 10);

//        runIt.getDouble();



    } //End PSVM

} //End class InputTest
