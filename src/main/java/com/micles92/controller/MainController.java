package com.micles92.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lesiulol on 18.05.16.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET) //obsluga zadania typu GET na adres /
    public String home(){
        return "redirect:/exam/list";  //nazwa widoku index
    }
}
