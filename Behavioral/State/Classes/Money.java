package Behavioral.State.Classes;

public enum Money {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25);

    public int value;

    Money(int value) {
        this.value = value;
    }

}
