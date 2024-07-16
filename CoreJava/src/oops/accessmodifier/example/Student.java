package oops.accessmodifier.example;

public class Student {
    // can be accessed from anywhere in the application / project
    public String name;

    // can be accessed only within the class
    private Integer semesterFee;

    // can be accessed only within the package :: package private
    Integer age;

    // can be accessed within the package
    // can also be accessed in other packaged within the subclass
    protected Integer phoneNo;


    public void printFee(){
        System.out.println("Fee : " + semesterFee);
    }
}
