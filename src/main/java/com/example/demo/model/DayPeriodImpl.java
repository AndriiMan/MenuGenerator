package com.example.demo.model;

import com.example.demo.modelInterfaces.dayPeriod;

public class DayPeriodImpl implements dayPeriod {
    private String name;
    private int calories;

    public DayPeriodImpl() {
    }

    public DayPeriodImpl(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String printDayPeriod() {
        return (name + " with " + calories+" calories");
    }

}