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
 * JUnit Test class for the class ExpressionEvaluatorModuleTest
 * 
 * @version     1.0
 * @author      Anay Kulkarni
 */
public class ExpressionEvaluatorTest {
    ExpressionEvaluatorModule evaluator;
    
    public ExpressionEvaluatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        evaluator = new ExpressionEvaluatorModule();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void evaluatorTest1() {
        assertEquals("12", evaluator.evaluate("2+2*5"));
    }
    
    @Test
    public void evaluatorTest2() {
        assertEquals("27", evaluator.evaluate("2 + (25*2)/2 "));
    }
    
    @Test
    public void evaluatorTest3() {
        assertEquals("2.534", evaluator.evaluate(" (3.9/3) + 1.234"));
    }
    
    @Test
    public void evaluatorTest4() {
        assertEquals("Error", evaluator.evaluate("2 + sine(90)"));
    }
    
    @Test
    public void evaluatorTest5() {
        assertEquals("19", evaluator.evaluate("(9/3) + (4/2)*(8)"));
    }
    
    @Test
    public void evaluatorTest6() {
        assertEquals("3", evaluator.evaluate(" 3%5 "));
    }
    
    @Test
    public void evaluatorTest7() {
        assertEquals("2", evaluator.evaluate("5%3 "));
    }
    
    @Test
    public void evaluatorTest8() {
        assertEquals("3.1", evaluator.evaluate("3.1%5.1"));
    }
    
    @Test
    public void evaluatorTest9() {
        assertEquals("1.8999999999999995", evaluator.evaluate("5.1%3.2 "));
    }
    
    @Test
    public void evaluatorTest10() {
        assertEquals("4.0", evaluator.evaluate("4 + Math.asin(0) "));
    }
    
}
