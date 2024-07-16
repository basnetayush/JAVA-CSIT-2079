package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello 1");
        System.out.println("Hello 2");
        System.out.println("Hello 3");
        System.out.println("Hello 4");
        /*
        * when exception occurrs, statement below this will not execute
        * such case should not happen, hence we need to handle it.
        * */
        if (true) throw new RuntimeException("Exception aayo");


        System.out.println("Hello 5");
        System.out.println("Hello 6");
        System.out.println("Hello 7");
        System.out.println("Hello 8");
    }
}
