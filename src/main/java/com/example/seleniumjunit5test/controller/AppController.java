package com.example.seleniumjunit5test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @GetMapping(value = "/input")
    public ModelAndView showInput() {

        return new ModelAndView("views/input");
    }
}
