/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.dateandtime;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Namita
 */
public class AddOrSubDays {
    public String add(String stDate, long years, long months, long days){
        String calculatedDate="null";
        try{
            LocalDate baseDate = LocalDate.parse(stDate);
            baseDate = baseDate.plusYears(years).plusMonths(months).plusDays(days);
            calculatedDate= String.valueOf(baseDate);
            
        }catch(Exception ex){
            
        }
        return calculatedDate;
    }
    
    public String sub(String stDate, long years, long months, long days){
            String calculatedDate= "null";
        try{    
            LocalDate baseDate = LocalDate.parse(stDate);
            baseDate = baseDate.minusYears(years).minusMonths(months).minusDays(days);
            calculatedDate= String.valueOf(baseDate);
        }catch(Exception ex){
            
        }
        return calculatedDate;
    }
}
