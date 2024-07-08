package oops.abstraction.abstractclassexample;

public abstract class FonePay {

    /// non abstract method
    // child class can use it as provided by parent
    // or can modify it if needed
    public void scan(){
        System.out.println("QR Scanned");
    }

    // abstract method :: must be implemented by child class
    public abstract void pay();
}
