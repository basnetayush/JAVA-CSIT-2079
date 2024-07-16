package oops.classobject;

public class Student {
    // attributes
        String name;
        String faculty;

    // behaviour
    public void code(){
        System.out.println("Student code");
    }
    public void read(){
        System.out.println("Student read");
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Ram";
        s1.faculty="CSIT";

        System.out.println(s1.name);
        System.out.println(s1.faculty);
        s1.code();


        int i; // declaration
        i=5; // intilization
    }

}
