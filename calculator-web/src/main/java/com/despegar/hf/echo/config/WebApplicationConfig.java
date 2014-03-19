package com.despegar.hf.echo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.despegar.hf.calculator.config.CalculatorConfig;
import com.despegar.hf.echo.controller.CalculatorController;

@Configuration
@EnableWebMvc
@ImportResource({
    "classpath:com/despegar/library/properties/base-properties-context.xml",
    "classpath:com/despegar/library/version/version-controller.xml",
    "classpath:com/despegar/library/healthcheck/health-check-controller.xml",
    "classpath:com/despegar/library/api/api-context.xml",
    "classpath:com/despegar/library/documentation/application-context.xml"})
@Import(CalculatorConfig.class)
public class WebApplicationConfig extends WebMvcConfigurerAdapter {
    
    private @Autowired
    CalculatorConfig calculatorConfig;

    @Bean
    public CalculatorController calculatorController() {
        CalculatorController calculatorController = new CalculatorController();
        calculatorController.setCalculatorService(calculatorConfig.calculatorService());
        return calculatorController;
    }

}
