package src.carShop;

public class car extends Customer {

    //TODO: Create a package called carShop. Inside carShop create a new class called Car. Make instance fields that
    // can't be accessed outside Car. These fields should be of type String named model, make, color, and an int named year.
    private String model;
    private String make;
    private String color;
    private int year;

    //TODO: Create a constructor that sets the model, make, color, and year.
    public car(String fName, String lName, String model, String make, String color, int year) {
        super(fName, lName);
        this.model = model;
        this.make = make;
        this.color = color;
        this.year = year;
    }

    //TODO: Write getters and setters for each property.(Remember we can generate these by
    // right clicking -> 'Generate' -> Getters and Setters)
    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
