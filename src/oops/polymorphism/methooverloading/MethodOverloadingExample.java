package oops.polymorphism.methooverloading;

public class MethodOverloadingExample {
    public static void main(String[] args) {
        MethodOverloadingExample e1=new MethodOverloadingExample();
        e1.applyForNationalID();
        e1.applyForNationalID("CIT-11");
        e1.applyForNationalID("CIT-112","PASS-112");
    }

    public void applyForNationalID(){
        System.out.println("has No Document");
    }

    public void applyForNationalID(String citizenship){
        System.out.println("has Citizenship Document");
    }

    public void applyForNationalID(String citizenship,String passport){
        System.out.println("has Citizenship and Passport Document");
    }
}
