/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.programmerscalculator;

/**
 *
 * @author kishore
 */
public class InputBinaryConverter {
    
     String convertBinaryToDecimal(String inputBinaryValue) {
        if("".equals(inputBinaryValue))
            return "0";
        else
        {
            int decimalEquivalent = Integer.parseInt(inputBinaryValue, 2);
            return (Integer.toString(decimalEquivalent));
        }
        
    }

    String convertBinaryToOctal(String inputBinaryValue) {
        int decimalConversion = Integer.parseInt(convertBinaryToDecimal(inputBinaryValue));
        return (Integer.toOctalString(decimalConversion));
    }
    String convertBinaryToHexadecimal(String inputBinaryvalue) {
        int decimalConversion = Integer.parseInt(convertBinaryToDecimal(inputBinaryvalue));
        return (Integer.toHexString(decimalConversion));
    }
}
