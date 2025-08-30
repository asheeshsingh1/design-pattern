package Behavioral.Template.Classes;

import Behavioral.Template.Interface.PaymentFlow;

public class PayToFriend extends PaymentFlow{

    @Override
    public void validatePayment() {
        System.out.println("Payment has been validated for non merchant transaction");
    }

    @Override
    public void calculateFee() {
        System.out.println("Payment fee has been calculated for non merchant transaction");
    }

    @Override
    public void debitSender() {
        System.out.println("Payment has been debited from sender for non merchant transaction");
    }

    @Override
    public void creditReceiver() {
        System.out.println("Payment has been received by receiver for non merchant transaction");
    }
}
