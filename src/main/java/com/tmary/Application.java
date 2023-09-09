package com.tmary;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.time.DayOfWeek;
import java.time.LocalDate;


public class Application {

    public static void main(String[] args) {
        //runs today's date and determines the range of events
        LocalDate today = LocalDate.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("E, MM/dd/yyyy");
        String formattedDate = today.format(fmt);
        System.out.println("Today is: " + formattedDate);

        Date lastWeek = new Date();
        //searches array list of Members in said range

        //Displays the range
    }

    public static int dateRange () {
        // returns the start date and end date in an array
        Date[] range;

        // reads today's date and determines if it is a Sunday by a numerical value
        LocalDate today = LocalDate.now();
        DayOfWeek day = today.getDayOfWeek();

        if (day.getValue() == 7) {

        }
        return day.getValue();
    }
}
