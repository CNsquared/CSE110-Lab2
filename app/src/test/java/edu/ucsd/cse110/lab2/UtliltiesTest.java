package edu.ucsd.cse110.lab2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtliltiesTest {

    @Test
    public void test_trim_display_string(){
        assertEquals("1.234", Utlities.trimDisplayStr("1.2340") );
        assertEquals("13", Utlities.trimDisplayStr("13.0") );
    }
}
