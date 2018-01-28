package test;

import main.FahrenheitToCelsius;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FahrenheitToCelsiusTest {
    @Test
    public void testFahrToCelsius() {
        int x = (int)FahrenheitToCelsius.fahrToCelsius ( 32 );
        assertEquals ( 0, x );
    }
}
