package src;

public class Practice {

    public static void main(String[] args) {
        String changeMe = "hello codeup!";

        changeString(changeMe);

        System.out.println(changeMe);

    } //end psvm



// This doesn't have a return statement, it doesn't permanently change the variable.
    // this only reassigns the storage location as the s-String below w/in this method.

    public static void changeString (String s) {
        s = "Wub a lub a dub dub";
    } //End changeString







} //end Practice Class
