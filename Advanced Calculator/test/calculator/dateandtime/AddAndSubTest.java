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
import calculator.dateandtime.AddOrSubDays;

/**
 *
 * @author Namita
 */
public class AddAndSubTest {
    AddOrSubDays addsub;
    
    public AddAndSubTest() {
        addsub= new AddOrSubDays();
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
    public void test1() {
       assertEquals("2019-02-18", addsub.add("2019-02-17",0,0,1));
    }
    @Test
    public void test2() {
       assertEquals("2019-03-17", addsub.add("2019-02-17",0,1,0));
    }
    @Test
    public void test3() {
       assertEquals("2020-02-17", addsub.add("2019-02-17",1,0,0));
    }
    @Test
    public void test4() {
       assertEquals("2019-02-17", addsub.add("2019-02-17",0,0,0));
    }
    @Test
    public void test5() {
       assertEquals("2020-03-18", addsub.add("2019-02-17",1,1,1));
    }
    @Test
    public void test6() {
       assertEquals("2019-02-16", addsub.sub("2019-02-17",0,0,1));
    }
    @Test
    public void test7() {
       assertEquals("2019-01-17", addsub.sub("2019-02-17",0,1,0));
    }
    @Test
    public void test8() {
       assertEquals("2018-02-17", addsub.sub("2019-02-17",1,0,0));
    }
    @Test
    public void test9() {
       assertEquals("2019-02-17", addsub.sub("2019-02-17",0,0,0));
    }
    @Test
    public void test10() {
       assertEquals("2018-01-16", addsub.sub("2019-02-17",1,1,1));
    }
    @Test
    public void test11(){
        assertEquals("null", addsub.sub("",0,0,0));
    }
    @Test
    public void test12(){
        assertEquals("null", addsub.add("",0,0,0));
    }
    @Test
    public void test13(){
        assertEquals("null", addsub.add("",1,1,1));
    }
    @Test
    public void test14(){
        assertEquals("null", addsub.sub("",1,1,1));
    }
    @Test
    public void test15(){
        assertEquals("null", addsub.add("dksg",1,5,9));
    }
    @Test
    public void test16(){
        assertEquals("null", addsub.sub("dksg",1,5,9));
    }
    
}
