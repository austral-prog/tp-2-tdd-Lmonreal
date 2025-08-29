package com.tp2.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    public void DivisibleByFourTest(){
        LeapYear leapYear = new LeapYear();
        assertTrue(leapYear.isDivisibleByFour(2004));
    }

    @Test
    public void NotDivisibleByOneHundredTest(){
        LeapYear leapYear = new LeapYear();
        assertTrue(leapYear.isNotDivisibleByOneHundred(1700));
    }

    @Test
    public void DivisibleByFourHundredTest(){
        LeapYear leapYear = new LeapYear();
        assertTrue(leapYear.isDivisibleByFourHundred(1600));
    }

    @Test
    public void IsLeapYearTest(){
        LeapYear leapYear = new LeapYear();
        assertTrue(leapYear.isLeapYear(1600));
        assertTrue(leapYear.isLeapYear(2024));
    }
}
