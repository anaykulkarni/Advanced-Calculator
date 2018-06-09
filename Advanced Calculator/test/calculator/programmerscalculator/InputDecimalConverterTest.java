/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.programmerscalculator;

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
public class InputDecimalConverterTest {
    InputDecimalConverter convertDecimal;
    
    public InputDecimalConverterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        convertDecimal = new InputDecimalConverter();
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void convertDecimalToBinary() {
       assertEquals("10000010",convertDecimal.convertDecimalToBinary("130"));
    }
    @Test
    public void convertDecimalToBinary1() {
       assertEquals("1111101000",convertDecimal.convertDecimalToBinary("1000"));
    }
    @Test
    public void convertDecimalToBinaryEdgeCase() {
       assertEquals("0",convertDecimal.convertDecimalToBinary(""));
    }
    @Test
    public void convertDecimalToOctal() {
       assertEquals("1750",convertDecimal.convertDecimalToOctal("1000"));
    }
    @Test
    public void convertDecimalToOctal1() {
        assertEquals("202",convertDecimal.convertDecimalToOctal("130"));
    }
    @Test
    public void convertDecimalToOctalEdgeCase() {
        assertEquals("0",convertDecimal.convertDecimalToOctal(""));
    }
    @Test
    public void convertDecimalToHexadecimal() {
        assertEquals("64",convertDecimal.convertDecimalToHexaDecimal("100"));
    }
    @Test
    public void convertDecimalToHexadecimal1() {
        assertEquals("9a",convertDecimal.convertDecimalToHexaDecimal("154"));
    }
    @Test
    public void convertDecimalToHexadecimalEdgeCase() {
        assertEquals("0",convertDecimal.convertDecimalToHexaDecimal(""));
    }
   
}
