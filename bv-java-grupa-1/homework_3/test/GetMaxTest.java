package test;

import main.GetMax;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GetMaxTest {

    @Test
    public void testGetMaxEqual() {
        int x = GetMax.getMax ( 5, 5 );
        assertEquals (5, x);
    }
    @Test
    public void testGetMaxXBigger() {
        int x = GetMax.getMax ( 10, 5 );
        assertEquals (10, x);
    }
    @Test
    public void testGetMaxYBigger() {
        int x = GetMax.getMax ( 5, 10 );
        assertEquals (10, x);
    }
    @Test
    public void testGetMaxXNull() {
        int x = GetMax.getMax ( null, 10 );
        assertEquals (10, x);
    }
    @Test
    public void testGetMaxYNull() {
        int x = GetMax.getMax ( 10, null );
        assertEquals (10, x);
    }
    @Test
    public void testGetMaxXYNull() {
        assertNull (GetMax.getMax ( null, null ));
    }

    @Test
    public void testNo3Bigger() {
        int no3 = 20;
        int x = GetMax.getMax ( 10, 3 );
        int y = GetMax.getMax ( x, no3 );
        assertEquals ( 20, y );
    }

}
