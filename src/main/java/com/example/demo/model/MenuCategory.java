package com.example.demo.model;

import com.example.demo.model.stravy.Drink;
import com.example.demo.model.stravy.Sup;

public class MenuCategory {
    private String name;
    private Sup sup;
    private Drink drink;

    public MenuCategory() {
    }

    public MenuCategory(String name, Sup sup, Drink drink) {
        this.name = name;
        this.sup = sup;
        this.drink = drink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sup getSup() {
        return sup;
    }

    public void setSup(Sup sup) {
        this.sup = sup;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }
}
