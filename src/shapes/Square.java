package src.shapes;

//TODO: Create a class named Square, also inside of shapes, that extends Rectangle.
public class Square extends Quadrilateral {

    protected double side;

    public void pickSide (double s) { //constructor w/ 1 arg
        this.side = s;
    }
//==============Inheritance and Polymorphism========================================
//    private int side;
//
////TODO: Square should define a constructor that accepts one argument, side,
//// and calls the parent's constructor to set both the length and width to the value of side.
//public void pickSide (int s) { //constructor w/ 1 arg
//    this.side = s;
//    pickSides(s, s); //call parent constructor
//}
//
////TODO: In the Square class, override the getArea and getPerimeter methods with the following definitions for a square:
//// perimeter = 4 * side
//// area = side ^ 2
//    public int getArea() {
//        int area = (int) Math.pow(side, 2);
//        System.out.println("Square Area: " + area);
//        return area;
//    }
//
//    public int getPerimeter() {
//        int peri = 4 * side;
//        System.out.println("Square Perimeter: " + peri);
//        return peri;
//    }
//
//    public static void main(String[] args) {
//
//    } //end psvm
//==============Inheritance and Polymorphism========================================

} //end Square Class
