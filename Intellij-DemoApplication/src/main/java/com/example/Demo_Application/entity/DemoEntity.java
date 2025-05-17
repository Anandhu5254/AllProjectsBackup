package com.example.Demo_Application.entity;

import jakarta.persistence.*;

@Entity
@Table(name="marks")
public class DemoEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="UserId")
    private  Long ID;
    private String  Name;
    private String  Grade;
    private String  Mark;

    public DemoEntity() {
    }

    public DemoEntity(Long ID, String name, String grade, String mark) {
        this.ID = ID;
        Name = name;
        Grade = grade;
        Mark = mark;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public String getMark() {
        return Mark;
    }

    public void setMark(String mark) {
        Mark = mark;
    }
}
