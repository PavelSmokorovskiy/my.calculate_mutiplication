package mutiplication;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        new Main().run();
    }

    private void run() {
        String firstNumber = getConsoleInput();
        String secondNumber = getConsoleInput();
        logger.log(Level.INFO, firstNumber);
        logger.log(Level.INFO, secondNumber);

        System.out.println(multiply(firstNumber, secondNumber));

    }

    private String getConsoleInput() {

        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private BigInteger multiply(String firstNumber, String secondNumber) {

        BigInteger firstIntNumber = new BigInteger(firstNumber);
        BigInteger secondIntNumber = new BigInteger(secondNumber);

        return firstIntNumber.multiply(secondIntNumber);
    }
}
