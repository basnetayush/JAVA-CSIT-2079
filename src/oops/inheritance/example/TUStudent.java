package oops.inheritance.example;

public class TUStudent {
    private String regNo;

    public TUStudent(String regNo) {
        System.out.println("Parameterized Constructor of TUStudent");
        this.regNo = regNo;
    }

    public TUStudent() {
        System.out.println("TUStudent Constructor");
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public void giveExamInTime(){
        System.out.println("Cannot conduct exam in time..");
    }
}
