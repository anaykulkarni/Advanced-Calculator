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
public class InputHexadecimalConveter {

    String convertHexadecimalToDecimal(String inputHexValue) {
        if("".equals(inputHexValue))
            return "0";
        else
        {
            int decimalEquivalent = Integer.parseInt(inputHexValue, 16);
            return (Integer.toString(decimalEquivalent));
        }
        
    }

    String convertHexadecimalToOctal(String inputHexValue) {
        int decimalConversion = Integer.parseInt(convertHexadecimalToDecimal(inputHexValue));
       return (Integer.toOctalString(decimalConversion));
    }
    String convertHexadecimalToBinary(String inputHexValue) {
        int decimalConversion = Integer.parseInt(convertHexadecimalToDecimal(inputHexValue));
       return (Integer.toBinaryString(decimalConversion));
    }
    
}
