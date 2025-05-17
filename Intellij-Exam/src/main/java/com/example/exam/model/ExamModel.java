package com.example.exam.model;

public class ExamModel {

    private String name;
    private String studentClass;
    private String mark;
    private String gender;

    public ExamModel() {
    }

    public ExamModel(String name, String studentClass, String mark, String gender) {
        this.name = name;
        this.studentClass = studentClass;
        this.mark = mark;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
