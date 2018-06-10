/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.dateandtime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 
 */
public class differenceBetweenDates {

    public int differencebetweendate(String initialDate,String finalDate) {
        Date date_1;
        Date date_2;
        try
        {
            date_1=new SimpleDateFormat("dd/MM/yyyy").parse(initialDate);
            date_2=new SimpleDateFormat("dd/MM/yyyy").parse(finalDate);
            long diff = date_2.getTime() - date_1.getTime();
            int number_of_days = (int) (diff / 1000 / 60 / 60 / 24);
        
        if(number_of_days < 0)
        {
            number_of_days = number_of_days * -1;
        }
            return (number_of_days);
        }
        catch(ParseException c)
                {
                    return 0;
                }

    }
}


