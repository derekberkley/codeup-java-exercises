import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        addition(2, 3);
        subtraction(3, 4);
        multiplication(5, 6);
        division(8, 2);
        multLoop(5, 6);
        multRec(4, 5);
//        division(9, 0); Error: Exception in thread "main" java.lang.ArithmeticException: / by zero
    }

//TODO: Create four separate methods. Each will perform a different arithmetic operation.
    static int addition(int a, int b) {
        int i = a + b;
        System.out.println(i);
        return i;
    }
    static int subtraction(int a, int b) {
        int i = a - b;
        System.out.println(i);
        return i;
    }
    static int multiplication(int a, int b) {
        int i = a * b;
        System.out.println("mult:" + i);
        return i;
    }
    static int division (int a, int b) {
        int i = a / b;
        System.out.println(i);
        return i;
    }

//  TODO: Create your multiplication method without the * operator (Hint: a loop might be helpful).
    static int multLoop(int a, int b) {
        int c = 0;
        for (int i = 1; i <= b; i++) {
            c += a;
        }
        System.out.println("loop Multiplication:" + c);
        return c;
    }

//  TODO: Do the above with recursion.
    static int multRec(int a, int b) {
        if (a == 0 || b == 0){
            System.out.println(0);
            return 0;
        } else {
            int c = a + multRec(a, b-1);
            System.out.println("c" + c);
            return c;
        }
    }



}; //End public class methodExercise


