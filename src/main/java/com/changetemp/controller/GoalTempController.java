package com.changetemp.controller;

import com.changetemp.model.Data;
import com.changetemp.model.GoalTemperature;
import com.changetemp.service.GoalTemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/setTemp")
@CrossOrigin(origins = "*")
public class GoalTempController {

    @Autowired
    GoalTemperatureService goalTemperatureService;

    GoalTemperature GOAL_TEMP;

    @PostMapping("/save")
    public ResponseEntity setGoalTemp(@RequestBody Integer temp){
        System.out.println("****************************8");
        System.out.println(temp);
        GoalTemperature goalTemperature = new GoalTemperature(LocalDate.now(), temp, LocalTime.now());
        goalTemperatureService.addGoalTemp(goalTemperature);
        GOAL_TEMP=goalTemperature;
        return ResponseEntity.ok().build();
    }

//    @GetMapping("/latest")
//    public ResponseEntity<Integer> getLatestData(){
//        Integer latestGoalTemp;
//        if (GOAL_TEMP == null){
//            DataController dataController = new DataController();
//            ResponseEntity<Integer> latestData = dataController.getLatestData();
//            latestGoalTemp = latestData.getBody();
//        }else {
//            latestGoalTemp = GOAL_TEMP.getTValue();
//        }
//        return ResponseEntity.ok(latestGoalTemp);
//    }

    @GetMapping("/latest")
    public ResponseEntity<Integer> getAllData(){
        List<GoalTemperature> allData = goalTemperatureService.getAllData();
        System.out.println(allData);
        GoalTemperature latestData = allData.get(allData.size() - 1);
        return ResponseEntity.ok(latestData.getTValue());
    }

}
