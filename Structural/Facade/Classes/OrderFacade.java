package Structural.Facade.Classes;

public class OrderFacade {
    ProductDaoImpl productDaoImpl;
    InvoiceDaoImpl invoiceDaoImpl;
    PaymentDaoImpl paymentDaoImpl;
    SendNotificationDaoImpl sendNotificationDaoImpl;

    public OrderFacade(){
        productDaoImpl = new ProductDaoImpl();
        invoiceDaoImpl = new InvoiceDaoImpl();
        paymentDaoImpl = new PaymentDaoImpl();
        sendNotificationDaoImpl = new SendNotificationDaoImpl();
    }

    public void createOrder(){
        Product product = productDaoImpl.getProduct(1);
        System.out.println("Placeing Order for: " + product.getProductName());
        paymentDaoImpl.makePayment();
        invoiceDaoImpl.generateInvoice();
        sendNotificationDaoImpl.sendNotification();
    }
}
