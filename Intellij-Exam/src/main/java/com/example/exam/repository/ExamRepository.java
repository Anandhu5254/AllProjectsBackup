package com.example.exam.repository;

import com.example.exam.entity.ExamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExamRepository extends JpaRepository<ExamEntity,Long> {

    public List<ExamEntity> findByMark(String mark);

    List<ExamEntity> findByMarkLessThan(String mark);

    @Query("SELECT e FROM ExamEntity e WHERE e.mark = (SELECT MAX(mark) FROM ExamEntity)")
    List<ExamEntity> findStudentsWithHighestMark();

}
