package src;
import java.io.*;
import java.util.*;

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

    public static void main(String[] args) {

        String[] practice = {"coffee", "water", "soda", "juice", "milk"};

//        Either need to initialize the size of the array and add elements 1 by 1 OR initialize w/ all elements
//        String[] weatherTypes = new String[5];
//        weatherTypes[] = {"sunny", "cloudy", "overcast", "rainy", "windy"};

        long[] dailySteps = {7543, 10001, 5245, 8978, 6767, 9876, 10210};
        System.out.println(dailySteps);
        System.out.println(Arrays.toString(dailySteps));

        int[] testCase = {4, 5, 6, 7, 8, 9};
            arraySum(testCase);
    } //end of psvm



} //end of ArraysExercises Class
