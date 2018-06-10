/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.dateandtime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author 
 */
public class addOrSubtractFromCurrentDate {
    public  String addSubtractMonth(int n){
      DateFormat dateFormat=new SimpleDateFormat("mm/dd/yyyy");
        Calendar cal= Calendar .getInstance();
        cal.add(Calendar.MONTH,n);
        String result =dateFormat.format(cal.getTime());
        return result;  
        
        
    }
    public String addSubtractYear(int n){
        DateFormat dateFormat=new SimpleDateFormat("mm/dd/yyyy");
        Calendar cal= Calendar .getInstance();
        cal.add(Calendar.YEAR,n);
        String result =dateFormat.format(cal.getTime());
        return result;
        
    }
}
