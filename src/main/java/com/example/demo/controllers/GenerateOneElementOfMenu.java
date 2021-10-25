package com.example.demo.controllers;

import com.example.demo.DayPeriod;
import com.example.demo.model.DayPeriodImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenerateOneElementOfMenu {

    @GetMapping("/get")
    public String createPasswordForUser() {
        return "Greetings from Spring Boot!";
    }

    @PostMapping("/post")
    public ResponseEntity<String> getMenu(String menu, int calories) throws Exception {

        System.out.println(menu);
        DayPeriod myVar;
        try {
            myVar = DayPeriod.valueOf(menu);
        } catch (Exception e) {
            return new ResponseEntity<>(new NullPointerException().toString(), HttpStatus.BAD_REQUEST);
        }
        DayPeriodImpl dayPeriod;
        switch (myVar) {
            case BREAKFAST:
                System.out.println("YES1");
                dayPeriod = new DayPeriodImpl(menu,calories);
                break;
            case DINNER:
                dayPeriod = new DayPeriodImpl(menu,calories);
                break;
            case LUNCH:
                dayPeriod = new DayPeriodImpl(menu,calories);
                break;
            case SUPPER:
                dayPeriod = new DayPeriodImpl(menu,calories);
                break;
            default:
                throw new Exception("Exception message");
        }
        System.out.println(dayPeriod.getName());
        return new ResponseEntity<>(dayPeriod.printDayPeriod(), HttpStatus.ACCEPTED);
    }
}