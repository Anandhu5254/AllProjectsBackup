package com.example.Demo_Application.model;

public class DemoModel {
  private String Name;
  private String Grade;
  private String Mark;

    public DemoModel() {
    }

    public DemoModel(String name, String grade, String mark) {
        Name = name;
        Grade = grade;
        Mark = mark;
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
