package com.example.demo.repository;

import com.example.demo.model.DayPeriodImpl;
import com.example.demo.model.stravy.Sup;
import org.springframework.data.repository.CrudRepository;

public interface SupRepository extends CrudRepository<Sup, Long> {
}
