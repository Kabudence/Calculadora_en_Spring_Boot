package com.example.ClculadoraenSpring.Boot.mdoels;

import com.example.ClculadoraenSpring.Boot.models.Calculator;
import com.example.ClculadoraenSpring.Boot.models_with_patters.AdditionCalculatorFactory;
import com.example.ClculadoraenSpring.Boot.models_with_patters.CalculatorFactory;
import com.example.ClculadoraenSpring.Boot.models_with_patters.ProductCalculatorFactory;
import com.example.ClculadoraenSpring.Boot.models_with_patters.UnitCalculator;
import org.junit.jupiter.api.Test;

public class TestCalculatorPatters {
     private CalculatorFactory calculatorFactory;
     private UnitCalculator unitCalculator;

     @Test
    public void testAddition(){
         unitCalculator= new AdditionCalculatorFactory().createCalculator();
         int expectedResult = 5;

         assert (expectedResult == unitCalculator.operation(2, 3));

     }

    @Test void testProduct(){
         unitCalculator= new ProductCalculatorFactory().createCalculator();
         int expectedResult = 6;

         assert (expectedResult == unitCalculator.operation(2, 3));

     }

}
