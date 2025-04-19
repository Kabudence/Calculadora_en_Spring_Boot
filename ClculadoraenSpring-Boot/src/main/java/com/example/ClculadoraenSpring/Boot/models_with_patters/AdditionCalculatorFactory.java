package com.example.ClculadoraenSpring.Boot.models_with_patters;

public class AdditionCalculatorFactory implements CalculatorFactory {
    @Override
    public AdditionCalculator createCalculator() {
        return new AdditionCalculator( );
    }
}
