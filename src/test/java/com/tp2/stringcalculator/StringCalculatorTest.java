package com.tp2.stringcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringCalculatorTest {

    // TODO: Replace these lines with your tests
    @Test
    public void emptyStringTest(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.fullStringAdder(""));
    }

    @Test
    public void stringToIntConversionTest(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3,stringCalculator.fullStringAdder("3"));
        assertEquals(0,stringCalculator.fullStringAdder("A2A"));
    }

    @Test
    public void commaSeparatedValuesTest() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(15, stringCalculator.fullStringAdder("2,13"));
        assertEquals(7, stringCalculator.fullStringAdder("2,1,4"));
        assertEquals(5, stringCalculator.fullStringAdder("2A,5"));

    }

    @Test
    public void commaAndNewlineSeparatedValuesTest(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3,stringCalculator.fullStringAdder("2\n1"));
        assertEquals(5,stringCalculator.fullStringAdder("2,1\n2"));
    }

    @Test
    public void negativeNumberExceptionTest(){
        StringCalculator stringCalculator = new StringCalculator();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            stringCalculator.fullStringAdder("-3");
        });
    }

//    Missing tests:
//
//- Empty string should return 0                                      DONE
//- Single number should return that number                           DONE
//- Two numbers separated by comma should return their sum            DONE
//- Multiple numbers separated by comma should return their sum       DONE
//- Numbers separated by newline should work as delimiter             DONE
//- Negative numbers should throw IllegalArgumentException            DONE
}
