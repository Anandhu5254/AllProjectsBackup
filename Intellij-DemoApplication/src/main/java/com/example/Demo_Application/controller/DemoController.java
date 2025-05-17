package com.example.Demo_Application.controller;

import com.example.Demo_Application.Exception.Validation;
import com.example.Demo_Application.entity.DemoEntity;
import com.example.Demo_Application.model.DemoModel;
import com.example.Demo_Application.response.Response;
import com.example.Demo_Application.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exam")
public class DemoController {
    @Autowired
    DemoService demoService;

    @PostMapping("/results")
    public ResponseEntity<String> saving(@RequestBody DemoModel demoModel) {
        demoService.saving(demoModel);
        return ResponseEntity.ok("Saved");
    }

    @GetMapping("/listing")
    public ResponseEntity<List<DemoEntity>> listing() {

        List<DemoEntity> demoEntity = demoService.listing();
        return ResponseEntity.ok(demoEntity);
    }

    @GetMapping("/search/{letter}")
    public ResponseEntity<?> findUsersByLetter(@PathVariable String letter) {
        try {
            List<DemoEntity> users = demoService.findUsersByLetter(letter); // Fix: Capture the result here
            return Response.generate(null, "Users found successfully", HttpStatus.OK, users); // Return the users found
        } catch (Validation c) {
            return Response.generate(c.getErrors(), "No users found", HttpStatus.BAD_REQUEST, null);
        }
    }
}
