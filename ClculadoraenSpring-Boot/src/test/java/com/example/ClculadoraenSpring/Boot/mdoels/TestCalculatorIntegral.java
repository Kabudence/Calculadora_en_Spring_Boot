package com.example.ClculadoraenSpring.Boot.mdoels;

import com.example.ClculadoraenSpring.Boot.models.CalculatorOne;
import com.example.ClculadoraenSpring.Boot.models.CalculatorTwo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class TestCalculatorIntegral {

    @Mock
    CalculatorOne calculatorMock;

    @InjectMocks
    CalculatorTwo calculatorToTesting;

    @BeforeEach
    void openMocks(){
        MockitoAnnotations.openMocks(this);
        calculatorToTesting= new CalculatorTwo();

    }

    @Test
    public void testAdditionProduct(){
        calculatorToTesting.setAddition(calculatorMock);
        when(calculatorMock.addition(2,3)).thenReturn(5);

        int resultado = calculatorToTesting.additonProduct(2, 3, 5);
        int esperado = 25;
        assert (esperado == resultado);

    }

}
