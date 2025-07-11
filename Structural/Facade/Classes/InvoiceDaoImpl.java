package Structural.Facade.Classes;

import Structural.Facade.Interface.InvoiceDao;

public class InvoiceDaoImpl implements InvoiceDao{

    @Override
    public void generateInvoice() {
       System.out.println("Invoice has been generated");
    }
    
}
