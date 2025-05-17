package com.example.exam.service;

import com.example.exam.entity.ExamEntity;
import com.example.exam.model.ExamModel;
import com.example.exam.repository.ExamRepository;
import com.example.exam.validation.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ExamService {
    @Autowired
    ExamRepository examRepository;

    public void saving(ExamModel examModel) {
        List<String>errors= new ArrayList<>();

        if(examModel.getName().isEmpty()||examModel.getName()==null){
            errors.add("Name cannot be empty");
        }
        if(examModel.getGender().isEmpty()||examModel.getGender()==null){
            errors.add("Gender cannot be empty");
        }
        if(examModel.getMark().isEmpty()||examModel.getMark()==null){
            errors.add("Mark cannot be empty");
        }
        if(examModel.getStudentClass().isEmpty()||examModel.getStudentClass()==null){
            errors.add("Student class cannot be empty");
        }
        if(!errors.isEmpty()){
            throw new Validation(errors,"Failed");
        }
        ExamEntity examEntity= new ExamEntity();
        examEntity.setName(examModel.getName());
        examEntity.setMark(examModel.getMark());
        examEntity.setGender(examModel.getGender());
        examEntity.setStudentClass(examModel.getStudentClass());
        examRepository.save(examEntity);
    }

    public List<ExamEntity> listing() {
        List<ExamEntity> studentslist= examRepository.findAll();
        return studentslist;
    }

    public List<ExamEntity> getStudentsWithMarkBelow60() {

            return examRepository.findByMarkLessThan("60");

    }
    public int deleteStudentsWithMark(String mark) {
        List<String> errors = new ArrayList<>();
        List<ExamEntity> students = examRepository.findByMark(mark);

        if (students.isEmpty()) {
            errors.add("No students found with mark " + mark);
            throw new Validation(errors, "Failed to delete students");
        }

        examRepository.deleteAll(students);


        return students.size();
    }

    public List<ExamEntity> findStudentsWithHighestMark() {
        return examRepository.findStudentsWithHighestMark();
    }
}


