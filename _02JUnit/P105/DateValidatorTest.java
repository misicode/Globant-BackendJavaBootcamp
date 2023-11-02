package org.amincia._02JUnit.P105;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateValidatorTest {
    DateValidator dateValidator;

    @BeforeEach
    void initDateValidatorTest() {
        dateValidator = new DateValidator();
    }

    @Test
    @DisplayName("Validate the valid format of a date")
    void validateFormatDate() {
        boolean isValid = dateValidator.isValidDate("20/05/1994");
        boolean isInvalid = dateValidator.isValidDate("20-05-1994");

        assertTrue(isValid);
        assertFalse(isInvalid);
    }

    @Test
    @DisplayName("Validate a correct date")
    void validateCorrectDate() {
        boolean isValid = dateValidator.isValidDate("12/05/1994");

        assertTrue(isValid);
    }

    @Test
    @DisplayName("Validate a incorrect date")
    void validateIncorrectDate() {
        boolean isInvalid = dateValidator.isValidDate("35-15-1994");

        assertFalse(isInvalid);
    }

    @Test
    @DisplayName("Validate a empty date")
    void validateEmptyDate() {
        boolean isInvalid = dateValidator.isValidDate("");

        assertFalse(isInvalid);
    }
}