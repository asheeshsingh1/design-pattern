package Behavioral.State.Classes.Implementation;

import java.util.List;

import Behavioral.State.Classes.Item;
import Behavioral.State.Classes.Money;
import Behavioral.State.Classes.VendingMachine;
import Behavioral.State.Interface.State;

public class SelectionState implements State{

    @Override
    public void pressInertCashButton(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pressInertCashButton'");
    }

    @Override
    public void inertMoney(VendingMachine machine, Money money) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inertMoney'");
    }

    @Override
    public void selectProduct(VendingMachine machine, int codeNumber) throws Exception{

        //1. get item of this codeNumber
        Item item = machine.getInventory().getItem(codeNumber);

        //2. total amount paid by User
        int paidByUser = 0;
        for(Money money : machine.gettMoneyList()){
            paidByUser = paidByUser + money.value;
        }

        //3. compare product price and amount paid by user
        if(paidByUser < item.getPrice()) {
            System.out.println("Insufficient Amount, Product you selected is for price: " + item.getPrice() + " and you paid: " + paidByUser);
            getFullRefund(machine);
            throw new Exception("insufficient amount");
        }
        else if(paidByUser >= item.getPrice()) {

            if(paidByUser > item.getPrice()) {
                returnChange(paidByUser-item.getPrice());
            }
            machine.setVendingMachineState(new DispenseState(machine, codeNumber));
        }
    }


    @Override
    public Item dispenseProduct(VendingMachine machine,int codeNumber) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispenseProduct'");
    }

    @Override
    public int returnChange(int returnExtraMoney) throws Exception {
        System.out.println("Return extra money: " + returnExtraMoney);
        return returnExtraMoney;
    }

    @Override
    public List<Money> getFullRefund(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFullRefund'");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateInventory'");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clickOnStartProductSelectionButton'");
    }
    
}
