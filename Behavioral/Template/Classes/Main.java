package Behavioral.Template.Classes;

import Behavioral.Template.Interface.PaymentFlow;

public class Main {
    public static void main(String[] args) {
        PaymentFlow paymentFlowObject = new PayToFriend();
        paymentFlowObject.sendMoney();

        PaymentFlow paymentFlowObject2 = new PayToMerchant();
        paymentFlowObject2.sendMoney();
    }
}
