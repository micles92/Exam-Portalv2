package com.micles92.controller;

import org.springframework.stereotype.Controller;
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

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveUserAnswers(@RequestParam(value = "answers",required = false) List<Long>answerIds){
        System.out.println(answerIds);
        return "redirect:/question/" + 1;
    }

}
