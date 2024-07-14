package oops.abstraction.interfaceexample;

public interface WebSiteMaker {

    default void defaultMethod(){
        System.out.println("This is default Method");
    }

    default void defaultMethod2(){
        System.out.println("This is default Method 2 ");
    }

    void makeWebSite(); // just declaration
}
