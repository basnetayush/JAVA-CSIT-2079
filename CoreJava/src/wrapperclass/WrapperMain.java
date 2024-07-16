package wrapperclass;

/*
 * Java is a OOP Programming Language
 * Java ma still primitive data type use hune raicha :: java is not 100% object oriented
 *
 *
 * */
public class WrapperMain {
    public static void main(String[] args) {
        // primitive
        int num = 10; // 0
        boolean isActive = false;
        char c = 'C';
        short s=11;
        byte b=12;
        long valiue=1l;
        float floatValue=1f;
        double doubleValue=1d;

        // wraps the primitive data type into object
        Integer num2 = 11; // null
        Boolean isActiveObject=false;
        Character cObject = 'C';
        Short sObject=11;
        Byte bObject=12;
        Long longObject=1l;
        Float floatObject=1f;
        Double doubleObject=1d;

        int x=5;
        Integer y=x;
        takeInt(y);
    }

    public static void takeInt(int num){

    }
}
