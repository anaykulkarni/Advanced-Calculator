/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.programmerscalculator;

/**
 * This class contains all the methods needed to perform bitwise operations
 * like Or, And, Not, Etc.
 *@version 1.0
 * @author kishore
 */
public class BitwiseOperationsModule {
    /**
     * The method performs "And" operation on the given inputs.
     * And return a Long integer as output.
     * @param firstValue first user input.
     * @param secondValue second user input.
     * @return the result of the bitwise operation "firstValue And SecondValue".
     */
    public long andOperation(int firstValue,int secondValue) {
        return(firstValue & secondValue);
    }
    /**
     * The method performs "Or" operation on the given inputs.
     * And return a Long integer as output.
     * @param firstValue first user input.
     * @param secondValue second user input.
     * @return the result of the bitwise operation "firstValue Or SecondValue".
     */
    public long orOperation(int firstValue,int secondValue) {
        return(firstValue | secondValue);
    }
    /**
     * The method performs "Not" operation on the given inputs.
     * And return a Long integer as output.
     * @param inputValue user input.
     * @return the result of the bitwise operation "<b>~inputValue</b>".
     */
    public long notOperation(int inputValue) {
        return(~inputValue);
    }
    /**
     * The method performs "<b>Xor</b>" operation on the given inputs.
     * And return a Long integer as output.
     * @param firstValue first user input.
     * @param secondValue second user input.
     * @return the result of the bitwise operation "<b>firstValue Xor SecondValue</b>".
     */
    public long xorOperation(int firstValue,int secondValue) {
        return(firstValue ^ secondValue);
    }
     /**
     * The method performs "<b>leftShift</b>" operation on the given inputs.
     * And return a Long integer as output.
     * @param firstValue first user input.
     * @param secondValue second user input.
     * @return the result of the bitwise operation "<b>firstValue Xor SecondValue</b>".
     */
    public long leftShiftOperation(int valueToBeShifted,int numberOfTime) {
        return(valueToBeShifted << numberOfTime);
    }
    public long rightShiftOperation(int valueToBeShifted,int numberOfTime) {
        return(valueToBeShifted >> numberOfTime);
    }
    public long leftRotateOperation(int valueToBeShifted) {
        return(Integer.rotateLeft(valueToBeShifted, 1));
    }
    public long rightRotateOperation(int valueToBeShifted) {
        return(Integer.rotateRight(valueToBeShifted, 1));
    }
}
