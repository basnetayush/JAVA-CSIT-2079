package oops.abstraction.abstractclassexample;

public class ESewa extends FonePay{

    @Override
    public void scan() {
        System.out.println("My ESewa have own QR Scan Implementation");
    }

    @Override
    public void pay() {
        System.out.println("Deducted from ESewa Wallet");
    }
}
