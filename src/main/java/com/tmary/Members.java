package com.tmary;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Members {

    private int id;
    private String name;
    private Date dateOfBirth;
    private int weekNumber;

    public Members() {
    }

    public Members(int id, String name, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Members(int id, String name, Date dateOfBirth, int weekNumber) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.weekNumber = weekNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    @Override
    public String toString() {
        SimpleDateFormat fmt = new SimpleDateFormat("MM/dd");
        String birthday = fmt.format(dateOfBirth);
        return name + " born on " + birthday;
    }
}
