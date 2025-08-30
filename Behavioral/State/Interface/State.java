package Behavioral.State.Interface;

import java.util.List;

import Behavioral.State.Classes.Item;
import Behavioral.State.Classes.Money;
import Behavioral.State.Classes.VendingMachine;

public interface State {
    public void pressInertCashButton(VendingMachine machine) throws Exception;
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;
    public void inertMoney(VendingMachine machine, Money money) throws Exception;
    public void selectProduct(VendingMachine machine,int codeNumber) throws Exception;
    public Item dispenseProduct(VendingMachine machine,int codeNumber) throws Exception;
    public int returnChange(int returnExtraMoney) throws Exception;
    public List<Money> getFullRefund(VendingMachine machine) throws Exception;
    public void updateInventory(VendingMachine machine,Item item,int codeNumber) throws Exception;
}
