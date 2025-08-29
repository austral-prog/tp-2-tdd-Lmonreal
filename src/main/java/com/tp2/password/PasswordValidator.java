package com.tp2.password;

import java.util.Arrays;
import java.util.List;

public class PasswordValidator {
    
    public boolean isValid(String password) {
        // TODO: Implement password validation following TDD approach
        // Consider these criteria:
        // - Minimum 8 characters
        // - At least 1 uppercase letter
        // - At least 1 lowercase letter  
        // - At least 1 number
        // - At least 1 special character (!@#$%^&*()_+-=[]{}|;:,.<>?)
        boolean isCorrectLength = passwordLength(password);
        boolean hasUppercase = containsUppercase(password);
        boolean hasLowercase = containsLowercase(password);
        boolean hasNumber = containsNumber(password);
        boolean hasSpecialChar = containsSpecialChar(password);

        return isCorrectLength && hasUppercase && hasLowercase && hasNumber && hasSpecialChar;
    }
    public boolean passwordLength(String password) {
        return password.length() >= 8;
    }

    public boolean containsUppercase(String password) {
        String lowercaseCast = password.toLowerCase();
        return !(lowercaseCast.equals(password));
    }

    public boolean containsLowercase(String password) {
        String uppercaseCast = password.toUpperCase();
        return !(uppercaseCast.equals(password));
    }

    public boolean containsNumber(String password) {
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (Character.isDigit(currentChar)){
                return true;
            }
        }
        return false;
    }

    public boolean containsSpecialChar(String password) {
        List<Character> specialChars = Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '?');
        for (char specialChar : specialChars) {
            if (password.contains(String.valueOf(specialChar))) {
                return true;
            }
        }
        return false;
    }
}
