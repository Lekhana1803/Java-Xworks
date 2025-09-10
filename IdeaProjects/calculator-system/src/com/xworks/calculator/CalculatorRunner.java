package com.xworks.calculator;

import com.xworks.calculator.calculator.Calculator;
import com.xworks.calculator.scientificcalculator.ScientificCalculator;

public class CalculatorRunner {

    public void main(String[] calculate){

        ScientificCalculator sc=new ScientificCalculator();

        sc.add(9000,1000);
        sc.sub(10000,9000);
        sc.div(250,5);
        sc.multi(25,4);

    }
}
