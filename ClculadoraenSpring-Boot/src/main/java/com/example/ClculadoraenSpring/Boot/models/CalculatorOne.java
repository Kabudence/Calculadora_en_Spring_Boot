package com.example.ClculadoraenSpring.Boot.models;

public class CalculatorOne implements Calculator {

    public CalculatorOne() {

    }

    public int product(int a, int b) {
        return a * b;
    }

    @Override
    public int addition(int a, int b) {
        return a+b;
    }
}
