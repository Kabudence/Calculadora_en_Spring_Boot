package com.example.ClculadoraenSpring.Boot.models_with_patters;

public class AdditionCalculator implements UnitCalculator {

    public AdditionCalculator() {
        // Constructor
    }
    @Override
    public int operation(int a, int b) {
        return a + b;
    }
}
