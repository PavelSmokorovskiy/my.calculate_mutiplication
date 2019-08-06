package mutiplication.service.impl;

import mutiplication.service.Calculator;

import java.math.BigInteger;

public class CalculatorSimpleAlgorithmImpl implements Calculator {

    @Override
    public String multiply(String firstNumber, String secondNumber) {

        BigInteger firstIntNumber = new BigInteger(firstNumber);
        BigInteger secondIntNumber = new BigInteger(secondNumber);

        return firstIntNumber.multiply(secondIntNumber).toString();
    }
}
