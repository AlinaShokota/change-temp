package com.changetemp.service;

import com.changetemp.model.Data;
import com.changetemp.repo.DataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService{

    @Autowired
    private DataRepo dataRepo;

    @Override
    public List<Data> getAllData() {
        return dataRepo.findAll();
    }
}
