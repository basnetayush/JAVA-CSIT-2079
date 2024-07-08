package oops.inheritance.example;

/*
* When creating object of TexasStudent, it also creates object of TUStudent
* */
public class TexasStudent extends TUStudent{

    public TexasStudent(){}

    public TexasStudent(String regNo){
        super(regNo); // call parent constructor to set inherited value
//        this.regNo=regNo;
    }
}
