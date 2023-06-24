package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {

    @GetMapping("/")
    public String showAdditionForm(Model model) {
        model.addAttribute("number1", 0);
        model.addAttribute("number2", 0);
        return "addition-form.html";
        }

    @PostMapping("/add")
    public String performAddition(Model model,@RequestParam("number1") int number1,
                                  @RequestParam("number2") int number2) {
        int sum = number1 + number2;


        model.addAttribute("sum", sum);
        return "result.html";
    }
}