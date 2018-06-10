/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.programmerscalculator;

/**
 * The class converts HexaDecimal Input into other base values as output.
 * <b>Note</b> : This class has not been used in this version of the application and is 
 * intended for future updates.
 * @version 1.0
 * @author kishore
 */
public class InputHexadecimalConveter {

     /**
     * The method converts a Hexadecimal input into decimal value.
     * @param inputHexValue Hexadecimal value as input.
     * @return decimal equivalent of the input Hexadecimal or returns zero if there is no input in the form of a string.
     */ 
    String convertHexadecimalToDecimal(String inputHexValue) {
        if("".equals(inputHexValue))
            return "0";
        else
        {
            int decimalEquivalent = Integer.parseInt(inputHexValue, 16);
            return (Integer.toString(decimalEquivalent));
        }
        
    }
     /**
     * The method converts a Hexadecimal input into octal value.
     * @param inputHexValue hexadecimal value as input.
     * @return octal equivalent of the input Hexadecimal value in the form of a string.
     */
    String convertHexadecimalToOctal(String inputHexValue) {
        int decimalConversion = Integer.parseInt(convertHexadecimalToDecimal(inputHexValue));
        return (Integer.toOctalString(decimalConversion));
    }
    /**
     * The method converts a Hexadecimal input into Binary value.
     * @param inputHexValue hexadecimal value as input.
     * @return binary equivalent of the input Hexadecimal value in the form of a string.
     */
    String convertHexadecimalToBinary(String inputHexValue) {
        int decimalConversion = Integer.parseInt(convertHexadecimalToDecimal(inputHexValue));
        return (Integer.toBinaryString(decimalConversion));
    }
    
}
