package Structural.Facade.Classes;

import Structural.Facade.Interface.PaymentDao;

public class PaymentDaoImpl implements PaymentDao{

    @Override
    public void makePayment() {
        System.out.println("Payment Done");
    }
    
}
