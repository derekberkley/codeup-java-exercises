package src.carShop;

public class Customer implements Describable {

    //TODO: Inside carShop create another class called Customer and make instance fields that can't be accessed
    // outside Customer, these fields should be string called firstName and lastName. Create a constructor that
    // sets firstName and lastName. Write getters and setters for each property.

    private String firstName;
    private String lastName;

 public Customer(String a, String b) {
     this.firstName = a;
     this.lastName = b;
 }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String describe(String details) {
        return details;
 }
} //end Customer class
