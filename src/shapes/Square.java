package src.shapes;

import static java.lang.Math.pow;

//TODO: Create a class named Square, also inside of shapes, that extends Rectangle.

// TODO: Change your existing Square class to extend Quadrilateral.

public class Square extends Quadrilateral {

    protected double side;

    public Square(double s) {
        super(s);
        this.side = s;
    }

    @Override
    public void setLength(double qLength) {
    }

    @Override
    public void setWidth(double qWidth) {
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getPerimeter() {
        double peri = 4 * side;
        System.out.println("Square Perimeter: " + peri);
        return peri;
    }

    @Override
    public double getArea() {
        double area = Math.pow(side, 2);
        System.out.println("Square Area: " + area);
        return area;
    }


//TODO: Remove the code from the body of your Rectangle and Square classes.
////==============Inheritance and Polymorphism========================================
//    protected double side;
//
//    //TODO: Square should define a constructor that accepts one argument, side, and calls the parent's constructor
//    // to set both the length and width to the value of side.
//    public Square(double s) {
//        super(s);
//        this.side = s;
//    }
//
//    //TODO: In the Square class, override the getArea and getPerimeter methods with the following definitions for a square:
//    // perimeter = 4 * side
//    // area = side ^ 2
//
//    @Override
//    public double getArea() {
//        double area = Math.pow(side, 2);
//        System.out.println("Square Area: " + area);
//        return area;
//    }
//
//    @Override
//    public double getPerimeter() {
//        double peri = 4 * side;
//        System.out.println("Square Perimeter: " + peri);
//        return peri;
//    }
//
////==============Inheritance and Polymorphism========================================

    //TODO: Because the length of all sides of a square are the same, the methods for setting
    // the length and the width should set both protected properties.

//    @Override
//    public void setSides(double newLength, double newWidth) { //args should be the same since sides are =
//        this.length = newLength;
//        this.width = newWidth;
//    }



//
//    public static void main(String[] args) {
//
//    } //end psvm


} //end Square Class
