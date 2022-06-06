package src.shapes;


//TODO: Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method.
public class ShapesTest {


    public static void main(String[] args) {

        Measurable myShape = new Square(6);
        Measurable myShape2 = new Rectangle(2, 8);

        myShape.getArea();
        myShape.getPerimeter();
        myShape2.getArea();
        myShape2.getPerimeter();

        //TODO: Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
        // Rectangle implements Measurable which demands the includion of getPerimeter() method.
        // Quadrilateral is abstract and does not actually implement it.  Without get Perimeter() in Rectangle, then
        // the interface in not fully implemented.

        // TODO: What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
        // The getSide(), getLength(), and getWidth() methods do not work via Square or Rectangle because
        // the methods are not defined in Measurable.  The variable is being called through Measurable and is
        // unable to reach through to get the methods in the type of object (Square or Rectangle)

//        myShape.getSide();
//        myShape2.getLength();
//        myShape2.getWidth();


////==============Inheritance and Polymorphism========================================
//    //TODO: create a variable of the type Rectangle named box1 and assign it a new instance of the
//    // Rectangle class with a width of 4 and a length of 5.
//
//        Rectangle box1 = new Rectangle(5, 4);
//
//
//   //TODO: verify that the getPerimeter and getArea methods return 18 and 20, respectively.
//
//        box1.getArea();
//        box1.getPerimeter();
//
//    //TODO: create a variable of the type Rectangle named box2 and assign it a new instance
//    // of the Square class that has a side value of 5.
//
//        Rectangle box2 = new Square(5);
//
//    //TODO: verify that the getPerimeter and getArea methods return 20 and 25, respectively.
//
//        box2.getArea();
//        box2.getPerimeter();
////==============Inheritance and Polymorphism========================================


        //TODO: Modify your ShapesTest class, use it to: declare a variable of the type Measurable named myShape.
        //TODO: Test your code by creating instances of both Square and Rectangle and assigning them to myShape
        // so you can display the shape's area and perimeter.
//        Measurable myShape = new Square( 6);
//        System.out.println("what is this?: " + myShape.getArea());
//        Measurable myShape = new Rectangle();

    } //end of psvm


} // end of ShapesTest Class
