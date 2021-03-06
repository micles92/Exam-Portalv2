package com.micles92.controller;

import com.micles92.model.Exam;
import com.micles92.model.Question;
import com.micles92.model.Result;
import com.micles92.model.User;
import com.micles92.service.ExamService;
import com.micles92.service.QuestionService;
import com.micles92.service.ResultService;
import com.micles92.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collections;
import java.util.List;

/**
 * Created by lesiulol on 18.05.16.
 */
@Controller
@RequestMapping("/exam")
public class ExamController {
    @Autowired
    private ExamService examService;

    @Autowired
    private QuestionService questionService;

    @Autowired
    private UserService userService;

    @Autowired
    private ResultService resultService;


    @RequestMapping("/list")
    public String listExams(Model model){
        List<Exam>exams = examService.findAll();
        model.addAttribute("exams", exams);
        return "exam-list";
    }

    @RequestMapping(value = "/take/{examId}", method = RequestMethod.GET)
    public String takeExam(Model model, @PathVariable("examId") Long examId){
     List<Question>questions;
        Exam exam = examService.findById(examId);
        User user = userService.getLoggedUser();
        questions = questionService.findByExamId(examId);
        model.addAttribute("examId", examId);

       Result result = resultService.createNewResult(questions, exam, user);

        return "redirect:/question/" +  resultService.getFirstQuestion(result.getSequence()).getId();

    }

}
