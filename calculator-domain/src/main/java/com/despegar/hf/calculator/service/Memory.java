package com.despegar.hf.calculator.service;

import java.math.BigDecimal;

public interface Memory {
    void clear();
    BigDecimal read();
    void store(BigDecimal value);
}
