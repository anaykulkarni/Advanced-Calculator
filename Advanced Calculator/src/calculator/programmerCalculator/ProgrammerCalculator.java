/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.programmerCalculator;

/**
 *
 * @author kisho
 */
public class ProgrammerCalculator {
    
    public InputDecimalConverter decimalInput;
    public BitwiseOperationsModule bitwiseOperation;
    
    public void setUp(){
      decimalInput = new InputDecimalConverter();
      bitwiseOperation = new BitwiseOperationsModule();

    }
    
}
