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

    // returns the student's name
    public String getName() {
//        System.out.println(name);
        return name;
    };

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
        System.out.println(grades);
    };

    // returns the average of the students grades
    public double getGradeAverage() {
        int sum = 0;
        int result = 0;
        for(int grade : grades) {
            sum += grade;
            result = sum / grades.size();
        };
//        System.out.println("average: " + result);
        return result;
    };


}// end Student Class
