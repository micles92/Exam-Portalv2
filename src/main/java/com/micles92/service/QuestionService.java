package com.micles92.service;

import com.micles92.model.Question;

import java.util.List;

/**
 * Created by lesiulol on 23.05.16.
 */
public interface QuestionService {
    Question findOne(Long id);

    List<Question>findByExamId(Long examId);
}
