package com.example.exam.controller;

import com.example.exam.entity.ExamEntity;
import com.example.exam.model.ExamModel;
import com.example.exam.response.Response;
import com.example.exam.service.ExamService;
import com.example.exam.validation.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class ExamController {

    @Autowired
    ExamService examService;

    @PostMapping("/save")
    public ResponseEntity<?> saving(@RequestBody ExamModel examModel) {
        try {
            examService.saving(examModel);
            return Response.generate(null, "Student Registered successfully", HttpStatus.OK);
        } catch (Validation e) {
            return Response.generate(e.getErrors(), "Failed", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/listing")
    public ResponseEntity<List<ExamEntity>> listing() {
        List<ExamEntity> examEntity = examService.listing();
        return ResponseEntity.ok(examEntity);
    }

    @GetMapping("/students/below-60")
    public ResponseEntity<?> getStudentsWithMarkBelow60() {
        List<ExamEntity> students = examService.getStudentsWithMarkBelow60();
        if (students.isEmpty()) {
            return Response.generate(null, "No students found with marks below 60", HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(students);
    }

    @DeleteMapping("/students/delete/{mark}")
    public ResponseEntity<?> deleteStudentsWithMark(@PathVariable String mark) {
        try {
            int deletedCount = examService.deleteStudentsWithMark(mark);
            if (deletedCount > 0) {
                return Response.generate(null, deletedCount + " students deleted with mark " + mark, HttpStatus.OK);
            } else {
                return Response.generate(null, "No students found with mark " + mark, HttpStatus.NOT_FOUND);
            }
        } catch (Validation e) {
            return Response.generate(e.getErrors(), "Validation failed", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/highest-scorers")
    public ResponseEntity<?> getStudentsWithHighestMark() {
        List<ExamEntity> students = examService.findStudentsWithHighestMark();
        if (students.isEmpty()) {
            return Response.generate(null, "No students found", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(students);
    }

    }

