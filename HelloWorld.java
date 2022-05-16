public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //    TODO: Create an int variable named myFavoriteNumber and assign your favorite number to it,
//     then print it out to the console.

        int myFavoriteNumber = 7;

//    TODO: Create a String variable named myString and assign a string value to it, then print the
//     variable out to the console.

        String myString = "Just do it."; //prints Just do it.
        System.out.println(myString);

//    TODO: Change your code to assign a character value to myString. What do you notice?

//      As long as you put it in double quotes (not single quotes) Java will still process the char even though the
//        variable was initially declared as a string.
        myString = "\u0061"; //prints 'a'
        System.out.println(myString);

//    TODO: Change your code to assign the value 3.14159 to myString. What happens?

        myString = "3.14159"; //will print if in double quotes. won't print as a number
        System.out.println(myString);

//    TODO: Declare an long variable named myNumber, but do not assign anything to it.
//     Next try to print out myNumber to the console. What happens?

        long myNumber;
//        System.out.println(myNumber); //error says var might now have been initialized

//    TODO: Change your code to assign the value 3.14 to myNumber. What do you notice?
//        myNumber = 3.14;

//    TODO: Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

//        myNumber = 123L;


//    TODO: Change your code to assign the value 123 to myNumber. Why does assigning the value 3.14 to a
//     variable declared as a long not compile, but assigning an integer value does?
        myNumber = 123;
        System.out.println(myNumber);
//        Variables declared as long may only contain integers. Java puts rules on how it will handle these.
//        Float and Double are the only data types that can handle integers. With Double being the MOST
//        precise data type available.

//    TODO: Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens?
//     What are two ways we could fix this?

//        float myNumber = 3.14;
//        create a new variable name or

//        TODO: Copy and paste the following code blocks one at a time and execute them.
//        int x = 5;
//        System.out.println(x++); // x will increment AFTER printing to console, therefore prints as 5
//        System.out.println(x);  // 6

        int x = 5;
        System.out.println(++x); //prints as 6 since increments BEFORE the x is called.
        System.out.println(x); //prints 6, holds its value

//        TODO: Try to create a variable named class. What happens?

        String s = "Try me.";
//        String class = "Try me.";

        //IntelliJ tries to get you to rename the variable something other than the reserved word, 'class'

//        TODO: Object is the most generic type in Java. You can assign any value to a variable of type
//         Object. What do you think will happen when the following code is run?
//
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        You may be able to assign any value to an object, but you can't "cast" to the integer class

//        int three = (int) "three";

        //can't convert string to int (incompatible types_

//        two errors viewing are

//        TODO: Rewrite the following expressions using the relevant shorthand assignment operators:

//        int x = 4;
////        x = x + 5;
//            x += 5;
//
//        int x = 3;
//        int y = 4;
////            y = y * x;
//        y *= x;

//        int x = 10;
//        int y = 2;
////        x = x / y;
//        x /= y;
////        y = y - x;
//        y -= x;

//        TODO: What happens if you assign a value to a numerical variable that is larger
//         (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?

        byte tooSmall = (byte) 32768;

//        You can either explicitly cast to a data type of lesser precision (and potentially lose data)
//        Or redefine the variable using the more appropriate data type.

    }
}
