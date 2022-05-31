package src.shapes;

//TODO: Inside of shapes, create an abstract Quadrilateral class that extends Shape and implements Measurable.
abstract class Quadrilateral extends Shape implements Measurable {

    //TODO: This class should have: protected properties for length and width.
    protected double length;
    protected double width;

    public Quadrilateral(double l, double w) {
        this.length = l;
        this.width = w;
    }

    //TODO: This class should have: a constructor that accepts two numbers for the length and width
    // and sets those properties.
//    void assignSides (double l, double w) {
//        this.length = l;
//        this.width = w;
//    }

    //TODO: This class should have: methods for getting the length and width.
    public void getSides(){
        System.out.printf("L: " + this.length + ", W: " + this.width);
    }

    //TODO: This class should have: abstract methods for setting the length and width.
    public abstract void setSides(double newLength, double newWidth);

}
