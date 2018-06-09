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
public class InputDecimalConverter {
    
    public String convertDecimalToBinary(String inputDecimal) {
        if("".equals(inputDecimal))
            return "0";
        else {
            int decimalConversion = Integer.parseInt(inputDecimal);
            return (Integer.toBinaryString(decimalConversion));
        }
    }
    public  String convertDecimalToHexaDecimal(String inputDecimal) {
        if("".equals(inputDecimal))
            return "0";
        else {
            int decimalConversion = Integer.parseInt(inputDecimal);
            return (Integer.toHexString(decimalConversion));
        }
    }
    public String convertDecimalToOctal(String inputDecimal) {
        if("".equals(inputDecimal))
            return "0";
        else {
            int decimalConversion = Integer.parseInt(inputDecimal);
            return (Integer.toOctalString(decimalConversion));
        }
    }
    
}
