/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.programmerscalculator;

/**
 * The class converts Binary Input into other base values as output.
 * @version 1.0
 * @author kishore
 */
public class InputDecimalConverter {
    
    /**
     * The method converts a decimal input into binary value.
     * @param inputDecimal decimal value as input.
     * @return Binary equivalent of the input Decimal or returns zero if there is no input in the form of a string.
     */ 
    public String convertDecimalToBinary(String inputDecimal) {
        if("".equals(inputDecimal))
            return "0";
        else {
            int decimalConversion = Integer.parseInt(inputDecimal);
            return (Integer.toBinaryString(decimalConversion));
        }
    }
    /**
     * The method converts a decimal input into Hexadecimal value.
     * @param inputDecimal decimal value as input.
     * @return Hexadecimal equivalent of the input decimal or returns zero if there is no input in the form of a string.
     */ 
    public  String convertDecimalToHexaDecimal(String inputDecimal) {
        if("".equals(inputDecimal))
            return "0";
        else {
            int decimalConversion = Integer.parseInt(inputDecimal);
            return (Integer.toHexString(decimalConversion));
        }
    }
    /**
     * The method converts a decimal input into Octal value.
     * @param inputDecimal decimal value as input.
     * @return octal equivalent of the input decimal or returns zero if there is no input in the form of a string.
     */
    public String convertDecimalToOctal(String inputDecimal) {
        if("".equals(inputDecimal))
            return "0";
        else {
            int decimalConversion = Integer.parseInt(inputDecimal);
            return (Integer.toOctalString(decimalConversion));
        }
    }
    
}
