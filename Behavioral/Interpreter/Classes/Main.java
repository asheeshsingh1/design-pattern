package Behavioral.Interpreter.Classes;

import Behavioral.Interpreter.Interface.AbstractExpression;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("a", 10);
        context.put("b", 20);
        context.put("c", 70);

        AbstractExpression abstractExpression = new MultiplyNonTerminalExpression(
            new NumberTerminalExpression("a"), 
            new NumberTerminalExpression("c")
        );
        System.out.println(abstractExpression.interpreter(context));
    }   
}
