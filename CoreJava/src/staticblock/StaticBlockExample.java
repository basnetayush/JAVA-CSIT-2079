package staticblock;

public class StaticBlockExample {
    private static String staticVariable;

    /*
    * static block is loaded before any other method / class
    * it can be used to initialize static variables.
    * */
    static {
        System.out.println("Static Block Loaded");
        staticVariable="I am Static Variable";
    }

    static {
        System.out.println("Static Block 2 Loaded");
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(staticVariable);
    }
}
