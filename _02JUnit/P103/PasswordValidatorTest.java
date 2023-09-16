package _02JUnit.P103;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    PasswordValidator passwordValidator;

    @BeforeEach
    void initPasswordValidatorTest() {
        passwordValidator = new PasswordValidator();
    }

    @Test
    @DisplayName("Verify a valid password")
    void verifyValidPassword() {
        boolean isValidPsw = passwordValidator.validatePassword("Hello12#");
        assertTrue(isValidPsw);
    }

    @Test
    @DisplayName("Verify minimum password length")
    void verifyMinPasswordLength() {
        boolean isValidPsw = passwordValidator.validatePassword("Hi12#");
        assertFalse(isValidPsw);
    }

    @Test
    @DisplayName("Verify password with at least one lowercase character")
    void verifyPasswordLowerCaseCharacter() {
        boolean isValidPsw = passwordValidator.validatePassword("HELLO12#");
        assertFalse(isValidPsw);
    }

    @Test
    @DisplayName("Verify password with at least one uppercase character")
    void verifyPasswordUpperCaseCharacter() {
        boolean isValidPsw = passwordValidator.validatePassword("hello12#");
        assertFalse(isValidPsw);
    }

    @Test
    @DisplayName("Verify password with at least one special character")
    void verifyPasswordSpecialCharacter() {
        boolean isValidPsw = passwordValidator.validatePassword("Hello120");
        assertFalse(isValidPsw);
    }
}