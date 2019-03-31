package com.example.seleniumjunit5test.controller;

import com.example.seleniumjunit5test.model.AppModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Map;

@Controller
public class AppController {

    @GetMapping(path = "/input")
    public ModelAndView showInput() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("input");
        AppModel appModel = new AppModel();
        modelAndView.addObject("appModel", appModel);
        return modelAndView;
    }

    @PostMapping(path = "/confirm")
    public String redirectConfirm(@ModelAttribute("appModel") AppModel appModel, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("appModel", appModel);
        return "redirect:/confirm";
    }

    @GetMapping(path = "/confirm")
    public ModelAndView showConfirm(@ModelAttribute("appModel") AppModel appModel) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("confirm");
        modelAndView.addObject("appModel", appModel);
        return modelAndView;
    }

    @PostMapping(path = "/complete")
    public String redirectComplete() {
        return "redirect:complete";
    }

    @GetMapping(path = "/complete")
    public ModelAndView showComplete() {
        return new ModelAndView("complete");
    }
}
