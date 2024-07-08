package oops.encapsulation;

public class Main {
    public static void main(String[] args) {
        Person p1=new Person(); // default constructor

        Person p2=new Person("Ram",22,"KTM","Male"); // parameterized constructor
        System.out.println(p2.getName());
        walk(p2);
        System.out.println(p2.getName());
    }

    public static void walk(Person p){
//        p.setName("Changed Name");
    p.setAge(17);
    }
}
