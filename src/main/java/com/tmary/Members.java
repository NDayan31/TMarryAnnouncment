package com.tmary;

import java.time.LocalDate;

public class Members {

    int id;
    String name;
    LocalDate dateOfBirth;
    int weekNumber;

    public Members() {
    }

    public Members(int id, String name, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Members(int id, String name, LocalDate dateOfBirth, int weekNumber) {
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getWeekNumber() {
        return weekNumber;
    }
}
