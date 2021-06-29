package vn.techmaster.book.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.techmaster.book.model.Film;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class RESTController {

  @GetMapping("/films")
  public ResponseEntity<List<Film>> listFilms() {
    List<Film> films = List.of(
        new Film("Escape Room 2", " Adam Robitel ", 2021),
        new Film("Peter Rabbit 2: The Runaway", " Will Gluck ", 2021),
        new Film("Mortal Kombat", " Simon McQuoid ", 2021),
        new Film("A Quiet Place: Part II", " John Krasinski ", 2021));
    return ResponseEntity.ok().body(films);
  }
}
