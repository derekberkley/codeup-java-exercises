package src.shapes;

//TODO: Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method.
public class ShapesTest {

//    public static void doArea(Rectangle x) {
//        System.out.println(x.getArea());
//    }
    public static void main(String[] args) {

    //TODO: create a variable of the type Rectangle named box1 and assign it a new instance of the
    // Rectangle class with a width of 4 and a length of 5.

        Rectangle box1 = new Rectangle();
        box1.pickSides(5, 4);

    //TODO: verify that the getPerimeter and getArea methods return 18 and 20, respectively.
       box1.getArea();
       box1.getPerimeter();

    //TODO: create a variable of the type Rectangle named box2 and assign it a new instance
    // of the Square class that has a side value of 5.

        Rectangle box2 = new Square();
        box2.pickSides(5,5);
    //TODO: verify that the getPerimeter and getArea methods return 20 and 25, respectively.
        doArea(box2);
//        getPerimeter(box2);
    } //end of psvm


} // end of ShapesTest Class
