package Behavioral.Interpreter.Classes;

import Behavioral.Interpreter.Interface.AbstractExpression;

public class NumberTerminalExpression implements AbstractExpression{

    String stringValue;

    NumberTerminalExpression(String stringValue){
        this.stringValue = stringValue;
    }

    @Override
    public int interpreter(Context context) {
        return context.get(stringValue);
    }
    
}
