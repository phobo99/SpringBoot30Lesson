package com.techmaster.film.controller;

import java.util.List;

import com.techmaster.film.model.Film;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/")
public class FilmController {

    @GetMapping("/film")
    public String listBooks(Model model) {
        List<Film> films = List.of(new Film("Titanic", "Lang man", "James Cameron", 1992),
                new Film("Game of Thrones", "hanh dong", " David Benioff ", 2021),
                new Film("Toys", "hoat hinh", " David Osspina ", 2021),
                new Film("Tom and jerry", "cartoon", " David Beckham ", 2021),
                new Film("Fast and Fourious", "hanh dong", "Justin Lin", 2020));
        model.addAttribute("films", films);
        return "film";
    }
}
