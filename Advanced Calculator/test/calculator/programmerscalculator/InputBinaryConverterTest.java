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
public class InputBinaryConverterTest {
    InputBinaryConverter binaryConvert;
    
    public InputBinaryConverterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        binaryConvert = new InputBinaryConverter();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void convertBinaryToDecimal() {
        assertEquals("130",binaryConvert.convertBinaryToDecimal("10000010"));
    }
    @Test
    public void convertBinaryToDecimal1() {
        assertEquals("1000",binaryConvert.convertBinaryToDecimal("1111101000"));
    }
    @Test
    public void convertBinaryToDecimalEdgeCase() {
        assertEquals("0",binaryConvert.convertBinaryToDecimal(""));
    }
    @Test
    public void convertBinaryToOctal() {
        assertEquals("1750",binaryConvert.convertBinaryToOctal("1111101000"));
    }
    @Test
    public void convertBinaryToOctal1() {
        assertEquals("202",binaryConvert.convertBinaryToOctal("10000010"));
    }
    @Test
    public void convertBinaryToOctalEdgeCase() {
        assertEquals("0",binaryConvert.convertBinaryToOctal(""));
    }
    @Test
    public void convertBinaryToHexadecimal() {
        assertEquals("64",binaryConvert.convertBinaryToHexadecimal("1100100"));
    }
    @Test
    public void convertHexaDecimalToBinary1() {
        assertEquals("9a",binaryConvert.convertBinaryToHexadecimal("10011010"));
    }
    @Test
    public void convertHexaDecimalToBinaryEdgeCase() {
        assertEquals("0",binaryConvert.convertBinaryToHexadecimal(""));
    }
}
