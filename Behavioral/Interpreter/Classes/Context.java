package Behavioral.Interpreter.Classes;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String,Integer> contextMap = new HashMap<>();

    public void put(String key, int value){
        contextMap.put(key, value);
    }

    public int get(String key){
        if(!contextMap.containsKey(key)){
            System.out.println("Expression not present.");
            return 0;
        }
        return contextMap.get(key);
    }
}
