package com.example.ClculadoraenSpring.Boot.mdoels;

import com.example.ClculadoraenSpring.Boot.models.CalculatorOne;
import com.example.ClculadoraenSpring.Boot.models.CalculatorTwo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestCalculator {

    private CalculatorOne calculatorOne ;
    private CalculatorTwo calculatorTwo ;


    @BeforeEach
    public void setUp() {
        calculatorOne = new CalculatorOne();
        calculatorTwo = new CalculatorTwo();
    }

    @Disabled
    @Test
    public void testSuma(){
        int resultado = calculatorOne.addition(2, 3);
        int esperado = 5;

        assert (esperado == resultado);
    }
    @Test
    @Disabled
    public void SumaProducto(){
        int resultado = calculatorTwo.additonProduct(2, 3, 4);
        int esperado = 20;

        assert (esperado == resultado);
    }

}
