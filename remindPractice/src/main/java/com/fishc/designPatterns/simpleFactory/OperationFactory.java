package com.fishc.designPatterns.simpleFactory;

public class OperationFactory {


    public static Operation createOperation(String operate) {

        Operation operation = null;

        switch(operate) {
            case "+" :
                operation = new OperaitonAdd();
                break;
            case "-" :
                operation = new OperationSubtract();
                break;
            case "*" :
                operation = new OperationMultiplying();
                break;
            case "/" :
                operation = new OperationDivided();
                break;
        }

        return operation;

    }
}
