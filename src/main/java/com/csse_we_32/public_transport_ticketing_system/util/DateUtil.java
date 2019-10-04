package com.csse_we_32.public_transport_ticketing_system.util;

import org.springframework.stereotype.Component;
import sun.awt.ModalExclude;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {


    public static  final String[] days={"Sunday","Monday","TuesDay","Wednesday","Thursday","Friday","Saturday"};


    public static  String getDayByDate(String dateString){
        String day = "";


        Date date = null;
        try {
            date = new SimpleDateFormat("dd-MM-yyyy").parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        return integerToDay(date);
    }

    public static  String getDayByDate(Date date){
        String day=integerToDay(date);
        return day;
    }

    private static String integerToDay(Date date){
        String day="";
        try {




            switch (date.getDay()) {
                case 0:
                    day = days[0];
                    break;
                case 1:
                    day = days[1];
                    break;
                case 2:
                    day = days[2];
                    break;
                case 3:
                    day = days[3];
                    break;
                case 4:
                    day = days[4];
                    break;
                case 5:
                    day = days[5];
                    break;
                case 6:
                    day = days[6];
                    break;

            }

        }catch (Exception ex){
            ex.printStackTrace();
        }

        return  day;
    }

    public static  Date getDateByString(String dateString){



        Date date = null;
        try {
            date = new SimpleDateFormat("dd-MM-yyyy").parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        return date;
    }


}
