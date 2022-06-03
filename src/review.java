package src;

public class review {

    public static void main(String[] args) {
        //testing even method
        int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        even(test);


    } // end psvm

    //TODO: Make a class called review and create a public static method that takes in a double called radius,
    // so that you can find the circumference of a circle. (Circumference Equation: C = 2πr)
    public static void radius(double r) {
        double radius = r;
        circumference(radius);
    }

    //TODO: make the circumference method work with integers and doubles by using method overloading
    public static int circumference(int radius) {
        int circ = (int) (2 * Math.PI * radius);
        return circ;
    }
    public static double circumference(double radius) {
        double circ = 2 * Math.PI * radius;
        return circ;
    }

    //TODO: Create a public static method called total with two double parameters named 'bill' and 'tipPercentage'.
    // Return the final bill (double), including tip. (Equation: bill + ((tipPercentage / 100) * bill) = total)
    public static double total (double bill, double tipPercentage) {
        double total = bill + (bill * (tipPercentage / 100));
        return total;
    }


    //TODO: Create a public static method called even which takes in an int[] and souts out the even numbers
    public static void even(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.println(nums[i]);
            }
        }

    }

} //end review class
