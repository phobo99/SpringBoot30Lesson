package com.techmaster.basicthymeleaf.controller;

import com.techmaster.basicthymeleaf.model.Calculator;
import com.techmaster.basicthymeleaf.service.CalculatorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calService;
    
    @GetMapping
    public String getCalculatorFrom(Model model) {
        model.addAttribute("calculator", new Calculator());
        return "calculator";
    }
    
    @PostMapping
    public String handleCalculatorFrom(@ModelAttribute Calculator cal, BindingResult bindingResult, Model model) {
        if (!bindingResult.hasErrors()) {
            int result = calService.calculate(cal.getFirstNumber(), cal.getSecondNumber(), cal.getOperator());

            model.addAttribute("calcutator", cal);
            model.addAttribute("result", result);
        }
        return "calculator";
    }
}