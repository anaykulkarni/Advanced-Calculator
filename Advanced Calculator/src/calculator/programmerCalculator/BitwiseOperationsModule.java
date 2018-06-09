/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.programmerCalculator;

/**
 *
 * @author kishore
 */
public class BitwiseOperationsModule {
    
    public long andOperation(int firstValue,int secondValue) {
        return(firstValue & secondValue);
    }
    public long orOperation(int firstValue,int secondValue) {
        return(firstValue | secondValue);
    }
    public long notOperation(int inputValue) {
        return(~inputValue);
    }
    public long xorOperation(int firstValue,int secondValue) {
        return(firstValue ^ secondValue);
    }
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
