public class Person {

    private String name = "Derek";

    public static void main(String[] args)  {
//        getName(name);
//        setName("Berkley");
//        sayHello(name);
    }

    public String getName(String name){
//TODO: return the person's name
        System.out.println(name);
        return name;
    }

    public void setName(String name2){
//TODO: change the name field to the passed value
        name = name2;
        System.out.println(name);
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello" + name);
    }

}
