/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.dateandtime;

import calculator.dateandtime.DifferenceDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Namita
 */
public class DiffernceBetweenTest {
    DifferenceDate diff ;
    
    public DiffernceBetweenTest() {
        diff = new DifferenceDate();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void test1(){
        assertEquals("1year  1month  1day ", diff.dateDiff("2012-11-11", "2013-12-12"));
    }
    @Test
    public void test2(){
        assertEquals("2years  0month  0day ", diff.dateDiff("2012-11-11", "2014-11-11"));
    }
    @Test
    public void test3(){
        assertEquals("0year  2months  0day ", diff.dateDiff("2012-09-11", "2012-11-11"));
    }
    @Test
    public void test4(){
        assertEquals("0year  0month  2days ", diff.dateDiff("2012-11-11", "2012-11-13"));
    }
    @Test
    public void test5(){
        assertEquals("0year  0month  0day ", diff.dateDiff("2012-11-11", "2012-11-11"));
    }
    @Test
    public void test6(){
        assertEquals("2years  0month  0day ", diff.dateDiff("2014-11-11", "2012-11-11"));
    }
    @Test
    public void test7(){
        assertEquals("0year  2months  0day ", diff.dateDiff("2012-11-11", "2012-09-11"));
    }
    @Test
    public void test8(){
        assertEquals("0year  0month  2days ", diff.dateDiff("2012-11-13", "2012-11-11"));
    }
    @Test
    public void test9(){
        assertEquals("null null null", diff.dateDiff("", ""));
    }  
    @Test
    public void test10(){
        assertEquals("null null null", diff.dateDiff("2012-11-13", ""));
    } 
    @Test
    public void test11(){
        assertEquals("null null null", diff.dateDiff("", "2012-11-13"));
    } 
    @Test
    public void test12(){
        assertEquals("null null null", diff.dateDiff("abcd", "2012-11-13"));
    } 
    @Test
    public void test13(){
        assertEquals("null null null", diff.dateDiff("abcd", "xyzgh"));
    }
    @Test
    public void test14(){
        assertEquals("null null null", diff.dateDiff("2012-11-13", "abcd"));
    }
    @Test
    public void test15(){
        assertEquals("null null null", diff.dateDiff("1287-45-09", "2012-11-13"));
    }
    @Test
    public void test16(){
        assertEquals("null null null", diff.dateDiff("1287-45-09", "20-151-1023"));
    }
    @Test
    public void test17(){
        assertEquals("null null null", diff.dateDiff("2012-11-13", "1452-987-09"));
    }
    @Test
    public void test18(){
        assertEquals("null null null", diff.dateDiff("1287&23@66", "201^t%4"));
    }
    @Test
    public void test19(){
        assertEquals("1year  2months  10days ", diff.dateDiff("2012-10-11", "2013-12-21"));
    }
    @Test
    public void test20(){
        assertEquals("2years  10months  0day ", diff.dateDiff("2012-11-11", "2015-09-11"));
    }
    @Test
    public void test21(){
        assertEquals("0year  6months  10days ", diff.dateDiff("2013-06-11", "2013-12-21"));
    }
    @Test
    public void test22(){
        assertEquals("5years  0month  10days ", diff.dateDiff("2013-06-11", "2018-06-21"));
    }@Test
    public void test23(){
        assertEquals("2years  10months  21days ", diff.dateDiff("2023-06-11", "2020-07-21"));
    }@Test
    public void test24(){
        assertEquals("82years  5months  21days ", diff.dateDiff("2096-06-11", "2013-12-21"));
    }@Test
    public void test25(){
        assertEquals("5years  5months  21days ", diff.dateDiff("2019-06-11", "2013-12-21"));
    }
}
