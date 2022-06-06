package src;
import java.util.Arrays.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArraysExercises {

    //TODO: Let's create a method that returns the sum of all integers in an int array (nums)
    public static int arraySum(int[] arry) {
        int c = 0;
        for (int i = 0; i < arry.length; i++) {
            c += arry[i];
        }
        System.out.println("Sum of array elements is: " + c);
        return c;
    }

//    TODO: Create an array that holds 3 Person objects. Assign a new instance of the Person class to each
//     element. Iterate through the array and print out the name of each person in the array.
    public static Person[] newPerson() {
        Person derek = new Person("Derek");
        Person cory = new Person("Cory");
        Person joe = new Person("Joe");
        Person[] group = {derek, cory, joe};
        for (Person individual : group) {
            System.out.println(individual.getName());
        }
        return addPerson(group, new Person("carlos"));
    }

    //TODO: Create a static method named addPerson. It should accept an array of Person objects, as well as
    // a single person object to add to the passed array. It should return an array whose length is 1 greater
    // than the passed array, with the passed person object at the end of the array.
    public static Person[] addPerson(Person[] array, Person another) {
        Person[] newGroup = Arrays.copyOf(array, array.length + 1);
        newGroup[array.length] = another;
        for (Person individual : newGroup) {
            System.out.print(individual.getName() + ", ");
        }
        return newGroup;
    } // end addPerson method

    public static void main(String[] args) {

        //TODO: What happens when you run the following code? Why is Arrays.toString necessary?
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println("----------------------");
        //Prints out the data location of the array and not the contents of the array

        String[] practice = {"coffee", "water", "soda", "juice", "milk"};

//        Either need to initialize the size of the array and add elements 1 by 1 OR initialize w/ all elements
//        String[] weatherTypes = new String[5];
//        weatherTypes[] = {"sunny", "cloudy", "overcast", "rainy", "windy"};

        long[] dailySteps = {7543, 10001, 5245, 8978, 6767, 9876, 10210};
        System.out.println(dailySteps);
        System.out.println(Arrays.toString(dailySteps));

        int[] testCase = {4, 5, 6, 7, 8, 9};
            arraySum(testCase);

        //Array Basics
        //Array.toString is necessary because sout prints the data location NOT the elements themselves
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println("basics: " + Arrays.toString(numbers));


        newPerson();

    } //end of psvm



} //end of ArraysExercises Class
