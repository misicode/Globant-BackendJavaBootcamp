package _02JUnit.P101;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {
    DiscountCalculator discountCalculator;

    @BeforeEach
    void initDiscountCalculatorTest() {
        discountCalculator = new DiscountCalculator();
    }

    @Test
    @DisplayName("Calculate a valid discount")
    void testCalculateValidDiscount() {
        double result = discountCalculator.calculateDiscount(1000, 20);
        assertEquals(200, result);
    }

    @Test
    @DisplayName("Calculate a invalid discount")
    void testCalculateInvalidDiscount() {
        double result = discountCalculator.calculateDiscount(1000, 50);
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Calculate without discount")
    void testCalculateWithoutDiscount() {
        double result = discountCalculator.calculateDiscount(1000, 0);
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Calculate a maximum discount")
    void testCalculateMaxDiscount() {
        double result = discountCalculator.calculateDiscount(1000, 40);
        assertEquals(400, result);
    }

    @Test
    @DisplayName("Calculate a minimum discount")
    void testCalculateMinDiscount() {
        double result = discountCalculator.calculateDiscount(1000, 1);
        assertEquals(10, result);
    }
}