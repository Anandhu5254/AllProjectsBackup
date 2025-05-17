package com.example.Demo_Application.service;

import com.example.Demo_Application.Exception.Validation;
import com.example.Demo_Application.entity.DemoEntity;
import com.example.Demo_Application.model.DemoModel;
import com.example.Demo_Application.repository.DemoRepository;
import com.example.Demo_Application.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoService {
    @Autowired
    DemoRepository demoRepository;

    public void saving(DemoModel demoModel) {
        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setName(demoModel.getName());
        demoEntity.setMark(demoModel.getMark());
        demoEntity.setGrade(demoModel.getGrade());
        demoRepository.save(demoEntity);
    }

    public List<DemoEntity> listing() {
        List<DemoEntity> demolist = demoRepository.findAll();
        return demolist;
    }

    public List<DemoEntity> findUsersByLetter(String letter) {
        List<DemoEntity> users = demoRepository.findByNameStartingWithIgnoreCase(letter.trim());
        List<String> errors = new ArrayList<>();
        if (users.isEmpty()) {
            errors.add("No users found");
        }
        if (!errors.isEmpty()) {
            throw new Validation(errors, "Failed");
        }
        return users; // Return the users so the controller can send the response
    }

}
