package com.techmaster.basicthymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calculator {
    private Integer firstNumber;
    private Integer secondNumber;
    private Character operator;

    // Khai bao cac truong
}