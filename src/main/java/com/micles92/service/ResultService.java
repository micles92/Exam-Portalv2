package com.micles92.service;

import com.micles92.model.Exam;
import com.micles92.model.Question;
import com.micles92.model.Result;
import com.micles92.model.User;

import java.util.List;

/**
 * Created by lesiulol on 13.06.16.
 */
public interface ResultService {

    Result save(Result result);

    Result createNewResult(List<Question> questions, Exam exam, User user);

    String generateSequence(List<Question> questions);

    Question getFirstQuestion(String sequence);

    Question getLastQuestion(String sequence);

    Question getPreviousQuestion(String sequence, Long currentQuestionId);

    Question getNextQuestion(String sequence, Long currentQuestionId);

    Result findByUserAndExam(User user, Exam exam);
}
