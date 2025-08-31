package Behavioral.Memento.Classes;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
    List<ConfigurationMemento> history = new ArrayList<>();

    public void addMemento(ConfigurationMemento configurationMemento){
        history.add(configurationMemento);
    }

    public ConfigurationMemento undo(){
        if(!history.isEmpty()){
            int index = history.size() - 1;
            ConfigurationMemento memento = history.get(index);
            history.remove(index);
            return memento;
        }
        return null;
    }
}
