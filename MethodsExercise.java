import java.util.Scanner;

public class MethodsExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        addition(2, 3);
        subtraction(3, 4);
        multiplication(5, 6);
        division(8, 2);
//        division(9, 0); Error: Exception in thread "main" java.lang.ArithmeticException: / by zero
    }


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
        System.out.println(i);
        return i;
    }
    static int division (int a, int b) {
        int i = a / b;
        System.out.println(i);
        return i;
    }
}
