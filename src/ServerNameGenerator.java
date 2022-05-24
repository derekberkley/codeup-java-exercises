package src;

public class ServerNameGenerator {

    public static String[] adjectives = {"smart", "funny", "handsome", "witty", "smooth", "tasty", "dumb", "selfish", "graceful", "chubby"};

    public static String[] nouns = {"car", "ship", "desk", "backyard", "phone", "vacation", "fridge", "bbq", "computer", "ballcap"};

    public static String returnEl(String[] array) {
        int element = (int) Math.floor(Math.random()*(10) + 1);
        return array[element];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name:");
        System.out.println(returnEl(adjectives) + "-" + returnEl(nouns));
    }

}
