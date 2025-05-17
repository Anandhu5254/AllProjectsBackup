package com.example.User_Application.response;

import com.example.User_Application.entity.UserEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Response {
    public static <T> ResponseEntity<Object> generate(List<String> error, String message, HttpStatus status, T data) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", message);
        response.put("error", error);
        response.put("status", status.value());
        response.put("data", data);  // 'data' can now be any type

        return new ResponseEntity<>(response, status);
    }
}