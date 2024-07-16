package oops.abstraction.interfaceexample;

public class PHPWebSiteMaker implements WebSiteMaker {
    @Override
    public void makeWebSite() { // implementation
        System.out.println("I make website in PHP");
    }
}
