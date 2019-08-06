package mutiplication.service.impl;

import mutiplication.service.ConsoleScanner;

import java.util.Scanner;

public class ConsoleScannerImpl implements ConsoleScanner {

    @Override
    public String getConsoleInput() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
