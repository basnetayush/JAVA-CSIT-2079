package exceptionhandling;

import java.util.zip.DataFormatException;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            isEven(3);
        } catch (DataFormatException e) {
            System.out.println(e.getMessage());
        }
    }
    /*
    * if we throw unchecked exception, we do not need to declare throws
    *  but if we throw checked exception, we need to declare in throws
    * */
    public static  void isEven(int num) throws DataFormatException,NullPointerException{
        if(num%2==0){
            System.out.println(num +" is even");
        }else {
            throw new DataFormatException(num + " is not even");
        }
    }
}
