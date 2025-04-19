package com.example.ClculadoraenSpring.Boot.models;

public class CalculatorTwo  {

    Calculator calculatorAddition;
    Calculator calculatorProduct;



    public CalculatorTwo() {
        this.calculatorAddition = new CalculatorOne();
        this.calculatorProduct = new CalculatorOne();

    }



    public void setAddition(Calculator calculatorAddition) {
        this.calculatorAddition = calculatorAddition;
    }

    public void setProduct(Calculator calculatorProduct) {
        this.calculatorProduct = calculatorProduct;
    }

    public int additonProduct(int a, int b, int z) {
        int sumaTotal = calculatorAddition.addition(a, b);
        int productoTotal = calculatorProduct.product(sumaTotal, z);
        return productoTotal;

    }



}
