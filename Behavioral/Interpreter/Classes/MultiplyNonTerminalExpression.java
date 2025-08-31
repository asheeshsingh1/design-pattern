package Behavioral.Interpreter.Classes;

import Behavioral.Interpreter.Interface.AbstractExpression;

public class MultiplyNonTerminalExpression implements AbstractExpression{

    AbstractExpression leftExpression;
    AbstractExpression rightExpression;

    MultiplyNonTerminalExpression(AbstractExpression leftExpression, AbstractExpression rightExpression){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpreter(Context context) {
        return leftExpression.interpreter(context) * rightExpression.interpreter(context);
    }
    
}
