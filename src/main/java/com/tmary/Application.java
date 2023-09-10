package com.tmary;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Application {

    /* creates a global variable for today's date as well as the formatter
    used in the application */
    static Date today = new Date();
    static SimpleDateFormat fmt = new SimpleDateFormat("E, MM/dd/yyyy");
    static SimpleDateFormat dayFormat = new SimpleDateFormat("E");
    static ArrayList <Members> membersList = new ArrayList<>();

    public static void main(String[] args) {
        // Collects data from ExcelDataManager

        // displays today's date
        String formattedDate = fmt.format(today);
        System.out.println("Today is: " + formattedDate);

        // references today's date to determine the range of the search
        Date[] range = dateRange();

        // Displays the range
        for (Date date : range) {
            System.out.println(date);
        }

        //searches array list of Members in said range

    }

    public static Date[] dateRange () {

        Date[] range = new Date[2];
        Calendar calendar = Calendar.getInstance();
        String dayOfWeek = dayFormat.format(today);

        // reads today's date and determines if it is a Sunday by a numerical value
        // otherwise it subtracts the date until it is Sunday again
        if (!dayOfWeek.equalsIgnoreCase("Sun")) {
            while (!dayOfWeek.equalsIgnoreCase("Sun")) {
                calendar.add(Calendar.DAY_OF_YEAR, -1);
                Date referecnceDate = calendar.getTime();
                dayOfWeek = dayFormat.format(referecnceDate);

            }

        }
        // adds the previous Saturday and Sunday to the Array
        calendar.add(Calendar.DAY_OF_YEAR,-1);
        range[1] = calendar.getTime();
        calendar.add(Calendar.DAY_OF_YEAR,-6);
        range[0] = calendar.getTime();

        // returns the start date and end date in an array
        return range;
    }
}
