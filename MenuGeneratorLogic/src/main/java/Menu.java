import model.Drink;
import model.Meal;
import model.MenuItem;
import model.MealType;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    public List<MenuItem> getMenu(List<MealType> meals) {

        List<MenuItem> mealCategoriesList = new ArrayList<>();

        for (MealType meal : meals) {
            mealCategoriesList.add(getMenuCategory(meal));
        }

        return mealCategoriesList;
    }

    private MenuItem getMenuCategory(MealType day) {
        Meal meal = getGeneratedMeal();
        Drink drink = new Drink();
        return new MenuItem(day, null, null);
    }

    private Meal getGeneratedMeal() {
        return new Meal();
    }

    public List<MenuItem> generate(MealType... types) {
        List<MenuItem> mealCategoriesList = new ArrayList<>();

        for (MealType meal : types) {
            mealCategoriesList.add(getMenuCategory(meal));
        }

        return mealCategoriesList;
    }
}
