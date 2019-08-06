package mutiplication;

import mutiplication.service.Calculator;
import mutiplication.service.ConsoleScanner;
import mutiplication.service.impl.CalculatorScratchAlgorithmImpl;
import mutiplication.service.impl.CalculatorSimpleAlgorithmImpl;
import mutiplication.service.impl.ConsoleScannerImpl;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private Logger logger = Logger.getLogger(Main.class.getName());

    private ConsoleScanner consoleScanner = new ConsoleScannerImpl();
    private Calculator calculatorSimpleAlgorithm = new CalculatorSimpleAlgorithmImpl();
    private Calculator calculatorScratchAlgorithm = new CalculatorScratchAlgorithmImpl();

    public static void main(String[] args) {

        new Main().run();
    }

    private void run() {
        String firstLine = consoleScanner.getConsoleInput();
        String secondLine = consoleScanner.getConsoleInput();
        logger.log(Level.INFO, firstLine);
        logger.log(Level.INFO, secondLine);

        BigInteger res = calculatorSimpleAlgorithm.multiply(firstLine, secondLine);
        System.out.println(res);

    }
}
