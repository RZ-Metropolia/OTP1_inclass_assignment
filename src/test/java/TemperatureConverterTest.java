import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TemperatureConverterTest {

    private TemperatureConverter converter;

    @BeforeEach
    void setUp() {
        converter = new TemperatureConverter();
    }

    // Tests for fahrenheitToCelsius
    @Test
    void testFahrenheitToCelsius_BoilingPoint() {
        assertEquals(100, converter.fahrenheitToCelsius(212), 0.001);
    }

    @Test
    void testFahrenheitToCelsius_NegativeValue() {
        assertEquals(-40, converter.fahrenheitToCelsius(-40), 0.001);
    }


    // Tests for celsiusToFahrenheit
    @Test
    void testCelsiusToFahrenheit_BoilingPoint() {
        assertEquals(212, converter.celsiusToFahrenheit(100), 0.001);
    }

    @Test
    void testCelsiusToFahrenheit_NegativeValue() {
        assertEquals(-40, converter.celsiusToFahrenheit(-40), 0.001);
    }

    // Tests for isExtremeTemperature
    @Test
    void testIsExtremeTemperature_ExtremelyCold() {
        assertTrue(converter.isExtremeTemperature(-41));
    }

    @Test
    void testIsExtremeTemperature_ExtremelyHot() {
        assertTrue(converter.isExtremeTemperature(51));
    }

    @Test
    void testIsExtremeTemperature_BoundaryLow() {
        assertFalse(converter.isExtremeTemperature(-40));
    }

    @Test
    void testIsExtremeTemperature_BoundaryHigh() {
        assertFalse(converter.isExtremeTemperature(50));
    }

    @Test
    void testIsExtremeTemperature_NormalTemperature() {
        assertFalse(converter.isExtremeTemperature(24));
    }

}
