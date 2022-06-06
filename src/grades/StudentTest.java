package src.grades;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {

    //TODO: Test your Student class by creating a StudentTest class, adding a main method and creating
    // Student objects.
    public static void main(String[] args) {

        //TODO: Verify that you can add grades to each object, and that your getGradeAverage method correctly
        // returns the average of the student's grades.

        Student brandon = new Student("Brandon", new ArrayList<>(Arrays.asList(98, 95, 100, 94)));
        Student shaun = new Student("Shaun", new ArrayList<>(Arrays.asList(88, 85, 87, 94)));

        brandon.getName();
        brandon.addGrade(70);
        brandon.getGradeAverage();

    } //end psvm

}//end Student Test Class
