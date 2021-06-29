package vn.techmaster.book.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.techmaster.book.model.Film;

@Controller
@RequestMapping(value = { "/" })
public class FilmController {
    @GetMapping("/")
    public String showHomepage() {
        return "film";
    }

    @GetMapping("/films")
    public String getListFilm(Model model) {
        List<Film> films = List.of(
            new Film("Escape Room 2", " Adam Robitel ", 2021),
            new Film("Peter Rabbit 2: The Runaway", " Will Gluck ", 2021),
            new Film("Mortal Kombat", " Simon McQuoid ", 2021),
            new Film("A Quiet Place: Part II", " John Krasinski ", 2021));
        model.addAttribute("films", films);
        return "film";
    }

}
