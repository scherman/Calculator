package com.despegar.hf.calculator.service;

import java.math.BigDecimal;

public interface Calculator {
	
    // Arithmetic Operations
    BigDecimal add(BigDecimal t1, BigDecimal t2);

    BigDecimal subtract(BigDecimal t1, BigDecimal t2);

    BigDecimal divide(BigDecimal t1, BigDecimal t2);

    BigDecimal multiply(BigDecimal t1, BigDecimal t2);

    // Memory Operations
    void memoryClear();

    BigDecimal memoryRead();

    void memoryStore(BigDecimal value);

    void setMemory(Memory memory);

}
