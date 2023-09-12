package JUnit.P102;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    TemperatureConverter temperatureConverter;

    @BeforeEach
    void initTemperatureConverterTest() {
        temperatureConverter = new TemperatureConverter();
    }

    @Test
    @DisplayName("Convert Celsius to Fahrenheit with positive degrees")
    void testConvertPositiveDegreesCtoF() {
        double degreesF = temperatureConverter.convertCelsiusToFahrenheit(12);
        assertEquals(53.6, degreesF);
    }

    @Test
    @DisplayName("Convert Celsius to Fahrenheit with negative degrees")
    void testConvertNegativeDegreesCtoF() {
        double degreesF = temperatureConverter.convertCelsiusToFahrenheit(-12);
        assertEquals(10.4, degreesF);
    }

    @Test
    @DisplayName("Convert Celsius to Kelvin with positive degrees")
    void testConvertPositiveDegreesCtoK() {
        double degreesK = temperatureConverter.convertCelsiusToKelvin(12);
        assertEquals(285.15, degreesK);
    }

    @Test
    @DisplayName("Convert Celsius to Kelvin with negative degrees")
    void testConvertNegativeDegreesCtoK() {
        double degreesK = temperatureConverter.convertCelsiusToKelvin(-12);
        assertEquals(261.15, degreesK);
    }

    @Test
    @DisplayName("Convert Fahrenheit to Celsius with positive degrees")
    void testConvertPositiveDegreesFtoC() {
        double degreesC = temperatureConverter.convertFahrenheitToCelsius(120);
        assertEquals(48.889, degreesC);
    }

    @Test
    @DisplayName("Convert Fahrenheit to Celsius with negative degrees")
    void testConvertNegativeDegreesFtoC() {
        double degreesC = temperatureConverter.convertFahrenheitToCelsius(-120);
        assertEquals(-84.444, degreesC);
    }

    @Test
    @DisplayName("Convert Fahrenheit to Kelvin with positive degrees")
    void testConvertPositiveDegreesFtoK() {
        double degreesK = temperatureConverter.convertFahrenheitToKelvin(12);
        assertEquals(262.039, degreesK);
    }

    @Test
    @DisplayName("Convert Fahrenheit to Kelvin with negative degrees")
    void testConvertNegativeDegreesFtoK() {
        double degreesK = temperatureConverter.convertFahrenheitToKelvin(-12);
        assertEquals(248.706, degreesK);
    }

    @Test
    @DisplayName("Convert Kelvin to Celsius with positive degrees")
    void testConvertPositiveDegreesKtoC() {
        double degreesC = temperatureConverter.convertKelvinToCelsius(12);
        assertEquals(-261.15, degreesC);
    }

    @Test
    @DisplayName("Convert Kelvin to Celsius with negative degrees")
    void testConvertNegativeDegreesKtoC() {
        double degreesC = temperatureConverter.convertKelvinToCelsius(-12);
        assertEquals(-285.15, degreesC);
    }

    @Test
    @DisplayName("Convert Kelvin to Fahrenheit with positive degrees")
    void testConvertPositiveDegreesKtoF() {
        double degreesF = temperatureConverter.convertKelvinToFahrenheit(120);
        assertEquals(-243.67, degreesF);
    }

    @Test
    @DisplayName("Convert Kelvin to Fahrenheit with negative degrees")
    void testConvertNegativeDegreesKtoF() {
        double degreesF = temperatureConverter.convertKelvinToFahrenheit(-12);
        assertEquals(-481.27, degreesF);
    }
}