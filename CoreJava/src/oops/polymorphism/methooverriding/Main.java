package oops.polymorphism.methooverriding;

public class Main {
    public static void main(String[] args) {
        Parent p1=new Parent(); // object are created in runtime
        p1.parentMethod(); // parent

        Parent c1=new Child();
        c1.parentMethod(); // child

        c1=new Child2();
        c1.parentMethod(); // child 2

        Child c2=new Child();
        c2.parentMethod(); // child
    }
}
