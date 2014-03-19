package com.despegar.hf.calculator.service;

import java.math.BigDecimal;
import java.security.InvalidParameterException;

public class CalculatorImpl
    implements Calculator {

    Memory memory;

    @Override
    public BigDecimal add(BigDecimal t1, BigDecimal t2) {
        return t1.add(t2);
    }

    @Override
    public BigDecimal subtract(BigDecimal t1, BigDecimal t2) {
        return t1.subtract(t2);
    }

    @Override
    public BigDecimal divide(BigDecimal t1, BigDecimal t2) {
        if (t2.equals(new BigDecimal("0"))) {
            throw new InvalidParameterException();
        } else {
            return t1.divide(t2);
        }

    }

    @Override
    public BigDecimal multiply(BigDecimal t1, BigDecimal t2) {
        return t1.multiply(t2);
    }

    @Override
    public void memoryClear() {
        this.memory.clear();

    }

    @Override
    public BigDecimal memoryRead() {
        return this.memory.read();
    }

    @Override
    public void memoryStore(BigDecimal value) {
        this.memory.store(value);

    }

    @Override
    public void setMemory(Memory memory) {
        this.memory = memory;

    }
}
