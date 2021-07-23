package com.techmaster.basicthymeleaf.controller;

import com.techmaster.basicthymeleaf.repository.InMemoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {
    
    @Autowired
    private InMemoryRepository repository;

    @GetMapping("/listperson")
    public String getPerson(Model model) {
        model.addAttribute("persons", repository.getPerson());
        return "listperson";
    }

    @GetMapping("/listperson2")
    public String getPerson2(Model model) {
        model.addAttribute("persons", repository.getPerson());
        return "listperson2";
    }
}