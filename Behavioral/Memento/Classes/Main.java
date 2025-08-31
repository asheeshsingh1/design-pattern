package Behavioral.Memento.Classes;

public class Main {
    public static void main(String[] args) {
        ConfigurationCareTaker careTaker = new ConfigurationCareTaker();
        ConfigurationOriginator originator = new ConfigurationOriginator(5, 10);

        // Save and update history
        ConfigurationMemento snapshot1 = originator.createMemento();
        careTaker.addMemento(snapshot1);

        originator.setHeight(10);
        originator.setWidth(20);

        ConfigurationMemento snapshot2 = originator.createMemento();
        careTaker.addMemento(snapshot2);

        originator.setHeight(20);
        originator.setWidth(40);

        ConfigurationMemento mementoRestored = careTaker.undo();
        originator.restoreMemento(mementoRestored);

        System.out.println("Height: " + originator.height);
        System.out.println("Width: " + originator.width);
    }
}
