package com.tp2.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PasswordValidatorTest {

    // TODO: Replace these lines with your tests
    @Test
    public void lessThan8CharsTest(){
        PasswordValidator passwordValidator = new PasswordValidator();
        assertFalse(passwordValidator.passwordLength("test"));
    }

    @Test
    public void atLeast8CharsTest(){
        PasswordValidator passwordValidator = new PasswordValidator();
        assertTrue(passwordValidator.passwordLength("thisIsLongerThanEightChars"));
    }

    @Test
    public void uppercaseCheckTest(){
        PasswordValidator passwordValidator = new PasswordValidator();
        assertTrue(passwordValidator.containsUppercase("Asingleuppercase"));
        assertFalse(passwordValidator.containsUppercase("nouppercase"));
    }

    @Test
    public void lowerCheckTest(){
        PasswordValidator passwordValidator = new PasswordValidator();
        assertTrue(passwordValidator.containsLowercase("aSINGLELOWERCASE"));
        assertFalse(passwordValidator.containsLowercase("NOLOWERCASE"));
    }

    @Test
    public void containsNumberTest(){
        PasswordValidator passwordValidator = new PasswordValidator();
        assertTrue(passwordValidator.containsNumber("Password2"));
        assertFalse(passwordValidator.containsNumber("Password"));
    }

    @Test
    public void containsSpecialCharacterTest(){
        PasswordValidator passwordValidator = new PasswordValidator();
        assertTrue(passwordValidator.containsSpecialChar("Password?"));
        assertFalse(passwordValidator.containsSpecialChar("Password"));
    }

    @Test
    public void validPasswordTest(){
        PasswordValidator passwordValidator = new PasswordValidator();
        assertTrue(passwordValidator.isValid("Abcdefg1!"));
        assertFalse(passwordValidator.isValid("Abcdefg1"));
    }
}
