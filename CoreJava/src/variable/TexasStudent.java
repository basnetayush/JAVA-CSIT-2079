package variable;

/*
 * instance variable
 * local variable
 * global variable
 *
 * */
public class TexasStudent {
    // scope within the class
    private String name; // instance variable

    // final make it constant
    public final static String college="Texas Intl College";

    public TexasStudent() {
    }

    public TexasStudent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        int num = 5; // local variable
        // scope only within the method
        System.out.println(num);
        System.out.println(name);
    }

    public void code(){
        System.out.println(name +" is coding...");
    }

    public static void main(String[] args) {
        TexasStudent t1 = new TexasStudent("Ram");
        System.out.println(t1.getName());
        System.out.println(TexasStudent.college);

        TexasStudent t2 = new TexasStudent("Shyam");
        System.out.println(t2.getName());

        // cannot change final value once assigned
        // TexasStudent.college="Shyam College";

        System.out.println(TexasStudent.college);

    }

    public static void helloWorld(){
        System.out.println("Hello World from here...");
    }
}
