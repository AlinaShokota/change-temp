package com.changetemp.controller;

import com.changetemp.model.Data;
import com.changetemp.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data")
@CrossOrigin(origins = "*")
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("/all")
    public ResponseEntity<List<Data>> getAllData(){
        return ResponseEntity.ok(dataService.getAllData());
    }

//    @GetMapping("/latest")
//    public ResponseEntity<Data> getLatestData(){
//        List<Data> allData = dataService.getAllData();
//        Data latestData = allData.get(allData.size() - 1);
//        return ResponseEntity.ok(latestData);
//    }

    @GetMapping("/latest")
    public ResponseEntity<Integer> getLatestData(){
        List<Data> allData = dataService.getAllData();
        Data latestData = allData.get(allData.size() - 1);
        return ResponseEntity.ok(latestData.getTValue());
    }

}
