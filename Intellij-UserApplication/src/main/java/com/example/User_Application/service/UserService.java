package com.example.User_Application.service;

import com.example.User_Application.Exception.Validation;
import com.example.User_Application.entity.UserEntity;
import com.example.User_Application.model.UserModel;
import com.example.User_Application.repository.UserRepository;
import com.example.User_Application.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void saving(UserModel userModel) {
        List<String> errors = new ArrayList<>();

        if (userModel.getName().isEmpty() || userModel.getName() == null) {
            errors.add("Name cannot be empty");
        }
        if (userModel.getEmail().isEmpty() || userModel.getEmail() == null) {
            errors.add("Email cannot be empty");
        }
        if (userModel.getPassword().isEmpty() || userModel.getPassword() == null) {
            errors.add("Password cannot be empty");
        }
        if (!errors.isEmpty()) {
            throw new Validation(errors, "Failed");
        }
        UserEntity userEntity = new UserEntity();
        userEntity.setName(userModel.getName());
        userEntity.setEmail(userModel.getEmail());
        userEntity.setPassword(userModel.getPassword());
        userRepository.save(userEntity);
    }

    public void login(UserModel userModel) {

        List<String> errors = new ArrayList<>();

        if (userModel.getEmail().isEmpty() || userModel.getEmail() == null) {
            errors.add("Email cannot be empty");
        }
        if (userModel.getPassword().isEmpty() || userModel.getPassword() == null) {
            errors.add("Password cannot be empty");
        }
        int count = userRepository.findByEmail(userModel.getEmail());
        if (count == 0) {
            errors.add("Invalid Email");
        } else {
            UserEntity userEntity = userRepository.findByEmailAndPassword(userModel.getEmail(), userModel.getPassword());
            if (userEntity == null) {
                errors.add("Invalid Password");
            }
        }
        if (!errors.isEmpty()) {
            throw new Validation(errors, "Failed");
        }
    }

    public void update(Long id, UserModel userModel) {
        List<String> errors = new ArrayList<>();
        int count = userRepository.checkId(id);
        if (count == 0) {
            errors.add("Invalid Id");
        }
        if (!errors.isEmpty()) {
            throw new Validation(errors, "Failed");
        }
        Optional<UserEntity> userEntity = userRepository.findById(id);
        if (userEntity.isPresent()) {
            UserEntity user = userEntity.get();
            user.setName(userModel.getName());
            user.setEmail(userModel.getEmail());
            user.setPassword(userModel.getPassword());

            userRepository.save(user);
        }
    }

    public void delete(Long id) {
        List<String> errors = new ArrayList<>();
        int count = userRepository.checkId(id);
        if (count == 0) {
            errors.add("Invalid Id");
        }
        if (!errors.isEmpty()) {
            throw new Validation(errors, "Failed");
        }
        Optional<UserEntity> userEntity = userRepository.findById(id);
        if (userEntity.isPresent()) {
            userRepository.deleteById(id);
        }
    }

    public ResponseEntity<Object> findUsersByLetter(String letter) {


        if (letter == null || letter.trim().isEmpty()) {

            return Response.generate(List.of("Search input cannot be empty or blank."), "Validation error", HttpStatus.BAD_REQUEST, null);
        }

        List<UserEntity> users = userRepository.findByNameStartingWithIgnoreCase(letter.trim());

        if (users.isEmpty()) {

            return Response.generate(List.of("No users found starting with the letter: " + letter), "Not Found", HttpStatus.NOT_FOUND, null);
        }

        return Response.generate(null, "Users found successfully", HttpStatus.OK, users);
    }
}