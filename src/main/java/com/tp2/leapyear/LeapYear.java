package com.tp2.leapyear;


public class LeapYear {
    public boolean isLeapYear(int year) {
        return  (isDivisibleByFour(year) && isNotDivisibleByOneHundred(year)) || isDivisibleByFourHundred(year);
    }

    public boolean isDivisibleByFour(int year) {
        return year % 4 == 0;
    }

    public boolean isNotDivisibleByOneHundred(int year) {
        return year % 100 != 0;
    }

    public boolean isDivisibleByFourHundred(int year) {
        return year % 400 == 0;
    }

}
