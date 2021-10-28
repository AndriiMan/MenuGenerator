import model.Drink;
import model.Meal;
import model.MenuItem;
import model.MealType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateMenuTests {
    @Test
    void getEmptyMenu() {
        List<MenuItem> actual = new Menu().generate();
        List<MenuItem> expected = new ArrayList<>();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMenuIsNotNull() {
        MealType mealType1 = new MealType();
        List<MealType> mealTypeList = new ArrayList<>();
        //mealTypeList.add(mealType1);
        Menu menu = new Menu();
        List<MenuItem> menuCategories = menu.getMenu(mealTypeList);

        Assertions.assertNotNull(menuCategories);
    }

    @Test
    void getOneSupperMenu() {
        MealType supper = new MealType("Supper");
        List<MenuItem>  actualMenu = new Menu().generate(supper);

        List<MenuItem> expected = Arrays.asList(
                new MenuItem(supper, new Meal(), new Drink())
        );

        Assertions.assertEquals(actualMenu.size(), expected.size());
    }

    @Test
    void getMultipleMealsMenu() {
        MealType supper = new MealType("Supper");
        MealType breakfast = new MealType("Breakfast");
        List<MenuItem>  actualMenu = new Menu().generate(breakfast, supper);

        List<MenuItem> expected = Arrays.asList(
                new MenuItem(breakfast, new Meal(), new Drink()),
                new MenuItem(breakfast, new Meal(), new Drink()),
                new MenuItem(supper, new Meal(), new Drink())
        );

        Assertions.assertEquals(actualMenu.size(), expected.size());
    }
}
