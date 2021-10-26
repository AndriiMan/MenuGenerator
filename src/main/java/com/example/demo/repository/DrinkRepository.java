package com.example.demo.repository;

import com.example.demo.model.stravy.Drink;
import com.example.demo.model.stravy.Sup;
import org.springframework.data.repository.CrudRepository;

public interface DrinkRepository extends CrudRepository<Drink, Long> {
}
