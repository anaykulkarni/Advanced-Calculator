/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.programmerscalculator;

/**
 * The ProgrammerCalculator Class contains various modules that together provide
 * the functionality of a Programmer calculator.
 * 
 * @version     1.0
 * @author      Kishore
 */
public class ProgrammerCalculator {
    /*
     * The modules of the programmer calculator.
     */
    public InputDecimalConverter decimalInput;
    public BitwiseOperationsModule bitwiseOperation;
    
     /**
     * This method sets up the calculator by initializing the modules.
     */
    public void setUp(){
      decimalInput = new InputDecimalConverter();
      bitwiseOperation = new BitwiseOperationsModule();

    }
    
}
