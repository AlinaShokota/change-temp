package com.changetemp.repo;

import com.changetemp.model.GoalTemperature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoalTemperatureRepo extends JpaRepository<GoalTemperature, Integer> {
}
