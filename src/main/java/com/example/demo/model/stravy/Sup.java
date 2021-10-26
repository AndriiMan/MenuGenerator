package com.example.demo.model.stravy;

import javax.persistence.*;
import java.util.List;

@Entity
public class Sup {

    @Id
    @Column(name = "sup_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    @ElementCollection
    private List<String> ingredients;

    private int caloriesPerStoGram;
    private int gram;
    private int pricePerStoGram;
    private int calories;
    private int price;

    public Sup() {

    }

    public Sup(String name, List<String> ingredients, int caloriesPerStoGram, int gram, int pricePerStoGram) {
        this.name = name;
        this.ingredients = ingredients;
        this.caloriesPerStoGram = caloriesPerStoGram;
        this.gram = gram;
        this.pricePerStoGram = pricePerStoGram;
        this.calories = (gram * caloriesPerStoGram) / 100;
        this.price = (pricePerStoGram * gram) / 100;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCaloriesPerStoGram() {
        return caloriesPerStoGram;
    }

    public void setCaloriesPerStoGram(int caloriesPerStoGram) {
        this.caloriesPerStoGram = caloriesPerStoGram;
    }

    public int getGram() {
        return gram;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }

    public int getPricePerStoGram() {
        return pricePerStoGram;
    }

    public void setPricePerStoGram(int pricePerStoGram) {
        this.pricePerStoGram = pricePerStoGram;
    }

    public int getCalories() {
        return calories;
    }

    public int getPrice() {
        return price;
    }

}
