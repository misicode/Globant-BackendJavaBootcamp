package com.misicode._02JUnit.Exercises.P103;

import java.util.regex.Pattern;

public class PasswordValidator {
    /**
     * This method validates that the password entered is at least 6 characters long,
     * has at least one lowercase letter, one uppercase letter, and one special character.
     * @param password  password to validate
     * @return          whether the password is valid or not
     */
    public boolean validatePassword(String password) {
        return Pattern.matches("^.*(?=.{6,})(?=.+[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$", password);
    }
}
