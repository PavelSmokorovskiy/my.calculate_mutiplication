package mutiplication;

import mutiplication.service.Calculator;
import mutiplication.service.ConsoleScanner;
import mutiplication.service.impl.CalculatorScratchAlgorithmImpl;
import mutiplication.service.impl.CalculatorSimpleAlgorithmImpl;
import mutiplication.service.impl.ConsoleScannerImpl;

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
        String lineFirst = consoleScanner.getConsoleInput();
        String lineSecond = consoleScanner.getConsoleInput();
        logger.log(Level.INFO, lineFirst);
        logger.log(Level.INFO, lineSecond);

        String res1 = calculatorSimpleAlgorithm.multiply(lineFirst, lineSecond);
        String res2 = calculatorScratchAlgorithm.multiply(lineFirst, lineSecond);
        logger.log(Level.INFO, res1);
        logger.log(Level.INFO, res2);

    }
}
