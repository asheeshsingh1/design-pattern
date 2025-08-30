package Behavioral.Template.Interface;

public abstract class PaymentFlow {
    public abstract void validatePayment();
    public abstract void calculateFee();
    public abstract void debitSender();
    public abstract void creditReceiver();

    public final void sendMoney(){
        // Step 1
        validatePayment();

        // Step 2
        calculateFee();

        // Step 3
        debitSender();

        // Step 4
        creditReceiver();
    }
}
