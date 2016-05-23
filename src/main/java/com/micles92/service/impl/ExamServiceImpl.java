package com.micles92.service.impl;

import com.micles92.dao.ExamDao;
import com.micles92.model.Exam;
import com.micles92.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lesiulol on 23.05.16.
 */
@Service
public class ExamServiceImpl implements ExamService{
    @Autowired
    private ExamDao examDao;

    public List<Exam> findAll() {
        return examDao.findAll();
    }
}
