package Behavioral.State.Classes.Implementation;

import java.util.ArrayList;
import java.util.List;

import Behavioral.State.Classes.Item;
import Behavioral.State.Classes.Money;
import Behavioral.State.Classes.VendingMachine;
import Behavioral.State.Interface.State;

public class IdleState implements State{

    public IdleState(){System.out.println("Machine is in Idle state.");}

    public IdleState(VendingMachine machine){
        System.out.println("Machine is in Idle state.");
        machine.setMoneyList(new ArrayList<>());
    }

    @Override
    public void pressInertCashButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void inertMoney(VendingMachine machine, Money money) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inertMoney'");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispenseProduct'");
    }

    @Override
    public List<Money> getFullRefund(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFullRefund'");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.getInventory().addItem(item, codeNumber);
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

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clickOnStartProductSelectionButton'");
    }
    
}
