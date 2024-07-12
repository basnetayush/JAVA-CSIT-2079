package finalexample;

 class A{
    public final   void myMethod(){
        System.out.println("A final Method");
    }
}

// if class is final it cannot be inherited / extended / sub classed
class B extends A{
    /// cannot be overide by sub class
//    public final  void myMethod(){
//        System.out.println("A final Method");
//    }
}

/*
* Final Variable :: cannot be changed once assigned
* Final Method :: cannot be overridden by subclass
* Final Class :: cannot be inherited
* */

public class FinalMain {

    public static void main(String[] args) {
        /* final Varibale */
        final int num = 13;
        // num=12; // cannot be assigned again
    }
}
