package com.example.exam.entity;

import jakarta.persistence.*;

@Entity
@Table(name ="students")
public class ExamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String studentClass;
    private String mark;
    private String gender;

    public ExamEntity() {
    }

    public ExamEntity(long id, String name, String studentClass, String mark, String gender) {
        this.id = id;
        this.name = name;
        this.studentClass = studentClass;
        this.mark = mark;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
