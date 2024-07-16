package oops.abstraction.abstractclassexample;

public class EndUser {
    FonePay fonePay;

    public EndUser() {
    }

    public EndUser(FonePay fonePay) {
        this.fonePay = fonePay;
    }

    public void doOnlinePayment(){
        fonePay.scan();
        fonePay.pay();
    }

    public static void main(String[] args) {
//       EndUser endUser=new EndUser(new Khalti());
//       endUser.doOnlinePayment();

        EndUser e1=new EndUser(new ESewa()); // need esewa
        e1.doOnlinePayment();

        EndUser e2=new EndUser(new Khalti()); // need khalti
        e2.doOnlinePayment();


//       FonePay f1=new Khalti();
//       f1.pay();
//       f1=new ESewa();
//       f1.pay();
    }
}
