package com.example.demo.repository;

import com.example.demo.model.DayPeriodImpl;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface MenuRepository extends CrudRepository<DayPeriodImpl, Long> {
    List<DayPeriodImpl> findAll();
}
