package src.carShop;

public class DealershipApp {


    public static void main(String[] args) {
        Customer me = new Customer("Derek", "Berkley");
        car truck = new car(me.getFirstName(), me.getLastName(), "tacoma", "toyota", "white", 2019);
        System.out.println(me.describe(String.format("Hello there %s %s, it looks like your %s %s %s %s is ready to go!", me.getFirstName(), me.getLastName(), truck.getYear(), truck.getColor(), truck.getMake(), truck.getModel())));
    }


}
