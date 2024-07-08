package oops.abstraction.abstractclassexample;

public class EndUser {
    public static void main(String[] args) {
        FonePay fonePay=new ESewa();
        fonePay.scan();
        fonePay.pay(); // deduct from my wallet or khalti

        fonePay=new Khalti();
        fonePay.scan();
        fonePay.pay();
    }
}
