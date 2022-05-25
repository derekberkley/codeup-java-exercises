package src.shapes;

//TODO: Inside of shapes, create an abstract Quadrilateral class that extends Shape and implements Measurable.
abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;

    public void assignSides (double l, double w) {
        this.length = l;
        this.width = w;
    }

    public void getSides(){
        System.out.printf("L: " + this.length + ", W: " + this.width);
    }

    public void setSides(double newLength, double newWidth){
        this.length = newLength;
        this.width = newWidth;
    }

}
