package src.grades;
import java.util.Scanner;
import java.util.*;

public class GradesApplication {
     static String userInput;
     static ArrayList<Object> names = new ArrayList<>();

    public static void matchUser(HashMap stds) {
        boolean verdict = false;
        Object getMe = null;
        System.out.println("What student would you like to see more information on?");
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextLine();
        for (Object name : names) {
            //TODO: If the given input does not match up with a key in your map, tell the user that no users with
            // that username were found.
            if (userInput.equals(name)) {
                verdict = true;
                getMe = name;
                break;
            }
        }
        if (!verdict) {
            System.out.println("Sorry, no student found with that GitHub username can be found here.");

            System.out.println("Would you like to continue?");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
                matchUser(stds);
            } else {
                System.out.println("Goodbye");
                System.exit(0);
            }
        } else {
            Student holder = (Student) stds.get(getMe);
            System.out.println("Name: " + holder.getName());
            System.out.println("GitHub Username: " + getMe );
            System.out.println("Current GPA: " + holder.getGradeAverage());
        }
        System.out.println("Would you like to continue?");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
            matchUser(stds);
        } else {
            System.out.println("Goodbye");
            System.exit(0);
        }
    }

    public static void getStudentNames(HashMap x) {
        System.out.println("----------------");
        System.out.println("Here are the GitHub usernames of our students: ");
        Object[] arr = x.keySet().toArray();
        for (Object key : arr) {
            System.out.print(String.format( " " + key + " %n"));
            names.add(key);
        }
        System.out.println("----------------");
    }

    public static void main(String[] args){

            //TODO: Inside the main method, create a HashMap named students. It should have keys that are
            // strings that represent github usernames, and values that are Student objects.
            HashMap<String, Student> students = new HashMap<>();


            //TODO: Create at least 4 Student objects with at least 3 grades each, and add them to the map.
            Student shaun = new Student("Shaun", new ArrayList<>(Arrays.asList(88, 85, 87, 94)));
            Student mike = new Student("Mike", new ArrayList<>(Arrays.asList(77, 89, 98, 92)));
            Student chris = new Student("Chris", new ArrayList<>(Arrays.asList(83, 86, 94, 88)));
            Student quinn = new Student("Quinn", new ArrayList<>(Arrays.asList(95, 97, 98, 100)));

            students.put("ShaunTheBomb", shaun);
            students.put("MikeStrikesFirst", mike);
            students.put("Chrisss", chris);
            students.put("Quin22", quinn);

            //TODO: Print the list of GitHub usernames out to the console, and ask the user which student
            // they would like to see more information about.
            System.out.println("Welcome!");
            getStudentNames(students);

            //TODO: The user should enter a GitHub username (i.e. one of the keys in your map).
            matchUser(students);

//        System.out.println("Would you like to see another student? (y/n)");
//        Scanner scanner = new Scanner(System.in);
//        String userInput = scanner.nextLine();
//        if(userInput.equalsIgnoreCase("y")) {
//            getStudentNames(students);
//            matchUser(students);
//        } else {
//            System.out.println(userInput);
//            System.exit(0);
//        }

        } //end psvm



} //end GradesApplication Class
