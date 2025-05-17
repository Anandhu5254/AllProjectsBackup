package com.example.User_Application.repository;

import com.example.User_Application.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {


    @Query("select count(email) from UserEntity u where u.email=:email")
    int findByEmail(@Param("email") String email);

    @Query("select u from UserEntity u where u.email=:email and u.password=:password")
    UserEntity findByEmailAndPassword(@Param("email") String email,@Param("password") String password);

    @Query("select count(id) from UserEntity u where u.id =:id")
    int checkId(@Param("id") Long id);

    List<UserEntity> findByNameStartingWithIgnoreCase(String name);
}