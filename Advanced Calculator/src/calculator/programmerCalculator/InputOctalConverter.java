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
public class InputOctalConverter {
    String convertOctalToDecimal(String inputOctValue) {
        if("".equals(inputOctValue))
            return "0";
        else
        {
            int decimalEquivalent = Integer.parseInt(inputOctValue, 8);
            return (Integer.toString(decimalEquivalent));
        }
        
    }

    String convertOctalToHexadecimal(String inputOctValue) {
        int decimalConversion = Integer.parseInt(convertOctalToDecimal(inputOctValue));
        return (Integer.toHexString(decimalConversion));
    }
    String convertOctalToBinary(String inputOctalValue) {
        int decimalConversion = Integer.parseInt(convertOctalToDecimal(inputOctalValue));
        return (Integer.toBinaryString(decimalConversion));
    }
}
