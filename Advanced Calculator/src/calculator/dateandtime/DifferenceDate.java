/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.dateandtime;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Namita
 */
public class DifferenceDate {
    public String dateDiff( String d1,String d2){
        int year,month,day;
        String years = null,months = null,days = null;
        try{
            LocalDate initialDate = LocalDate.parse(d1);
            LocalDate finalDate = LocalDate.parse(d2);
            Period difference = Period.between(initialDate, finalDate);
            year= difference.getYears();
            month= difference.getMonths();
            day= difference.getDays();
            if(year<0){
                year*= -1;
            }
            if(month<0){
                month*= -1;
            }
            if(day<0){
                day*= -1;
            }
            
            if (year>1)
                years= String.valueOf(year)+"years ";
            else 
                years= String.valueOf(year)+"year ";

            if (month>1)
                months= String.valueOf(month)+"months ";
            else 
                months= String.valueOf(month)+"month ";

            if (day>1)
                days= String.valueOf(day)+"days ";
            else 
                days= String.valueOf(day)+"day ";
        }catch(Exception ex){
            
        }
        
           
        return years+" "+ months+" "+ days;
    }
}
