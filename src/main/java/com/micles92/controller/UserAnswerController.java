package com.micles92.controller;

import com.micles92.model.Exam;
import com.micles92.model.Question;
import com.micles92.model.Result;
import com.micles92.model.User;
import com.micles92.service.ExamService;
import com.micles92.service.ResultService;
import com.micles92.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by lesiulol on 30.05.16.
 */
@Controller
@RequestMapping("/user-answer")
public class UserAnswerController {

    @Autowired
    UserService userService;

    @Autowired
    ResultService resultService;

    @Autowired
    ExamService examService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveUserAnswers(@RequestParam(value = "answers",required = false) List<Long>answerIds,
                                  @RequestParam(value = "questionId", required = true)Long questionId,
                                  @RequestParam(value = "examId", required = true)Long examId, Model model){
        User user = userService.getLoggedUser();
        Exam exam = examService.findById(examId);
        model.addAttribute("examId",examId);
        System.out.println(answerIds);


        Result result = resultService.findByUserAndExam(user, exam);
        return "redirect:/question/" + resultService.getNextQuestion(result.getSequence(), questionId).getId();
    }

}
