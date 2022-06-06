package src.shapes;

//TODO: Inside of your shapes directory, create a class named Rectangle.

// TODO: Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.
//

public class Rectangle extends Quadrilateral implements Measurable{

    protected double rLength;
    protected double rWidth;

    public Rectangle(double l, double w) {
        super(l, w);
        rLength = l;
        rWidth = w;
    }

    @Override
    public double getPerimeter() {
       double peri = 2 * rLength + 2 * rWidth;
        System.out.println("Rectangle Perimeter: " + peri);
        return peri;
    }

    @Override
    public double getArea() {
        double area = rLength * rWidth;
        System.out.println("Rectangle Area: " + area);
        return area;
    }

    @Override
    public void setLength(double qLength) {
        this.rLength = qLength;
    }

    @Override
    public void setWidth(double qWidth) {
        this.rWidth = qWidth;
    }


//TODO: Remove the code from the body of your Rectangle and Square classes.
////Inheritance and Polymorphism =======================================
//
//    //TODO: It should have protected properties for both length and width.
//    protected double rLength;
//    protected double rWidth;
//
//    //TODO: Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
//    public Rectangle(double l, double w) {
////        super(l, w);
//        this.rLength = l;
//        this.rWidth = w;
//    }
//
//    public Rectangle(double s) {
//        this.rLength = s;
//        this.rWidth = s;
//    }
//
//    //TODO: Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values.
////    @Override
//    public double getArea() {
//        double area = rLength * rWidth;
//        System.out.println("Rectangle Area: " + area);
//        return area;
//    }
//
////    @Override
//    public double getPerimeter() {
//        double peri = 2 * rLength + 2 * rWidth;
//        System.out.println("Rectangle Perimeter: " + peri);
//        return peri;
//    }
////Inheritance and Polymorphism =======================================



} // end Rectangle Class
