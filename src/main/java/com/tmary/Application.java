package com.tmary;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Application {

    static Date today = new Date();
    static SimpleDateFormat fmt = new SimpleDateFormat("E, MM/dd/yyyy");
    static SimpleDateFormat dayFormat = new SimpleDateFormat("E");

    public static void main(String[] args) {
        //runs today's date and determines the range of events
        String formattedDate = fmt.format(today);
        System.out.println("Today is: " + formattedDate);

        Date[] range = dateRange();

        for (int i = 0; i < range.length; i++){
            System.out.println(range[i]);
        }

        /*Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR,-1);
        Date yesterday = calendar.getTime();
        String yesterdayFormatted = fmt.format(yesterday);
        System.out.println("Yesterday was: " + yesterdayFormatted);*/

        //searches array list of Members in said range

        //Displays the range
    }

    public static Date[] dateRange () {
        // returns the start date and end date in an array
        Date[] range = new Date[2];
        Calendar calendar = Calendar.getInstance();
        String dayOfWeek = dayFormat.format(today);

        // reads today's date and determines if it is a Sunday by a numerical value
        if (!dayOfWeek.equalsIgnoreCase("Sun")) {
            while (!dayOfWeek.equalsIgnoreCase("Sun")) {
                calendar.add(Calendar.DAY_OF_YEAR, -1);
                Date referecnceDate = calendar.getTime();
                dayOfWeek = dayFormat.format(referecnceDate);

            }

        }
        calendar.add(Calendar.DAY_OF_YEAR,-1);
        range[0] = calendar.getTime();
        calendar.add(Calendar.DAY_OF_YEAR,-6);
        range[1] = calendar.getTime();
        return range;
    }
}
