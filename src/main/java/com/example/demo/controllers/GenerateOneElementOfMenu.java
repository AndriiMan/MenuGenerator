package com.example.demo.controllers;

import com.example.demo.DayPeriod;
import com.example.demo.GenerateMenu;
import com.example.demo.model.DayPeriodImpl;
import com.example.demo.model.MenuCategory;
import com.example.demo.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;


@Controller
public class GenerateOneElementOfMenu {

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    GenerateMenu generateMenu;

    @GetMapping
    public String createPasswordForUser(Model model) {
        model.addAttribute("att", "Something");
        return "menu";
    }

    @GetMapping("/getMenu")
    public String getMenu(Model model) {
        Iterable<DayPeriodImpl> dayPeriods = menuRepository.findAll();
        model.addAttribute("dayPeriods", dayPeriods);
        List<MenuCategory> menu = generateMenu.getMenu();
        System.out.println(menu.get(0).getDrink().getName());
        return "menu";
    }

    @GetMapping("/addMenu")
    public String addMenu(Model model) {
        return "addmenu";
    }

    @PostMapping("/addMenu")
    public String addMenuPost(@RequestParam String name, @RequestParam int calories, Model model) {
        DayPeriodImpl dayPeriod = new DayPeriodImpl(name, calories);
        menuRepository.save(dayPeriod);
        return "redirect:/addMenu";
    }

    @PostMapping("/post")
    public ResponseEntity<String> getMenu(String menu, int calories) {
        try {
            DayPeriod.valueOf(menu);
        } catch (Exception e) {
            return new ResponseEntity<>(new NullPointerException().toString(), HttpStatus.BAD_REQUEST);
        }
        DayPeriodImpl dayPeriod;
        dayPeriod = new DayPeriodImpl(menu, calories);
        return new ResponseEntity<>(dayPeriod.printDayPeriod(), HttpStatus.ACCEPTED);
    }
}