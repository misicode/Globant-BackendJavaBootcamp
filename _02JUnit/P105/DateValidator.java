package org.amincia._02JUnit.P105;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateValidator {
    static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * This method validate that a date has the correct format.
     * @param date      date to validate
     * @return          whether the date is written correctly or not
     */
    public boolean isValidDate(String date) {
        DATE_FORMAT.setLenient(false);

        try {
            DATE_FORMAT.parse(date);
        } catch (ParseException e) {
            return false;
        }

        return true;
    }
}
