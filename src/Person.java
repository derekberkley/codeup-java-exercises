package src;


public class Person {

    //TODO: Create Person class inside of src that has a private name field that is a string.
    private String name;

    //TODO: The class should have a constructor that accepts a `String` value and set
    // the person's name to the passed string.
    public Person(String newName) {
        name = newName;
    }

    public String getName(){
    //TODO: return the person's name
        return name;
    }

    public void setName(String changeName){
    //TODO: change the name field to the passed value
        this.name = changeName;
    }
    public void sayHello(){
    //TODO: print a message to the console using the person's name
        System.out.println("Hello, (changed name): " + name);
    }




    //TODO: Create a `main` method on the class that creates a new `Person` object and
    // tests the above methods.
    public static void main(String[] args)  {
        //Person() creates a new instance (object) of the Person class
        Person derek = new Person("Derek");

        //getName is a constructor and is necessary to access the PRIVATE name variable
        System.out.println(derek.getName());

        //setName is a method and therefore accessible by dot notation
        derek.setName("Steph");

        //sayHello() is another method and runs after the name is changed
        derek.sayHello();

//Explanation: person 1 and 2 are stored as different INSTANCES of the person class
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        //getName and equals compares strings and NOT the actual object instance
//        System.out.println(person1.getName().equals(person2.getName())); //true
//        // equals compares the storage reference number for each object instance (NOT equal)
//        System.out.println(person1 == person2); //false

//Explanation: person 2 refers to person 1's instance data storage location and therefore has
        //access to all of its properties
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        // this is basically saying something is equal to itself
//        System.out.println(person1 == person2); //true

//Explanation: person 2 points to person 1's data storage location
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        //these are both pointing to the same object instance
//        System.out.println(person1.getName()); //John
//        System.out.println(person2.getName());//John
//        //person 2 is used as a pathway to re-set the name at this object instance and therefore
//        //changes person 1 as well since person 2 is NOT it's own object instance.
//        person2.setName("Jane");
//        System.out.println(person1.getName()); //Jane
//        System.out.println(person2.getName()); //Jane



    }






} //end class Person
