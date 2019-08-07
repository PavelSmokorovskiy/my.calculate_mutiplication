package mutiplication;

import mutiplication.service.Calculator;
import mutiplication.service.ConsoleScanner;
import mutiplication.service.impl.CalculatorScratchAlgorithmImpl;
import mutiplication.service.impl.CalculatorSimpleAlgorithmImpl;
import mutiplication.service.impl.ConsoleScannerImpl;

import static java.lang.System.out;

public class Main {

    private ConsoleScanner consoleScanner = new ConsoleScannerImpl();
    private Calculator calculatorSimpleAlgorithm = new CalculatorSimpleAlgorithmImpl();
    private Calculator calculatorScratchAlgorithm = new CalculatorScratchAlgorithmImpl();

    public static void main(String... args) {

        String result = "";
        if (args.length >= 3) {
            String lineFirst = args[1];
            String lineSecond = args[2];
            switch (args[0]) {
                case "--alg1":
                    result = new Main().runSimpleAlgorithmCase(lineFirst, lineSecond);
                    break;
                case "--alg2":
                    result = new Main().runScratchAlgorithmCase(lineFirst, lineSecond);
                    break;
                default:
                    result = new Main().runConsoleInputCase();
                    break;
            }
        } else result = new Main().runConsoleInputCase();

        out.println(result);
    }

    private String runSimpleAlgorithmCase(String lineFirst, String lineSecond) {

        return calculatorSimpleAlgorithm.multiply(lineFirst, lineSecond);
    }

    private String runScratchAlgorithmCase(String lineFirst, String lineSecond) {

        return calculatorScratchAlgorithm.multiply(lineFirst, lineSecond);
    }

    private String runConsoleInputCase() {

        String lineFirst = consoleScanner.getConsoleInput();
        String lineSecond = consoleScanner.getConsoleInput();
        return calculatorScratchAlgorithm.multiply(lineFirst, lineSecond);
    }
}
