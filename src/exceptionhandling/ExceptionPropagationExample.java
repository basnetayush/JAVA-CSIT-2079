package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionPropagationExample {
    public static void main(String[] args) throws FileNotFoundException {
            ExceptionPropagationExample example=new ExceptionPropagationExample();
            example.c();
    }

    public void c() throws FileNotFoundException {
        b();
    }

    public void b() throws FileNotFoundException {
        a();
    }

    public void a() throws FileNotFoundException {
        File file=new File("/abc.txt");
        FileReader fileReader = new FileReader(file);
        System.out.println("This is executed even if exception occurs");
    }
}
