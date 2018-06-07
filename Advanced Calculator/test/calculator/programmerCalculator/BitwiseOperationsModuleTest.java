/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.programmerCalculator;

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
public class BitwiseOperationsModuleTest {
    BitwiseOperationsModule bitWiseOp;
    
    public BitwiseOperationsModuleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        bitWiseOp = new BitwiseOperationsModule();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void andOperationTest1() {
        assertEquals(1,bitWiseOp.andOperation(5, 3) );
    }
    @Test
    public void andOperationTest2() {
        assertEquals(17,bitWiseOp.andOperation(17, 17) );
    }
    @Test
    public void andOperationTest3() {
        assertEquals(1,bitWiseOp.andOperation(17,-17) );
    }
    @Test
    public void andOperationTest4() {
        assertEquals(1,bitWiseOp.andOperation(133, 25) );
    }
    @Test
    public void andOperationTest5() {
        assertEquals(19224,bitWiseOp.andOperation(19356,-133) );
    }
    @Test
    public void andOperationTest6() {
        assertEquals(4,bitWiseOp.andOperation(133,-19356) );
    }
    @Test
    public void andOperationTest7() {
        assertEquals(-16,bitWiseOp.andOperation(-15,-8) );
    }
    @Test
    public void andOperationTest8() {
        assertEquals(0,bitWiseOp.andOperation(15, 0) );
    }
    @Test
    public void andOperationTest9() {
        assertEquals(0,bitWiseOp.andOperation(-15, 0) );
    }
    @Test
    public void orOperationTest1() {
        assertEquals(7,bitWiseOp.orOperation(5, 3) );
    }
    @Test
    public void orOperationTest2() {
        assertEquals(17,bitWiseOp.orOperation(17, 17) );
    }
    public void orOperationTest3() {
        assertEquals(-1,bitWiseOp.orOperation(17,-17) );
    }
    @Test
    public void orOperationTest4() {
        assertEquals(157,bitWiseOp.orOperation(133,25) );
    }
    @Test
    public void orOperationTest5() {
        assertEquals(-1,bitWiseOp.orOperation(19356,-133) );
    }
    @Test
    public void orOperationTest6() {
        assertEquals(-19227,bitWiseOp.orOperation(133,-19356) );
    }
    @Test
    public void orOperationTest7() {
        assertEquals(-7,bitWiseOp.orOperation(-15,-8) );
    }
    @Test
    public void orOperationTest8() {
        assertEquals(15,bitWiseOp.orOperation(15, 0) );
    }
    @Test
    public void orOperationTest9() {
        assertEquals(-15,bitWiseOp.orOperation(-15,0) );
    }
    @Test
    public void notOperationTest1() {
        assertEquals(-6,bitWiseOp.notOperation(5) );
    }
    @Test
    public void notOperationTest2() {
        assertEquals(-18,bitWiseOp.notOperation(17) );
    }
    @Test
    public void notOperationTest3() {
        assertEquals(24,bitWiseOp.notOperation(-25) );
    }
    @Test
    public void notOperationTest4() {
        assertEquals(-134,bitWiseOp.notOperation(133) );
    }
    @Test
    public void notOperationTest5() {
        assertEquals(19355,bitWiseOp.notOperation(-19356) );
    }
    @Test
    public void notOperationTest6() {
        assertEquals(-19357,bitWiseOp.notOperation(19356) );
    }
    @Test
    public void notOperationTest7() {
        assertEquals(-1,bitWiseOp.notOperation(0) );
    }
    @Test
    public void xorOperationTest1() {
        assertEquals(6,bitWiseOp.xorOperation(5, 3) );
    }
    @Test
    public void xorOperationTest2() {
        assertEquals(0,bitWiseOp.xorOperation(17, 17) );
    }
    @Test
    public void xorOperationTest3() {
        assertEquals(-2,bitWiseOp.xorOperation(17,-17) );
    }
    @Test
    public void xorOperationTest4() {
        assertEquals(156,bitWiseOp.xorOperation(133,25) );
    }
    @Test
    public void xorOperationTest5() {
        assertEquals(-19225,bitWiseOp.xorOperation(19356,-133) );
    }
    @Test
    public void xorOperationTest6() {
        assertEquals(-19231,bitWiseOp.xorOperation(133,-19356) );
    }
    @Test
    public void xorOperationTest7() {
        assertEquals(9,bitWiseOp.xorOperation(-15,-8) );
    }
    @Test
    public void xorOperationTest8() {
        assertEquals(15,bitWiseOp.xorOperation(15, 0) );
    }
    @Test
    public void xorOperationTest9() {
        assertEquals(-15,bitWiseOp.xorOperation(-15, 0) );
    }
    @Test
    public void leftShiftOperationTest1() {
        assertEquals(40,bitWiseOp.leftShiftOperation(5, 3) );
    }
    @Test
    public void leftShiftOperationTest2() {
        assertEquals(2228224,bitWiseOp.leftShiftOperation(17, 17) );
    }
    @Test
    public void leftShiftOperationTest3() {
        assertEquals(4256,bitWiseOp.leftShiftOperation(133,5) );
    }
    @Test
    public void leftShiftOperationTest4() {
        assertEquals(-154848,bitWiseOp.leftShiftOperation(-19356,3) );
    }
    @Test
    public void leftShiftOperationTest5() {
        assertEquals(-8512,bitWiseOp.leftShiftOperation(-133,6) );
    }
    @Test
    public void leftShiftOperationTest6() {
        assertEquals(-3840,bitWiseOp.leftShiftOperation(-15,8) );
    }
    @Test
    public void leftShiftOperationTest7() {
        assertEquals(15,bitWiseOp.leftShiftOperation(15, 0) );
    }
    @Test
    public void leftShiftOperationTest8() {
        assertEquals(-15,bitWiseOp.leftShiftOperation(-15, 0) );
    }
    @Test
    public void rightShiftOperationTest1() {
        assertEquals(0,bitWiseOp.rightShiftOperation(5, 3) );
    }
    @Test
    public void rightShiftOperationTest2() {
        assertEquals(0,bitWiseOp.rightShiftOperation(17, 17) );
    }
    @Test
    public void rightShiftOperationTest3() {
        assertEquals(33,bitWiseOp.rightShiftOperation(133,2) );
    }
    @Test
    public void rightShiftOperationTest4() {
        assertEquals(-2420,bitWiseOp.rightShiftOperation(-19356,3) );
    }
    @Test
    public void rightShiftOperationTest5() {
        assertEquals(-3,bitWiseOp.rightShiftOperation(-133,6) );
    }
    @Test
    public void rightShiftOperationTest6() {
        assertEquals(-1,bitWiseOp.rightShiftOperation(-15,8) );
    }
    @Test
    public void rightShiftOperationTest7() {
        assertEquals(15,bitWiseOp.rightShiftOperation(15, 0) );
    }
    @Test
    public void rightShiftOperationTest8() {
        assertEquals(-15,bitWiseOp.rightShiftOperation(-15, 0) );
    }
    @Test
    public void leftRotateOperationTest1() {
        assertEquals(10,bitWiseOp.leftRotateOperation(5) );
    }
    @Test
    public void leftRotateOperationTest2() {
        assertEquals(34,bitWiseOp.leftRotateOperation(17) );
    }
    @Test
    public void leftRotateOperationTest3() {
        assertEquals(266,bitWiseOp.leftRotateOperation(133) );
    }
    @Test
    public void leftRotateOperationTest4() {
        assertEquals(-38711,bitWiseOp.leftRotateOperation(-19356) );
    }
    @Test
    public void leftRotateOperationTest5() {
        assertEquals(-265,bitWiseOp.leftRotateOperation(-133) );
    }
    @Test
    public void leftRotateOperationTest6() {
        assertEquals(-29,bitWiseOp.leftRotateOperation(-15) );
    }
    @Test
    public void leftRotateOperationTest7() {
        assertEquals(0,bitWiseOp.leftRotateOperation(0) );
    }
    @Test
    public void rightRotateOperationTest1() {
        assertEquals(2,bitWiseOp.rightRotateOperation(4) );
    }
    @Test
    public void rightRotateOperationTest2() {
        assertEquals(7,bitWiseOp.rightRotateOperation(14) );
    }
    @Test
    public void rightRotateOperationTest3() {
        assertEquals(67,bitWiseOp.rightRotateOperation(134) );
    }
    @Test
    public void rightRotateOperationTest4() {
        assertEquals(-968,bitWiseOp.rightRotateOperation(-1935) );
    }
    @Test
    public void rightRotateOperationTest5() {
        assertEquals(-67,bitWiseOp.rightRotateOperation(-133) );
    }
    @Test
    public void rightRotateOperationTest6() {
        assertEquals(-8,bitWiseOp.rightRotateOperation(-15) );
    }
    @Test
    public void rightRotateOperationTest7() {
        assertEquals(0,bitWiseOp.rightRotateOperation(0) );
    }
}
