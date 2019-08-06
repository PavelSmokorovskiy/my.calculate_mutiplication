package mutiplication.service.impl;

import mutiplication.service.Calculator;

public class CalculatorScratchAlgorithmImpl implements Calculator {

    @Override
    public String multiply(String lineFirst, String lineSecond) {

        var lengthFirst = lineFirst.length();
        var lengthSecond = lineSecond.length();
        if (lengthFirst == 0 || lengthSecond == 0)
            return "0";

        int[] resultArr = new int[lengthFirst + lengthSecond];

        var indexFirst = 0;
        var indexSecond = 0;

        for (var i = lengthFirst - 1; i >= 0; i--) {
            var carry = 0;
            var n1 = lineFirst.charAt(i) - '0';
            indexSecond = 0;

            for (var j = lengthSecond - 1; j >= 0; j--) {
                var n2 = lineSecond.charAt(j) - '0';
                var sum = n1 * n2 + resultArr[indexFirst + indexSecond] + carry;
                carry = sum / 10;
                resultArr[indexFirst + indexSecond] = sum % 10;
                indexSecond++;
            }

            if (carry > 0)
                resultArr[indexFirst + indexSecond] += carry;
            indexFirst++;
        }

        var i = resultArr.length - 1;
        while (i >= 0 && resultArr[i] == 0)
            i--;

        if (i == -1)
            return "0";

        StringBuilder result = new StringBuilder();

        while (i >= 0)
            result.append(resultArr[i--]);

        return result.toString();
    }
}
