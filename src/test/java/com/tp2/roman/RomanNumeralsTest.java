package com.tp2.roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    @Test
    public void simpleNumbersTest() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("I", romanNumerals.convertDecimalToRoman(1));
        assertEquals("V", romanNumerals.convertDecimalToRoman(5));
        assertEquals("X", romanNumerals.convertDecimalToRoman(10));
    }

    @Test
    public void simpleSubtractionTest() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("IV", romanNumerals.convertDecimalToRoman(4));
        assertEquals("IX", romanNumerals.convertDecimalToRoman(9));
    }

    @Test
    public void simpleTensNumbersTest() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("XL", romanNumerals.convertDecimalToRoman(40));
        assertEquals("L", romanNumerals.convertDecimalToRoman(50));
        assertEquals("XC", romanNumerals.convertDecimalToRoman(90));
    }

    @Test
    public void simpleHundredsNumbersTest() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("C", romanNumerals.convertDecimalToRoman(100));
        assertEquals("CD", romanNumerals.convertDecimalToRoman(400));
        assertEquals("D", romanNumerals.convertDecimalToRoman(500));
        assertEquals("CM", romanNumerals.convertDecimalToRoman(900));
    }

    @Test
    public void simpleThousandsNumbersTest() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("M", romanNumerals.convertDecimalToRoman(1000));
        assertEquals("MM", romanNumerals.convertDecimalToRoman(2000));
    }

    @Test
    public void complexNumbersTest() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MCMXCIV", romanNumerals.convertDecimalToRoman(1994));
        assertEquals("MMDXCIII", romanNumerals.convertDecimalToRoman(2593));
        assertEquals("MMMCMXCIX", romanNumerals.convertDecimalToRoman(3999));
    }

}
