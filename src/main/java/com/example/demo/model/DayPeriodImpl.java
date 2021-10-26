package com.example.demo.model;

import com.example.demo.modelInterfaces.dayPeriod;

import javax.persistence.*;

@Entity
public class DayPeriodImpl implements dayPeriod {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

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

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String printDayPeriod() {
        return (name + " with " + calories + " calories");
    }
}