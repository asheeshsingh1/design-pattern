package Behavioral.Command.Classes;

public class AC {

    int temperature;
    boolean status;

    public void turnOnAC(){
        status = true;
    }

    public void turnOffAC(){
        status = false;
    }

    public void setTemprature(int temperature){
        this.temperature = temperature;
        System.out.println("Temperature changed to: " + this.temperature);
    }
}
