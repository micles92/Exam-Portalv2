package com.micles92.service.impl;

import com.micles92.dao.ResultDao;
import com.micles92.model.Exam;
import com.micles92.model.Question;
import com.micles92.model.Result;
import com.micles92.model.User;
import com.micles92.service.ExamService;
import com.micles92.service.QuestionService;
import com.micles92.service.ResultService;
import com.micles92.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * Created by lesiulol on 13.06.16.
 */
@Service
public class ResultServiceImpl implements ResultService {
    @Autowired
    ResultDao resultDao;

    @Autowired
    QuestionService questionService;


    public Result save(Result result){
       return resultDao.save(result);
    }

    public Result createNewResult(List<Question> questions, Exam exam, User user){
        Result result = new Result();

        result.setExam(exam);
        result.setUser(user);

        Collections.shuffle(questions);
        String sequence = generateSequence(questions);
        result.setSequence(sequence);
        result = save(result);
        return result;
    }

    public String generateSequence(List<Question> questions) {
        StringBuilder stringBuilder = new StringBuilder();

        String prefix = "";

        for (Question x: questions){
            stringBuilder.append(prefix);
            prefix =",";
            stringBuilder.append(x.getId());

        }

        return stringBuilder.toString();
    }

    public Question getFirstQuestion(String sequence) {
        String[] ids = sequence.split(",");

        Long questionId = Long.valueOf(ids[0]);

        return  questionService.findOne(questionId);
    }

    public Question getLastQuestion(String sequence) {
        String[] ids = sequence.split(",");

        Long questionId = Long.valueOf(ids[ids.length-1]);

        return questionService.findOne(questionId);
    }

    public Question getPreviousQuestion(String sequence, Long currentQuestionId) {
        String[] ids = sequence.split(",");

        int i;


        for (i=0; i<ids.length; i++){
           if (currentQuestionId.equals(Long.valueOf(ids[i]))){
             break;
           }
        }
        if(i == 0){
            return null;
        }
        Long questionId = Long.valueOf(ids[i-1]);


        return questionService.findOne(questionId);
    }

    public Question getNextQuestion(String sequence, Long currentQuestionId) {
        String[] ids = sequence.split(",");

        int i;


        for (i=0; i<ids.length; i++){
            if (currentQuestionId.equals(Long.valueOf(ids[i]))){
                break;
            }
        }

        if(i == ids.length-1){
            return null;
        }

        Long questionId = Long.valueOf(ids[i+1]);

        return questionService.findOne(questionId);
    }

    public Result findByUserAndExam(User user, Exam exam){
         return resultDao.findByUserAndExam(user, exam);
    }

}
