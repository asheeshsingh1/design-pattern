package Behavioral.State.Classes;

import java.util.ArrayList;
import java.util.List;

import Behavioral.State.Classes.Implementation.IdleState;
import Behavioral.State.Interface.State;

public class VendingMachine {

    private State vendingMachineState;
    private Inventory inventory;
    private List<Money> moneyList;

    public VendingMachine(){
        vendingMachineState = new IdleState();
        inventory = new Inventory(10);
        moneyList = new ArrayList<>();
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState){
        this.vendingMachineState = vendingMachineState;
    }

    public void setMoneyList(List<Money> moneyList){
        this.moneyList = moneyList;
    }

    public List<Money> gettMoneyList(){
        return moneyList;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

}
