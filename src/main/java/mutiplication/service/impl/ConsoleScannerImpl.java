package mutiplication.service.impl;

import mutiplication.service.ConsoleScanner;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsoleScannerImpl implements ConsoleScanner {

    private Logger logger = Logger.getLogger(ConsoleScannerImpl.class.getName());

    @Override
    public String getConsoleInput() {
        Scanner scanner = new Scanner(System.in);
        String number = null;
        try {
            if (!scanner.hasNextBigInteger()) {
                throw new NumberFormatException();
            }
            number = scanner.nextLine();
        } catch (NumberFormatException exception) {
            logger.log(Level.WARNING, scanner.nextLine() + ": wrong number");
            scanner.close();
            System.exit(0);
        }
        return number;
    }
}
