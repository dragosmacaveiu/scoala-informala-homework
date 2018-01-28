package test;

import main.TimeValidation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TimeValidationJavaTest {
    @Test
    public void testValidateHourMinuteTrue (){
        boolean x = TimeValidation.validateHourMinute ( 2,2 );
        assertTrue ( x );
    }
    @Test
    public void testValidateHourMinuteFalseH (){
        boolean x = TimeValidation.validateHourMinute ( -2,2 );
        assertFalse ( x );
    }
    @Test
    public void testValidateHourMinuteFalseM (){
        boolean x = TimeValidation.validateHourMinute ( 2,-2 );
        assertFalse ( x );
    }
    @Test
    public void testValidateHourMinuteFalseHM (){
        boolean x = TimeValidation.validateHourMinute ( -2,-2 );
        assertFalse ( x );
    }

}
