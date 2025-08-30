package Behavioral.Command.Classes;

public class Main {
    public static void main(String[] args) {
        
        AC ac = new AC();
        Remote remote = new Remote();

        remote.setCommand(new TurnOnACCommand(ac));
        remote.pressButton();

        remote.setCommand(new TurnOffACCommand(ac));
        remote.pressButton();
    }
}
