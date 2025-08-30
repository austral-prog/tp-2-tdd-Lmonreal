package com.tp2.stringcalculator;

import java.util.List;

public class StringCalculator {
    
    public int fullStringAdder(String string) {
        if (!string.isEmpty()) {
            if (!string.contains("-")) {
                try {
                    return Integer.parseInt(string);
                } catch (NumberFormatException e) {
                    return hasCommaOrNewline(string);
                }
            }
            else {
                throw new IllegalArgumentException("Parameter cannot contain negative numbers.");
            }
        }
        return 0;
    }

    public int hasCommaOrNewline(String string) {
        if (string.contains(",")) {
            return commaSeparatedAdder(string);
        }
        else if (string.contains("\n")) {
            return newlineSeparatedAdder(string);
        }
        else {
            return 0;
        }
    }

    public int commaSeparatedAdder(String string) {
        List<String> inputNumberArray = List.of(string.split(","));
        int totalSum = 0;
        for (String itemNumber : inputNumberArray) {
            totalSum += fullStringAdder(itemNumber);
        }
        return totalSum;
    }

    public int newlineSeparatedAdder(String string) {
        List<String> inputNumberArray = List.of(string.split("\n"));
        int totalSum = 0;
        for (String itemNumber : inputNumberArray) {
            totalSum += fullStringAdder(itemNumber);
        }
        return totalSum;
    }
}
