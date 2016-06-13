package com.micles92.dao;

import com.micles92.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lesiulol on 23.05.16.
 */
@Repository
public interface QuestionDao extends JpaRepository<Question, Long> {
    List<Question>findByExamId(Long examId);
}
