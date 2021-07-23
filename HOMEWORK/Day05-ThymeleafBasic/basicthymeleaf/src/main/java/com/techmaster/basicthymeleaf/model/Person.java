package com.techmaster.basicthymeleaf.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    private String name;
    private String nationality;
    private LocalDate birthdate;
    private String gender;

    // Khai bao cac truong
}