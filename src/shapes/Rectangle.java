package src.shapes;

//TODO: Inside of your shapes directory, create a class named Rectangle.
public class Rectangle extends Quadrilateral implements Measurable{
    @Override
    public double getPerimeter() {
        double peri = 2 * length + 2 * width;
        System.out.println("Perimeter: " + peri);
        return peri;
    }

    @Override
    public double getArea() {
        double area = length * width;
        System.out.println("Area: " + area);
        return area;
    }

//==============Inheritance and Polymorphism========================================
//    //TODO: It should have protected properties for both length and width.
//    protected int length;
//    protected int width;
//
////TODO: Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
//    public void pickSides(int l, int w) {
//        this.length = l;
//        this.width = w;
//    } //end pickSides constructor
//
//
////TODO: Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values.
//    public int getArea() {
//        int area = length * width;
//        System.out.println("Area: " + area);
//        return area;
//    }
//
//    public int getPerimeter() {
//        int peri = 2 * length + 2 * width;
//        System.out.println("Perimeter: " + peri);
//        return peri;
//    }
//
//    public static void main(String[] args) {
//
//
//
//
//    } //end psvm
//==============Inheritance and Polymorphism========================================

} // end Rectangle Class
