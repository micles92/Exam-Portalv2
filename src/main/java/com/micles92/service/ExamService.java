package com.micles92.service;

import com.micles92.model.Exam;

import java.util.List;

/**
 * Created by lesiulol on 18.05.16.
 */
public interface ExamService {

    List<Exam> findAll();

    Exam findById(long id);
}
