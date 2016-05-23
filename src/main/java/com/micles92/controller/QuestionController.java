package com.micles92.controller;

import com.micles92.model.Question;
import com.micles92.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lesiulol on 23.05.16.
 */
@Controller
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String viewQestion(Model model, @PathVariable("id") Long id){
        Question question = questionService.findOne(id);
        model.addAttribute("question", question);
        return "question";
    }
}
