package oops.inheritance.example;

public class Main {
    public static void main(String[] args) {
        TexasStudent texasStudent=new TexasStudent();
        texasStudent.setRegNo("TU-REG-111");

        System.out.println("Reg No: "+texasStudent.getRegNo());
        texasStudent.giveExamInTime();

        TexasStudent st2=new TexasStudent("TU-REG-222");
        System.out.println(st2.getRegNo());
    }
}
