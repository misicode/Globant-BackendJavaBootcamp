package org.amincia._02JUnit.P102;

public class TemperatureConverter {
    /**
     * This method converts degrees Celsius to degrees Fahrenheit.
     * @param celsius       degrees Celsius
     * @return              equivalent degrees Fahrenheit
     */
    public double convertCelsiusToFahrenheit(double celsius) {
        return Math.round((celsius * 9 / 5 + 32) * 1000D) / 1000D;
    }

    /**
     * This method converts degrees Celsius to degrees Kelvin.
     * @param celsius       degrees Celsius
     * @return              equivalent degrees Kelvin
     */
    public double convertCelsiusToKelvin(double celsius) {
        return Math.round((celsius + 273.15) * 1000D) / 1000D;
    }

    /**
     * This method converts degrees Fahrenheit to degrees Celsius.
     * @param fahrenheit    degrees Fahrenheit
     * @return              equivalent degrees Celsius
     */
    public double convertFahrenheitToCelsius(double fahrenheit) {
        return Math.round(((fahrenheit - 32) * 5 / 9) * 1000D) / 1000D;
    }

    /**
     * This method converts degrees Fahrenheit to degrees Kelvin.
     * @param fahrenheit    degrees Fahrenheit
     * @return              equivalent degrees Kelvin
     */
    public double convertFahrenheitToKelvin(double fahrenheit) {
        return Math.round(((fahrenheit - 32) * 5 / 9 + 273.15) * 1000D) / 1000D;
    }

    /**
     * This method converts degrees Kelvin to degrees Celsius.
     * @param kelvin        degrees Kelvin
     * @return              equivalent degrees Celsius
     */
    public double convertKelvinToCelsius(double kelvin) {
        return Math.round((kelvin - 273.15) * 1000D) / 1000D;
    }

    /**
     * This method converts degrees Kelvin to degrees Fahrenheit.
     * @param kelvin        degrees Kelvin
     * @return              equivalent degrees Fahrenheit
     */
    public double convertKelvinToFahrenheit(double kelvin) {
        return Math.round(((kelvin - 273.15) * 9 / 5 + 32) * 1000D) / 1000D;
    }
}
