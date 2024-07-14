package oops.abstraction.interfaceexample;

public class JavaWebSiteMaker implements WebSiteMaker {
    @Override
    public void makeWebSite() {
        System.out.println("I make website in Java");
    }

    @Override
    public void defaultMethod() {
        System.out.println("This is my custom default method");
    }
}
