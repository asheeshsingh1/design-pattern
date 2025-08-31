package Behavioral.Memento.Classes;

import Behavioral.Memento.Interface.Memento;

public class ConfigurationMemento implements Memento{
    int height;
    int width;

    ConfigurationMemento(int height,int width){
        this.height = height;
        this.width = width;
    }

    @Override
    public int getHeight(){
        return height;
    }

    @Override
    public int getWidth(){
        return height;
    }
}
