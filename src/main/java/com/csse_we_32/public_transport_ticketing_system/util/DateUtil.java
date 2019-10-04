package com.csse_we_32.public_transport_ticketing_system.util;

import org.springframework.stereotype.Component;
import sun.awt.ModalExclude;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static final String SUNDAY="Sunday";
    public static final String SATURDAY="Saturday";
    public static final String MONDAY="Monday";
    public static final String TUESDAY="TuesDay";
    public static final String WEDNESDAY="Wednesday";
    public static final String THURSDAY="Thursday";
    public static final String FRIDAY="Friday";


    public static  String getDayByDate(String dateString){
        String day = "";
        try {

            Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dateString);

            date.getDay();
            switch (date.getDay()) {
                case 0:
                    day = SUNDAY;
                    break;
                case 1:
                    day = MONDAY;
                    break;
                case 2:
                    day = TUESDAY;
                    break;
                case 3:
                    day = WEDNESDAY;
                    break;
                case 4:
                    day = THURSDAY;
                    break;
                case 5:
                    day = FRIDAY;
                    break;
                case 6:
                    day = SATURDAY;
                    break;

            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return day;
    }

    public static  String getDayByDate(Date date){
        String day="";
        try {




            switch (date.getDay()) {
                case 0:
                    day = SUNDAY;
                    break;
                case 1:
                    day = MONDAY;
                    break;
                case 2:
                    day = TUESDAY;
                    break;
                case 3:
                    day = WEDNESDAY;
                    break;
                case 4:
                    day = THURSDAY;
                    break;
                case 5:
                    day = FRIDAY;
                    break;
                case 6:
                    day = SATURDAY;
                    break;

            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return day;
    }
}
