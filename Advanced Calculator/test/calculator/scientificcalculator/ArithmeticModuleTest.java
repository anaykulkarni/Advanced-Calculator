/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.scientificcalculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit Test class for the Arithmetic module.
 * 
 * @version     1.0
 * @author      Anay Kulkarni
 */
public class ArithmeticModuleTest {
    
    ArithmeticModule am;
    double maxPrecision = 0.00000001;
    
    public ArithmeticModuleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        am = new ArithmeticModule();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void squareRootTest1() {
        assertEquals( 2.0, am.squareRoot( 4.0 ), maxPrecision);
    }
    
    @Test
    public void squareRootTest2() {
        assertEquals( 49.12687655, am.squareRoot( 2413.45 ), maxPrecision);
    }
    
    @Test
    public void squareRootTest3() {
        assertEquals( 0.0, am.squareRoot( 0 ), maxPrecision);
    }
    
    @Test
    public void squareRootTest4() {
        assertEquals( 3145.23417252, am.squareRoot( 9892498 ), maxPrecision);
    }
    
    @Test
    public void squareRootTest5() {
        assertEquals( Double.NaN, am.squareRoot( -4.0 ), maxPrecision);
    }
    
    @Test
    public void xSquareTest1() {
        assertEquals( 1.0, am.xSquare( -1.0 ), maxPrecision);
    }
    
    @Test
    public void xSquareTest2() {
        assertEquals( 0.0, am.xSquare( 0 ), maxPrecision);
    }
    
    @Test
    public void xSquareTest3() {
        assertEquals( 67993974.60654682, am.xSquare( 8245.8459 ), maxPrecision);
    }
    
    @Test
    public void xSquareTest4() {
        assertEquals( 30118144.0, am.xSquare( -5488 ), maxPrecision);
    }
    
    @Test
    public void xSquareTest5() {
        assertEquals( 12345.65432100, am.xSquare( 111.111 ), maxPrecision);
    }
    
    @Test
    public void xCubeTest1() {
        assertEquals( 0.0, am.xCube( 0 ), maxPrecision);
    }
    
    @Test
    public void xCubeTest2() {
        assertEquals( -8.0, am.xCube( -2.0 ), maxPrecision);
    }
    @Test
    public void xCubeTest3() {
        assertEquals( 1371.70096063, am.xCube( 11.111 ), maxPrecision);
    }
    @Test
    public void xCubeTest4() {
        assertEquals( 146363183.0, am.xCube( 527 ), maxPrecision);
    }
    
    @Test
    public void xCubeTest5() {
        assertEquals( -35643.77117099, am.xCube( -32.91 ), maxPrecision);
    }
    
    @Test
    public void xInverse1() {
        assertEquals( Double.POSITIVE_INFINITY, am.xInverse( 0 ), maxPrecision);
    }
    
    @Test
    public void xInverse2() {
        assertEquals( 0.5, am.xInverse(2), maxPrecision);
    }
    
    @Test
    public void xInverse3() {
        assertEquals( 1.12019715, am.xInverse( 0.8927 ), maxPrecision);
    }
    
    @Test
    public void xInverse4() {
        assertEquals( 0.30959752, am.xInverse( 3.23 ), maxPrecision);
    }
    
    @Test
    public void xInverse5() {
        assertEquals( -0.000054127 , am.xInverse( -18474.84 ), maxPrecision);
    }
    
    @Test
    public void negateTest1() {
        assertEquals( 18474.84 , am.negate( -18474.84 ), maxPrecision);
    }
    
    @Test
    public void negateTest2() {
        assertEquals( -84 , am.negate( 84 ), maxPrecision);
    }
    
    @Test
    public void negateTest3() {
        assertEquals( 0, am.negate( 0 ), maxPrecision);
    }
    
    @Test
    public void negateTest4() {
        assertEquals( -1, am.negate(am.negate( am.negate( am.negate( -1 ) ) )), maxPrecision);
    }
    
    @Test
    public void xPowerYTest1() {
        assertEquals( 16.0, am.xPowerY( 2, 4 ), maxPrecision);
    }
    
    @Test
    public void xPowerYTest2() {
        assertEquals( 5927.15668503, am.xPowerY( 3.342, 7.2 ), maxPrecision);
    }
    
    @Test
    public void xPowerYTest3() {
        assertEquals( 1.0, am.xPowerY( 234.34, 0 ), maxPrecision);
    }
    
    @Test
    public void xPowerYTest4() {
        assertEquals( 0.0, am.xPowerY( 0, 34.8 ), maxPrecision);
    }
    
    @Test
    public void xPowerYTest5() {
        assertEquals( 4294967296.0, am.xPowerY( 2, 32 ), maxPrecision);
    }
    
    @Test
    public void yRootXTest1() {
        assertEquals("6.611489018457944", am.yRootX(289, 3));
    }
    
    @Test
    public void yRootXTest2() {
        assertEquals("1.2437225540982386", am.yRootX(2823.4329, 36.43));
    }
    
    @Test
    public void yRootXTest3() {
        assertEquals("1.3270621124806197", am.yRootX(890, 24));
    }
    
    @Test
    public void yRootXTest4() {
        assertEquals("26.080460773387394", am.yRootX(9863, 2.82));
    }
    
    @Test
    public void yRootXTest5() {
        assertEquals("2.0", am.yRootX(32, 5));
    }
    
    @Test
    public void yRootXTest6() {
        assertEquals("NaN", am.yRootX(0, 0));
    }
    
    @Test
    public void yRootXTest7() {
        assertEquals("infinity", am.yRootX(0, -5));
    }
    
    @Test
    public void yRootXTest8() {
        assertEquals("0", am.yRootX(0, 3));
    }
    
    @Test
    public void yRootXTest9() {
        assertEquals("infinity", am.yRootX(289, 0));
    }
    
    @Test
    public void yRootXTest10() {
        assertEquals("NaN", am.yRootX(-8, 0));
    }

    @Test
    public void yRootXTest11() {
        assertEquals("1.565085 + i1.565085", am.yRootX(-24, 4));
    }
    
    @Test
    public void yRootXTest12() {
        assertEquals("0.319472 - i0.319472", am.yRootX(-24, -4));
    }
    
    @Test
    public void yRootXTest13() {
        assertEquals("0.45180100180492244", am.yRootX(24, -4));
    }
    
    @Test
    public void yRootXTest14() {
        assertEquals("-1.888175022589804", am.yRootX(-24, 5));
    }
    
    @Test
    public void yRootXTest15() {
        assertEquals("-0.5296119205244061", am.yRootX(-24, -5));
    }
    
    @Test
    public void yRootXTest16() {
        assertEquals("0.5296119205244061", am.yRootX(24, -5));
    }
    
    @Test
    public void nFactorialTest1() {
        assertEquals(120, am.nFactorial(5));
    }
    
    @Test
    public void nFactorialTest2() {
        assertEquals(5040, am.nFactorial(7));
    }
    
    @Test
    public void nFactorialTest3() {
        assertEquals(479001600, am.nFactorial(12));
    }
    
    @Test
    public void nFactorialTest4() {
        assertEquals(1, am.nFactorial(0));
    }
    
    @Test
    public void nFactorialTest5() {
        assertEquals(1, am.nFactorial(1));
    }
    
}
