/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.dateandtime;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kartik
 */
public class differenceBetweenDatesTest {
    differenceBetweenDates date;
    
    public differenceBetweenDatesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        date = new differenceBetweenDates();
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void datetest1() {
        assertEquals(365,date.differencebetweendate("10/12/2017","10/12/2018"));
    }
    @Test
    public void datetest2() {
        assertEquals(2169,date.differencebetweendate("01/07/2012","09/06/2018"));
    }
    @Test
    public void datetest3() {
        assertEquals(4,date.differencebetweendate("05/06/2018","09/06/2018"));
    }
    @Test
    public void datetest4() {
        assertEquals(6569,date.differencebetweendate("15/06/2000","10/06/2018"));
    }
    @Test
    public void datetest5() {
        assertEquals(0,date.differencebetweendate("10/12/2017","10/12/2017"));
    }
    @Test
    public void datetest6() {
        assertEquals(0,date.differencebetweendate("1012/2017","1012/2018"));
    }
    @Test
    public void datetest7() {
        assertEquals(730,date.differencebetweendate("10/12/2018","10/12/2016"));
    }
    @Test
    public void datetest8() {
        assertEquals(64,date.differencebetweendate("10/05/1999","07/03/1999"));
    }
    @Test
    public void datetest9() {
        assertEquals(300,date.differencebetweendate("10/05/1999","05/03/2000"));
    }
    @Test
    public void datetest10() {
        assertEquals(0,date.differencebetweendate("0/0/0000","0/0/0000"));
    }
}
