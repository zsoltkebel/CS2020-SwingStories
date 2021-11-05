package uk.ac.abdn.comp.csd;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void shouldConvert() 
    {
        assertEquals(Integer.valueOf(100), App.convert(212));
    }
    
}
