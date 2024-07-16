package oops.abstraction.chargerExample;

public class Mobile {
    // do not depend on implementation
    // in this case we cannot use other charger
    //SamungChargerImpl charger;

    Charger charger;

    public Mobile() {
    }

    public Mobile(Charger charger) {
        this.charger = charger;
    }

    public void chargeMobile(){
        System.out.println("Charging Mobile");
        charger.charge();
    }

    public static void main(String[] args) {
            Mobile mobile=new Mobile(new RedmiChargerImpl());
            mobile.chargeMobile();
    }
}
