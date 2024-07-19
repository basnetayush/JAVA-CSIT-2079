package com.texas.professional;

import com.texas.professional.controller.HelloController;
import com.texas.professional.service.HelloServiceImpl;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

interface FonePay{
    public void pay();
}

@Service
class Esewa implements FonePay {
    public void pay(){
        System.out.println("Pays using ESewa Wallet");
    }
}
@Service
class Khalti implements FonePay {
    public void pay(){
        System.out.println("Pays using Khalti Wallet");
    }
}

/*
* do not create object of dependent class by itself
* instead inject the object from 3rd party class or framework (like Spring) :: pass the dependency from outside
* */
public class EndUser{
    private FonePay fonePay;

    public EndUser(FonePay fonePay) {
        this.fonePay = fonePay;
    }

    public void doOnlinePayment(){
        fonePay.pay();
    }
}

class Main{
    public static void main(String[] args) {

        EndUser endUser=new EndUser(new Esewa());
        endUser.doOnlinePayment();
    }
}
