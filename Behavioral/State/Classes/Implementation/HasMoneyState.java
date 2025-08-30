package Behavioral.State.Classes.Implementation;

import java.util.List;

import Behavioral.State.Classes.Item;
import Behavioral.State.Classes.Money;
import Behavioral.State.Classes.VendingMachine;
import Behavioral.State.Interface.State;

public class HasMoneyState implements State{

    public HasMoneyState(){
        System.out.println("Vending machine is in has money state.");
    }

    @Override
    public void pressInertCashButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void inertMoney(VendingMachine machine, Money money) throws Exception {
        System.out.println("Accepted the money");
        machine.gettMoneyList().add(money);
    }

    @Override
    public Item dispenseProduct(VendingMachine machin,int codeNumber) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispenseProduct'");
    }

    @Override
    public List<Money> getFullRefund(VendingMachine machine) throws Exception {
        System.out.println("Refunded money in money tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.gettMoneyList();
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new SelectionState());
    }


    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateInventory'");
    }

    @Override
    public void selectProduct(VendingMachine machine, int codeNumber) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectProduct'");
    }

    @Override
    public int returnChange(int returnExtraMoney) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnChange'");
    }
    
}
