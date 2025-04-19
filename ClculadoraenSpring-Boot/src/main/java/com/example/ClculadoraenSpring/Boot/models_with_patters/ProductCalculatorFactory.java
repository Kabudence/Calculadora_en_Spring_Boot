package com.example.ClculadoraenSpring.Boot.models_with_patters;

public class ProductCalculatorFactory implements CalculatorFactory {
    @Override
    public UnitCalculator createCalculator() {
        return new ProductCalculator();
    }
}
