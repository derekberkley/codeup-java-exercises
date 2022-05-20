package src;

import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

// TODO: Create an integer variable i with a value of 5.
//  Create a while loop that runs so long as i is less than or equal to 15
//  Each loop iteration, output the current value of i, then increment i by one.
//  Your output should look like this: 5 6 7 8 9 10 11 12 13 14 15

        int i = 5;

        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }

//  TODO: Do While
//   Create a do-while loop that will count by 2's starting with 0 and ending at 100.
//   Follow each number with a new line.

        int j = 0;
        do {
            System.out.println(j);
            j += 2;
        } while (j <= 100);

//  TODO: Alter your loop to count backwards by 5's from 100 to -10.
        int k = 100;
        do {
            System.out.println(k );
            k -= 5;
        } while (k >= -10);

//   TODO: Create a do-while loop that starts at 2, and displays the number squared on each line
//    while the number is less than 1,000,000.
        int n = 2;
        do {
            System.out.println(n);
            n = (int) Math.pow(n, 2);
        } while (n <= 1000000);

// TODO: Refactor the previous two exercises to use a for loop instead.

        for (int q = 100; q >= -10; q-=5) {
            System.out.println("q= " + q);
        };

        for(int r = 2; r <= 1000000; r = (int) Math.pow(r, 2)) {
            System.out.println("r= " + r);
        }

//  TODO: FizzBuzz
        for (int f = 1; f <= 100; f++) {
            if(f % 5 == 0 & f % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (f % 5 == 0) {
                System.out.println("Fizz");
            } else if (f % 3 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(f);
            }
        }

//  TODO: Display a table of powers. Prompt the user to enter an integer.
//   Display a table of squares and cubes from 1 to the value entered. Ask if the user
//   wants to continue. Assume that the user will enter valid data. Only
//   continue if the user agrees to.

        System.out.println("What number would you like to go to?");
        int userMax = Integer.parseInt(scanner.next());
        int userMaxSq, userMaxCu;
        System.out.println("Here is your table!");
        System.out.print(System.lineSeparator());
        System.out.println(" number | squared | cubed ");
        System.out.println(" ------ | ------- | ----- ");

        for (int s = 1; s <= userMax; s++) {
             userMaxSq = (int) Math.pow(s, 2);
             userMaxCu = (int) Math.pow(s, 3);
            System.out.format("%8s|%9d|%7s|%n", s, userMaxSq, userMaxCu);
        }
//  TODO: Convert given number grades into letter grades. Prompt the user for a numerical
//   grade from 0 to 100. Display the corresponding letter grade. Prompt the user to continue.
//   Assume that the user will enter valid integers for the grades. The application should
//   only continue if the user agrees to.

        System.out.println("What was your score from 0 - 100?");
        int grade = scanner.nextInt();
        if ((100 >= grade) && (grade >= 88)) {
            System.out.println("A");
        } else if ((87 >= grade) && (grade >= 80)) {
            System.out.println("B");
        } else if ((79 >= grade) && (grade >= 67)) {
            System.out.println("C");
        } else if ((66 >= grade) && (grade >= 60)) {
            System.out.println("D");
        } else if ((59 >= grade) && (grade >= 0)) {
            System.out.println("F");
        } else {
            System.out.println("That is not a score I recognize.");
        }
    }
}
