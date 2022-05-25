package src.shapes;
import src.shapes.*;

//TODO: Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method.
public class ShapesTest {


    public static void main(String[] args) {

    //TODO: create a variable of the type Rectangle named box1 and assign it a new instance of the
    // Rectangle class with a width of 4 and a length of 5.

        Rectangle box1 = new Rectangle();
//        box1.pickSides(5, 4);

    //TODO: verify that the getPerimeter and getArea methods return 18 and 20, respectively.
       box1.getArea();
       box1.getPerimeter();

    //TODO: create a variable of the type Rectangle named box2 and assign it a new instance
    // of the Square class that has a side value of 5.
//        Rectangle box2 = new Square();
//
//        //changes data type to Square to get the Square class Area and Peri to work
//        ((Square) box2).pickSide(5); //Square constructor

        //using this constructor gets Area: 0 and Peri: 0 because getArea and getPerimeter
        //are overridden at the Square class and Square is NOT assigned values w/ this constructor
//        box2.pickSides(5, 5); //Rectangle constructor


    //TODO: verify that the getPerimeter and getArea methods return 20 and 25, respectively.
//        box2.getArea();
//        box2.getPerimeter();

        Measurable myShape = new Measurable() {
            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public double getArea() {
                return 0;
            }
        };

    } //end of psvm


} // end of ShapesTest Class
