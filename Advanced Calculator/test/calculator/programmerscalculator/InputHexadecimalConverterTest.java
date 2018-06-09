/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.programmerscalculator;

import junit.framework.Assert;
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
public class InputHexadecimalConverterTest {
    
    InputHexadecimalConveter hexadecimalconvert;
    
    public InputHexadecimalConverterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         hexadecimalconvert = new InputHexadecimalConveter();
    }
    
    
    @After
    public void tearDown() {
    }

    @Test
    public void convertHexaDecimalToDecimal() {
        assertEquals("130",hexadecimalconvert.convertHexadecimalToDecimal("82"));
    }
    @Test
    public void convertHexaDecimalToDecimal1() {
        assertEquals("1000",hexadecimalconvert.convertHexadecimalToDecimal("3E8"));
    }
    @Test
    public void convertHexaDecimalToDecimalEdgeCase() {
        assertEquals("0",hexadecimalconvert.convertHexadecimalToDecimal(""));
    }
    @Test
    public void convertHexaDecimalToOctal() {
        assertEquals("1750",hexadecimalconvert.convertHexadecimalToOctal("3E8"));
    }
    @Test
    public void convertHexaDecimalToOctal1() {
        assertEquals("202",hexadecimalconvert.convertHexadecimalToOctal("82"));
    }
    @Test
    public void convertHexaDecimalToOctalEdgeCase() {
        assertEquals("0",hexadecimalconvert.convertHexadecimalToOctal(""));
    }
    @Test
    public void convertHexaDecimalToBinary() {
        assertEquals("1100100",hexadecimalconvert.convertHexadecimalToBinary("64"));
    }
    @Test
    public void convertHexaDecimalToBinary1() {
        assertEquals("10011010",hexadecimalconvert.convertHexadecimalToBinary("9A"));
    }
    @Test
    public void convertHexaDecimalToBinaryEdgeCase() {
        assertEquals("0",hexadecimalconvert.convertHexadecimalToBinary(""));
    }
}
