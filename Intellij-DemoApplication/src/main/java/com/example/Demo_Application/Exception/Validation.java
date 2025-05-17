package com.example.Demo_Application.Exception;

import java.util.List;

public class Validation extends RuntimeException{
    List<String> errors;
    String msg;

    public Validation(List<String> errors, String msg) {
        super();
        this.errors = errors;
        this.msg = msg;

    }

    public List<String> getErrors() {
        return errors;
    }
}
