package Behavioral.Chain.Classes;

import Behavioral.Chain.Interface.LogProcessor;

public class Main {
    public static void main(String[] args) {
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.ERROR, "Error Message");
        logObject.log(LogProcessor.DEBUG, "Debug Message");
        logObject.log(LogProcessor.INFO, "Info Message");

    }
}
