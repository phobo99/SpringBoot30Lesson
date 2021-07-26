package com.homework.cookie.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Color {
    private String backgroundColor;
    private String fontColor;
    private Double fontSize;
}