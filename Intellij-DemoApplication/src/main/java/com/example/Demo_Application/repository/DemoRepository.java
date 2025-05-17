package com.example.Demo_Application.repository;

import com.example.Demo_Application.entity.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DemoRepository extends JpaRepository<DemoEntity,Long> {

    List<DemoEntity> findByNameStartingWithIgnoreCase(String name);
}
