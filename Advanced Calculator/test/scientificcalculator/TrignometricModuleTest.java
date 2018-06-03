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
 * The class TrignometricModuleTest contains the test cases for the methods of TrignometricModule class
 * of the scientific calculator. A total of 60 test cases are defined in this class.
 * 
 * @version     1.0
 * @author      Anay Kulkarni
 */
public class TrignometricModuleTest {
    
    TrignometricModule tm;
    double pi = Math.PI;
    double maxPrecision = 0.00000001;
    
    public TrignometricModuleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        tm = new TrignometricModule();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void sinTest1() {
        assertEquals( 0.0, tm.sineX(pi), maxPrecision);
    }
    
    @Test
    public void sinTest2() {
        assertEquals( 1.0, tm.sineX(pi/2), maxPrecision);
    }
    
    @Test
    public void sinTest3() {
        assertEquals( -1.0, tm.sineX(3*pi/2), maxPrecision);
    }
    
    @Test
    public void sinTest4() {
        assertEquals( 0.0, tm.sineX(2*pi), maxPrecision);
    }
    
    @Test
    public void sinTest5() {
        assertEquals( 0.86602540, tm.sineX(pi/3), maxPrecision);
    }
    
    @Test
    public void sinhTest1() {
        assertEquals( 11.54873936, tm.sinehX(pi), maxPrecision);
    }
    
    @Test
    public void sinhTest2() {
        assertEquals( 2.30129890, tm.sinehX(pi/2), maxPrecision);
    }
    
    @Test
    public void sinhTest3() {
        assertEquals( 1.24936705, tm.sinehX(pi/3), maxPrecision);
    }
    
    @Test
    public void sinhTest4() {
        assertEquals( 0.0, tm.sinehX(0), maxPrecision);
    }
    
    @Test
    public void sinhTest5() {
        assertEquals( 267.74489404, tm.sinehX(2*pi), maxPrecision);
    }
    
    @Test
    public void cosXTest1() {
        assertEquals( -1.0, tm.cosX(pi), maxPrecision);
    }
    
    @Test
    public void cosXTest2() {
        assertEquals( 0.0, tm.cosX(pi/2), maxPrecision);
    }
    
    @Test
    public void cosXTest3() {
        assertEquals( 0.5, tm.cosX(pi/3), maxPrecision);
    }
    
    @Test
    public void cosXTest4() {
        assertEquals( 1.0, tm.cosX(2*pi), maxPrecision);
    }
    
    @Test
    public void cosXTest5() {
        assertEquals( 1.0, tm.cosX(0), maxPrecision);
    }
    
    @Test
    public void coshXTest1() {
        assertEquals( 267.74676148, tm.coshX(2*pi), maxPrecision);
    }
    
    @Test
    public void coshXTest2() {
        assertEquals( 11.59195327, tm.coshX(pi), maxPrecision);
    }
    
    @Test
    public void coshXTest3() {
        assertEquals( 2.50917847, tm.coshX(pi/2), maxPrecision);
    }
    
    @Test
    public void coshXTest4() {
        assertEquals( 1.60028685, tm.coshX(pi/3), maxPrecision);
    }
    
    @Test
    public void coshXTest5() {
        assertEquals( 1.0, tm.coshX(0), maxPrecision);
    }
    
    @Test
    public void tanXTest1() {
        assertEquals( 0.0, tm.tanX(pi), maxPrecision);
    }
    
    @Test
    public void tanXTest2() {
        assertEquals( 1.0, tm.tanX(pi/4), maxPrecision);
    }
    
    @Test
    public void tanXTest3() {
        assertEquals( 1.73205080, tm.tanX(pi/3), maxPrecision);
    }
    
    @Test
    public void tanXTest4() {
        assertEquals( 0.0, tm.tanX(2*pi), maxPrecision);
    }
    
    @Test
    public void tanXTest5() {
        assertEquals( -1.0, tm.tanX(-pi/4), maxPrecision);
    }
    
    @Test
    public void tanhXTest1() {
        assertEquals( 0.99627207, tm.tanhX(pi), maxPrecision);
    }
    
    @Test
    public void tanhXTest2() {
        assertEquals( 0.91715233, tm.tanhX(pi/2), maxPrecision);
    }
    
    @Test
    public void tanhXTest3() {
        assertEquals( 0.78071443, tm.tanhX(pi/3), maxPrecision);
    }
    
    @Test
    public void tanhXTest4() {
        assertEquals( 0.99999302, tm.tanhX(2*pi), maxPrecision);
    }
    
    @Test
    public void tanhXTest5() {
        assertEquals( 0.0, tm.tanhX(0), maxPrecision);
    }
    
    @Test
    public void sineInverseXTest1() {
        assertEquals( pi/2, tm.sineInverseX(1), maxPrecision);
    }
    
    @Test
    public void sineInverseXTest2() {
        assertEquals( 0.0, tm.sineInverseX(0), maxPrecision);
    }
    
    @Test
    public void sineInverseXTest3() {
        assertEquals( -pi/2, tm.sineInverseX(-1), maxPrecision);
    }
    
    @Test
    public void sineInverseXTest4() {
        assertEquals( pi/6, tm.sineInverseX(0.5), maxPrecision);
    }
    
    @Test
    public void sineInverseXTest5() {
        assertEquals( Double.NaN, tm.sineInverseX(45), maxPrecision);
    }
    
    @Test
    public void cosInverseXTest1() {
        assertEquals( 0, tm.cosInverseX(1), maxPrecision);
    }
    
    @Test
    public void cosInverseXTest2() {
        assertEquals( pi/2, tm.cosInverseX(0), maxPrecision);
    }
    
    @Test
    public void cosInverseXTest3() {
        assertEquals( pi, tm.cosInverseX(-1), maxPrecision);
    }
    
    @Test
    public void cosInverseXTest4() {
        assertEquals( pi/3, tm.cosInverseX(0.5), maxPrecision);
    }
    
    @Test
    public void cosInverseXTest5() {
        assertEquals( Double.NaN, tm.cosInverseX(5), maxPrecision);
    }
    
    @Test
    public void tanInverseXTest1() {
        assertEquals( pi/4, tm.tanInverseX(1), maxPrecision);
    }
    
    @Test
    public void tanInverseXTest2() {
        assertEquals( -pi/4, tm.tanInverseX(-1), maxPrecision);
    }
    
    @Test
    public void tanInverseXTest3() {
        assertEquals( 0.0, tm.tanInverseX(0), maxPrecision);
    }
    
    @Test
    public void tanInverseXTest4() {
        assertEquals( pi/2, tm.tanInverseX(Double.POSITIVE_INFINITY), maxPrecision);
    }
    
    @Test
    public void tanInverseXTest5() {
        assertEquals( 1.57048778, tm.tanInverseX(3241), maxPrecision);
    }
    
    @Test
    public void sinhInverseXTest1() {
        assertEquals( 0.88137358, tm.sinhInverseX(1), maxPrecision);
    }
    
    @Test
    public void sinhInverseXTest2() {
        assertEquals( 0.0, tm.sinhInverseX(0), maxPrecision);
    }
    
    @Test
    public void sinhInverseXTest3() {
        assertEquals( -0.88137358, tm.sinhInverseX(-1), maxPrecision);
    }
    
    @Test
    public void sinhInverseXTest4() {
        assertEquals( 1.86229574, tm.sinhInverseX(pi), maxPrecision);
    }
    
    @Test
    public void sinhInverseXTest5() {
        assertEquals( 6.81783176, tm.sinhInverseX(457), maxPrecision);
    }
    
    @Test
    public void coshInverseXTest1() {
        assertEquals( 0.0, tm.coshInverseX(1), maxPrecision);
    }
    
    @Test
    public void coshInverseXTest2() {
        assertEquals( 2.99322284, tm.coshInverseX(10), maxPrecision);
    }
    
    @Test
    public void coshInverseXTest3() {
        assertEquals( 0.30604210, tm.coshInverseX(pi/3), maxPrecision);
    }
    
    @Test
    public void coshInverseXTest4() {
        assertEquals( 1.81152627, tm.coshInverseX(pi), maxPrecision);
    }
    
    @Test
    public void coshInverseXTest5() {
        assertEquals( 1.02322747, tm.coshInverseX(pi/2), maxPrecision);
    }
    
    @Test
    public void tanhInverseXTest1() {
        assertEquals( 0.10033534, tm.tanhInverseX(0.1), maxPrecision);
    }
    
    @Test
    public void tanhInverseXTest2() {
        assertEquals( 0.60556831, tm.tanhInverseX(0.541), maxPrecision);
    }
    
    @Test
    public void tanhInverseXTest3() {
        assertEquals( -0.10033534, tm.tanhInverseX(-0.1), maxPrecision);
    }
    
    @Test
    public void tanhInverseXTest4() {
        assertEquals( 0.0, tm.tanhInverseX(0), maxPrecision);
    }
    
    @Test
    public void tanhInverseXTest5() {
        assertEquals( 2.64665241, tm.tanhInverseX(0.99), maxPrecision);
    }
    
}
