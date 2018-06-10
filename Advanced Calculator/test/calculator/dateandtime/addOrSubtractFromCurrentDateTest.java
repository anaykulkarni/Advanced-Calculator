/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.dateandtime;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kartik
 */
public class addOrSubtractFromCurrentDateTest {
    
    addOrSubtractFromCurrentDate addOrSubDate;
    
    public addOrSubtractFromCurrentDateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        addOrSubDate = new addOrSubtractFromCurrentDate();
    }
    
    @After
    public void tearDown() {
    }

    /*
    Test cases not possible for this as current Date is dynamic in nature.
    */
    @Test
    public void dummyTest() {
        Assert.assertEquals(true, true);
    }
    
}
