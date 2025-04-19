package com.example.ClculadoraenSpring.Boot.models_with_patters;

import com.example.ClculadoraenSpring.Boot.models.Calculator;

public class ProductCalculator implements UnitCalculator {

    public ProductCalculator() {
        // Constructor
    }
    @Override
    public int operation(int a, int b) {
        return a*b;
    }
}
