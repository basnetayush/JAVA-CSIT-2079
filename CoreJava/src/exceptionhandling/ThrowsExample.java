package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
* Throws ::
*
* */
public class ThrowsExample {

    public static void main(String[] args) throws FileNotFoundException {
        // since readFile throws an Exception, main need to handle it
        // it can either do try-catch or it can also throw the exception to calling class/method
        // at end if no one handles it, JVM will handle it.
        readFile();
    }

    /*
    * ma yo exception handle gardina
    * jasle mero code use garcha tesle aafae garcha
    * now this method will declare the exception that it will throw after throws keyword in method signature
    * */
    public static void readFile() throws FileNotFoundException {
        File file=new File("/abc.txt");
        FileReader fileReader = new FileReader(file);
        System.out.println("This is executed even if exception occurs");
    }
}
