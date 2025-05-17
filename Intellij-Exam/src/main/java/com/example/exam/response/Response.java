package com.example.exam.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Response {
    public static ResponseEntity<Object> generate(List<String> error, String message, HttpStatus status) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", message);
        response.put("error", error);
        response.put("status", status.value());

        return new ResponseEntity<>(response,status);

    }
}
