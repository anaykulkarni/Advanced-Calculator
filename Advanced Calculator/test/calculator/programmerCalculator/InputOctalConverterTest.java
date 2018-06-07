/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.programmerCalculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kisho
 */
public class InputOctalConverterTest {
    InputOctalConverter octalConvert;
    
    public InputOctalConverterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        octalConvert = new InputOctalConverter();
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void convertOctalToDecimal() {
        assertEquals("130",octalConvert.convertOctalToDecimal("202"));
    }
    @Test
    public void convertOctalToDecimal1() {
        assertEquals("1000",octalConvert.convertOctalToDecimal("1750"));
    }
    @Test
    public void convertOctalToDecimalEdgeCase() {
        assertEquals("0",octalConvert.convertOctalToDecimal(""));
    }
    @Test
    public void convertOCtalToHexaDecimal() {
        assertEquals("3e8",octalConvert.convertOctalToHexadecimal("1750"));
    }
    @Test
    public void convertOCtalToHexaDecimal1() {
        assertEquals("82",octalConvert.convertOctalToHexadecimal("202"));
    }
    @Test
    public void convertOCtalToHexaDecimalEdgeCase() {
        assertEquals("0",octalConvert.convertOctalToHexadecimal(""));
    }
    @Test
    public void convertOctalToBinary() {
        assertEquals("1100100",octalConvert.convertOctalToBinary("144"));
    }
    @Test
    public void convertOctalToBinary1() {
        assertEquals("10011010",octalConvert.convertOctalToBinary("232"));
    }
    @Test
    public void convertOctalToBinaryEdgeCase() {
        assertEquals("0",octalConvert.convertOctalToBinary(""));
    }
}
