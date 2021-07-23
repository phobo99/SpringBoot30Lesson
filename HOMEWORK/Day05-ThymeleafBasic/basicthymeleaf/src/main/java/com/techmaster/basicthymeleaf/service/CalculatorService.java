package com.techmaster.basicthymeleaf.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int calculate(int firstNumber, int secondNumber, char operator) {
        
        switch (operator) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                try {
                    return firstNumber / secondNumber;
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                } 
            default:
                break;
        }
        return 0;
    }
}