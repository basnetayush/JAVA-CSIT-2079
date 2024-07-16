package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * try{
 * // block of code / statements where checked exception might occur
 *     FileReader fileReader = new FileReader(file);
 * }catch(FileNotFoundException ex){
 *       // implement how to handle when File is not found
 * }
 * */

public class CheckedExceptionTryCatchExample {

    public static void main(String[] args) {
        readFile();
    }
    public static void readFile(){
        File file=new File("/abc.txt");
        try {
            // exception thrown by new FileReader(file) is enforced by compiler to handle it in compile time
            // is not handled code will not be compiled
            System.out.println("I am in try block");
            FileReader fileReader = new FileReader(file);

            // other processing
        }
        // when using multiple catch block, always catch from specific to generic
        catch (FileNotFoundException ex){ // this catch block will only catch FileNotFoundException
            System.out.println("File specified is not found");
            System.out.println("Processing Error");
            System.out.println("Processing Error Completed");
        }catch (Exception e){
            System.out.println("This will handle all other exception not catched by FileNotFoundException ");
        }

        finally {
            /*
            *  1) when System.exit is called explicitly in either try or catch block, finally will not execute
            *   System.exit(0);
            *
            *  2) If application crashes automatically when executing in either try or catch block, finally will
            *   not execute.
            * */
            System.out.println("This block will always execute");
        }
        System.out.println("This is executed even if exception occurs");
    }
}
