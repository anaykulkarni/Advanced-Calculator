/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anay
 */
public class ExponentiationAndLogarithmicModuleTest {
    
    ExponentiationAndLogarithmicModule elm;
    double maxPrecision = 0.00000001;
    public ExponentiationAndLogarithmicModuleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        elm = new ExponentiationAndLogarithmicModule();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void ePowerXTest1() {
        assertEquals( 7.38905609, elm.ePowerX(2), maxPrecision);
    }
    
    @Test
    public void ePowerXTest2() {
        assertEquals( 1706.15912936, elm.ePowerX(7.442), maxPrecision);
    }
    
    @Test
    public void ePowerXTest3() {
        assertEquals( 1.0, elm.ePowerX(0), maxPrecision);
    }
    
    @Test
    public void ePowerXTest4() {
        assertEquals( Math.E, elm.ePowerX(1), maxPrecision);
    }
    
    @Test
    public void ePowerXTest5() {
        assertEquals( 0.00451658, elm.ePowerX(-5.4), maxPrecision);
    }
    
    @Test
    public void logXTest1() {
        assertEquals( 0.0, elm.logX(1), maxPrecision);
    }
    
    @Test
    public void logXTest2() {
        assertEquals( 1.0, elm.logX(10), maxPrecision);
    }
    
    @Test
    public void logXTest3() {
        assertEquals( Double.NEGATIVE_INFINITY, elm.logX(0), maxPrecision);
    }
    
    @Test
    public void logXTest4() {
        assertEquals( 5.64867770, elm.logX(445325.643), maxPrecision);
    }
    
    @Test
    public void logXTest5() {
        assertEquals( Double.NaN, elm.logX(-81), maxPrecision);
    }
    
    @Test
    public void lnXTest1() {
        assertEquals( 0.0, elm.lnX(1), maxPrecision);
    }
    
    @Test
    public void lnXTest2() {
        assertEquals( 1.0, elm.lnX(Math.E), maxPrecision);
    }
    
    @Test
    public void lnXTest3() {
        assertEquals( Double.NEGATIVE_INFINITY, elm.lnX(0), maxPrecision);
    }
    
    @Test
    public void lnXTest4() {
        assertEquals( 13.00656107, elm.lnX(445325.643), maxPrecision);
    }
    
    @Test
    public void lnXTest5() {
        assertEquals( Double.NaN, elm.lnX(-81), maxPrecision);
    }
    
    @Test
    public void tenPowerXTest1() {
        assertEquals( 1.0, elm.tenPowerX(0), maxPrecision);
    }
    
    @Test
    public void tenPowerXTest2() {
        assertEquals( 10000.0, elm.tenPowerX(4), maxPrecision);
    }
    
    @Test
    public void tenPowerXTest3() {
        assertEquals( 0.0001, elm.tenPowerX(-4), maxPrecision);
    }
    
}
