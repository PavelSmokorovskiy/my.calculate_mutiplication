import mutiplication.service.Calculator;
import mutiplication.service.ConsoleScanner;
import mutiplication.service.impl.CalculatorScratchAlgorithmImpl;
import mutiplication.service.impl.CalculatorSimpleAlgorithmImpl;
import mutiplication.service.impl.ConsoleScannerImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestCalculator {

    private Calculator calculatorSimpleAlgorithm = new CalculatorSimpleAlgorithmImpl();
    private Calculator calculatorScratchAlgorithm = new CalculatorScratchAlgorithmImpl();

    @Test
    public void testSimpleAlgorithm() {

        String lineFirst = "12345678901234567890";
        String lineSecond = "11111111111111111111";
        String assertResult = "137174210013717420998628257899862825790";

        String actualResult = calculatorSimpleAlgorithm.multiply(lineFirst, lineSecond);
        assertEquals(assertResult, actualResult);
    }

    @Test
    public void testScratchAlgorithm() {

        String lineFirst = "12345678901234567890";
        String lineSecond = "11111111111111111111";
        String assertResult = "137174210013717420998628257899862825790";

        String actualResult = calculatorScratchAlgorithm.multiply(lineFirst, lineSecond);
        assertEquals(assertResult, actualResult);
    }

}
