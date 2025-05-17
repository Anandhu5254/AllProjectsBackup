
package com.example.User_Application.controller;

import com.example.User_Application.Exception.Validation;
import com.example.User_Application.entity.UserEntity;
import com.example.User_Application.model.UserModel;
import com.example.User_Application.response.Response;
import com.example.User_Application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/save")
    public ResponseEntity<?> saving(@RequestBody UserModel userModel) {
        try {
            userService.saving(userModel);
            return Response.generate(null, "User Registered Successfully", HttpStatus.OK, null);
        } catch (Validation e) {
            return Response.generate(e.getErrors(), "Failed", HttpStatus.BAD_REQUEST, null);
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserModel userModel) {
        try {
            userService.login(userModel);
            return Response.generate(null, "Login Successfully", HttpStatus.OK, null);
        } catch (Validation v) {
            return Response.generate(v.getErrors(), "Login Failed", HttpStatus.BAD_REQUEST, null);
        }
    }


    @PostMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody UserModel userModel) {
        try {
            userService.update(id, userModel);
            return Response.generate(null, "Update Successful", HttpStatus.OK, null);
        } catch (Validation b) {
            return Response.generate(b.getErrors(), "Update Failed", HttpStatus.BAD_REQUEST, null);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        try {
            userService.delete(id);
            return Response.generate(null, "Successfully Deleted", HttpStatus.OK, null);
        } catch (Validation b) {
            return Response.generate(b.getErrors(), "Failed to Delete", HttpStatus.BAD_REQUEST, null);
        }
    }

    @GetMapping("/search/{letter}")
    public ResponseEntity<Object> searchUsersByLetter(@PathVariable String letter) {

        return userService.findUsersByLetter(letter);
    }
}
