package com.despegar.hf.calculator.service;

import java.math.BigDecimal;

public class MemoryImpl
    implements Memory {

    BigDecimal slot;

    @Override
    public void clear() {
        this.slot = null;
    }

    @Override
    public BigDecimal read() {
        return this.slot;
    }

    @Override
    public void store(BigDecimal value) {
        this.slot = value;
    }

}
