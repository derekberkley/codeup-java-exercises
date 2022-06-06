package src.grades;
import java.util.ArrayList;

public class Student {

    //TODO: Create a class named Student. It should have private properties for the student's name, and grades.
    // The grades property should be an ArrayList of integers.
    private String name;
    private ArrayList<Integer> grades;

    //TODO: The student class should have a constructor that sets name property, and initializes the grades property
    // as an empty ArrayList.
    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }
}
