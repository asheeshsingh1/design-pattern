package Behavioral.Command.Classes;

import Behavioral.Command.Interface.Command;

public class TurnOnACCommand implements Command{

    AC ac;

    TurnOnACCommand(AC ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("AC has been turned On.");
    }
    
}
