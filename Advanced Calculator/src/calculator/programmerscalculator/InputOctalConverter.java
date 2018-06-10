/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.programmerscalculator;

/**
 * The class converts Octal Input into other base values as output.
 * <b>Note</b> : This class has not been used in this version of the application and is 
 * intended for future updates.
 * @version 1.0
 * @author kishore
 */
public class InputOctalConverter {
    
     /**
     * The method converts a Octal input into decimal value.
     * @param inputOctValue Octal value as input.
     * @return decimal equivalent of the input Octal or returns zero if there is no input in the form of a string.
     */ 
    String convertOctalToDecimal(String inputOctValue) {
        if("".equals(inputOctValue))
            return "0";
        else
        {
            int decimalEquivalent = Integer.parseInt(inputOctValue, 8);
            return (Integer.toString(decimalEquivalent));
        }
        
    }
    /**
     * The method converts a Octal input into Hexadecimal value.
     * @param inputOctValue Octal value as input.
     * @return hexadecimal equivalent of the input Octal input in the form of a string.
     */ 
    String convertOctalToHexadecimal(String inputOctValue) {
        int decimalConversion = Integer.parseInt(convertOctalToDecimal(inputOctValue));
        return (Integer.toHexString(decimalConversion));
    }
    
    /**
     * The method converts a Octal input into Binary value.
     * @param inputOctValue Octal value as input.
     * @return binary equivalent of the input Octal input in the form of a string.
     */
    String convertOctalToBinary(String inputOctalValue) {
        int decimalConversion = Integer.parseInt(convertOctalToDecimal(inputOctalValue));
        return (Integer.toBinaryString(decimalConversion));
    }
}
