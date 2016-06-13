package com.micles92.service.impl;

import com.micles92.dao.QuestionDao;
import com.micles92.model.Question;
import com.micles92.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lesiulol on 23.05.16.
 */
@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionDao questionDao;

    public Question findOne(Long id) {
        return questionDao.findOne(id);
    }

    public List<Question> findByExamId(Long examId) {
        return questionDao.findByExamId(examId);
    }


}
