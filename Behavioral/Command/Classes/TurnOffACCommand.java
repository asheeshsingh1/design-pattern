package Behavioral.Command.Classes;

import Behavioral.Command.Interface.Command;

public class TurnOffACCommand implements Command{

    AC ac;

    TurnOffACCommand(AC ac){
        this.ac = ac;
    }
    
    @Override
    public void execute() {
        System.out.println("AC has been turned Off.");
    }
    
}
