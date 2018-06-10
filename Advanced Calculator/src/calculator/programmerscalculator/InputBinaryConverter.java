/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.programmerscalculator;

/**
 * The class converts Binary Input into other base values as output.
 * Note : This class has not been used in this version of the application. And is 
 * intended for future updates.
 * @version 1.0
 * @author kishore
 */
public class InputBinaryConverter {
    /**
     * The method converts a Binary input into decimal value.
     * @param inputBinaryValue binary value as input.
     * @return decimal equivalent of the input binary or returns zero if there is no input in the form of a string.
     */ 
    String convertBinaryToDecimal(String inputBinaryValue) {
        if("".equals(inputBinaryValue))
            return "0";
        else
        {
            int decimalEquivalent = Integer.parseInt(inputBinaryValue, 2);
            return (Integer.toString(decimalEquivalent));
        }
        
    }
    /**
     * The method converts a Binary input into octal value.
     * @param inputBinaryValue binary value as input.
     * @return octal equivalent of the input binary value in the form of a string.
     */
    String convertBinaryToOctal(String inputBinaryValue) {
        int decimalConversion = Integer.parseInt(convertBinaryToDecimal(inputBinaryValue));
        return (Integer.toOctalString(decimalConversion));
    }
    /**
     * The method converts a Binary input into hexadecimal value.
     * @param inputBinaryValue binary value as input.
     * @return hexadecimal equivalent of the input binary value in the form of a string.
     */
    String convertBinaryToHexadecimal(String inputBinaryvalue) {
        int decimalConversion = Integer.parseInt(convertBinaryToDecimal(inputBinaryvalue));
        return (Integer.toHexString(decimalConversion));
    }
}
