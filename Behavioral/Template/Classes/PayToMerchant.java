package Behavioral.Template.Classes;

import Behavioral.Template.Interface.PaymentFlow;

public class PayToMerchant extends PaymentFlow{

    @Override
    public void validatePayment() {
        System.out.println("Payment has been validated for merchant transaction");
    }

    @Override
    public void calculateFee() {
        System.out.println("Payment fee has been calculated for merchant transaction");
    }

    @Override
    public void debitSender() {
        System.out.println("Payment has been debited from sender for merchant transaction");
    }

    @Override
    public void creditReceiver() {
        System.out.println("Payment has been received by receiver for merchant transaction");
    }
    
}
