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
    
    long andOperation(int firstValue,int secondValue) {
        return(firstValue & secondValue);
    }
    long orOperation(int firstValue,int secondValue) {
        return(firstValue | secondValue);
    }
    long notOperation(int inputValue) {
        return(~inputValue);
    }
    long xorOperation(int firstValue,int secondValue) {
        return(firstValue ^ secondValue);
    }
    long leftShiftOperation(int valueToBeShifted,int numberOfTime) {
        return(valueToBeShifted << numberOfTime);
    }
    long rightShiftOperation(int valueToBeShifted,int numberOfTime) {
        return(valueToBeShifted >> numberOfTime);
    }
    long leftRotateOperation(int valueToBeShifted) {
        return(Integer.rotateLeft(valueToBeShifted, 1));
    }
    long rightRotateOperation(int valueToBeShifted) {
        return(Integer.rotateRight(valueToBeShifted, 1));
    }
}
