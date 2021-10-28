package model;

public class MenuItem {
    private MealType typeOfDayMeal;
    private Meal meal;
    private Drink drink;

    public MenuItem(MealType typeOfDayMeal, Meal meal, Drink drink) {
        this.typeOfDayMeal = typeOfDayMeal;
        this.meal = meal;
        this.drink = drink;
    }

    public MealType getTypeOfDayMeal() {
        return typeOfDayMeal;
    }

    public void setTypeOfDayMeal(MealType typeOfDayMeal) {
        this.typeOfDayMeal = typeOfDayMeal;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }
}
