import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    }

    private String getConsoleInput() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = null;
        try {
            name = reader.readLine();
        } catch (IOException e) {
            logger.log(Level.WARNING, "Wrong input: ", e);
        }
        return name;
    }
}
