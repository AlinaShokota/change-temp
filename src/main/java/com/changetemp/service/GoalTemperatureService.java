package com.changetemp.service;

import com.changetemp.model.Data;
import com.changetemp.model.GoalTemperature;

import java.util.List;

public interface GoalTemperatureService {
    void addGoalTemp(GoalTemperature goalTemperature);
    List<GoalTemperature> getAllData();
}
