package com.example.demo;

import com.example.demo.model.DayPeriodImpl;
import com.example.demo.model.MenuCategory;
import com.example.demo.model.stravy.Drink;
import com.example.demo.model.stravy.Sup;
import com.example.demo.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GenerateMenu {

    @Autowired
    private MenuRepository menuRepository;

    public List<MenuCategory> getMenu() {
        List<MenuCategory> menu = new ArrayList<>();

        List<DayPeriodImpl> dayPeriods = menuRepository.findAll();

        for (DayPeriodImpl day : dayPeriods) {
            menu.add(getMenuCategory(day));
        }
       /* while (dayPeriods.iterator().hasNext())
        {
            DayPeriodImpl dayPeriod = dayPeriods.iterator().next();
            menu.add(getMenuCategory(dayPeriod));
        }*/

        return menu;
    }

    public MenuCategory getMenuCategory(DayPeriodImpl dayPeriods) {
        int calories = dayPeriods.getCalories();
        int supCal = (calories * 20) / 100;
        int stravaCal = (calories * 65) / 100;
        int salatCal = (calories * 15) / 100;

        List<String> borshchIngredients = Arrays.asList("Zelen", "Miaso");
        Sup borshch = new Sup("Борщ", borshchIngredients, 100, 20, 50);
        List<String> tea2Ingredients = Arrays.asList("Ромашка", "Вода");
        Drink tea2 = new Drink("Чай ромашковий", tea2Ingredients, 100, 20, 50);

        MenuCategory menuCategory = new MenuCategory(dayPeriods.getName(), borshch, tea2);

        return menuCategory;
    }
}