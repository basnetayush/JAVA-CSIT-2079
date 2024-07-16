package generics;

public class MyGeneric {
    public static void main(String[] args) {
        PrintGeneric<Integer> integerPrintGeneric=new PrintGeneric<>();
        integerPrintGeneric.print(10);

        PrintGeneric<String> stringPrintGeneric=new PrintGeneric<>();
        stringPrintGeneric.print("Hello World");
    }
}

class PrintGeneric<T>{
    public void print(T t){
        System.out.println(t);
    };
}
