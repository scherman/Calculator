package com.despegar.hf.calculator.service;

import java.math.BigDecimal;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new CalculatorImpl();
        System.out.println(calc.add(new BigDecimal(2), new BigDecimal(2)));
        System.out.println(calc.subtract(new BigDecimal(4), new BigDecimal(2)));
        System.out.println(calc.divide(new BigDecimal(4), new BigDecimal(2)));
        System.out.println(calc.multiply(new BigDecimal(2), new BigDecimal(2)));

        Memory memory = new MemoryImpl();
        calc.setMemory(memory);

        calc.memoryStore(new BigDecimal(4));
        calc.memoryClear();
        System.out.println(calc.memoryRead());

    }
}
