package oops.abstraction.chargerExample;

public class RedmiChargerImpl implements Charger {
    @Override
    public void charge() {
        System.out.println("I am using Redmi charger to charge my phone");
    }
}
