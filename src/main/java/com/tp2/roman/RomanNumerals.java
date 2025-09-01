package com.tp2.roman;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanNumerals {

    public String convertDecimalToRoman(int number) {

        StringBuilder convertedNumber = new StringBuilder();
        List<Integer> decimalSystem = Arrays.asList(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1);
        List<String> romanSystem = Arrays.asList("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I");

        for (int i = 0; i < decimalSystem.size(); i++) {
            while (number >= decimalSystem.get(i)) {
                convertedNumber.append(romanSystem.get(i));
                number -= decimalSystem.get(i);
            }
        }
        return convertedNumber.toString();
    }
}