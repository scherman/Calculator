package com.despegar.hf.echo.controller;

import java.math.BigDecimal;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.despegar.hf.calculator.service.Calculator;
import com.despegar.hf.calculator.service.CalculatorImpl;

@Controller
public class CalculatorController {

    private Calculator calculatorService = new CalculatorImpl();

    // Put here all exposed operations via RequestMappings
    @RequestMapping(value = "/add/{value1}/{value2}", method = RequestMethod.GET)
    public ResponseEntity<String> add(@PathVariable("value1") BigDecimal value1, @PathVariable("value2") BigDecimal value2) {
        String result = this.calculatorService.add(value1, value2).toString();
        return new ResponseEntity<String>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/subtract/{value1}/{value2}", method = RequestMethod.GET)
    public ResponseEntity<String> subtract(@PathVariable("value1") BigDecimal value1,
        @PathVariable("value2") BigDecimal value2) {
        String result = this.calculatorService.subtract(value1, value2).toString();
        return new ResponseEntity<String>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/multiply/{value1}/{value2}", method = RequestMethod.GET)
    public ResponseEntity<String> multiply(@PathVariable("value1") BigDecimal value1,
        @PathVariable("value2") BigDecimal value2) {
        String result = this.calculatorService.multiply(value1, value2).toString();
        return new ResponseEntity<String>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/divide/{value1}/{value2}", method = RequestMethod.GET)
    public ResponseEntity<String> divide(@PathVariable("value1") BigDecimal value1, @PathVariable("value2") BigDecimal value2) {
        String result = this.calculatorService.divide(value1, value2).toString();
        return new ResponseEntity<String>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/memoryStore/{value1}", method = RequestMethod.GET)
    public ResponseEntity<String> memoryStore(@PathVariable("value1") BigDecimal value1) {
        this.calculatorService.memoryStore(value1);;
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @RequestMapping(value = "/memoryRead", method = RequestMethod.GET)
    public ResponseEntity<String> memoryRead(@PathVariable("value1") BigDecimal value1,
        @PathVariable("value2") BigDecimal value2) {
        String result = this.calculatorService.memoryRead().toString();
        return new ResponseEntity<String>(result, HttpStatus.OK);
    }

    // <sd
    @RequestMapping(value = "/memoryClear/{value1}/{value2}", method = RequestMethod.GET)
    public ResponseEntity<String> memoryClear(@PathVariable("value1") BigDecimal value1,
        @PathVariable("value2") BigDecimal value2) {
        this.calculatorService.memoryClear();
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    public Calculator getCalculatorService() {
        return this.calculatorService;
    }

    public void setCalculatorService(Calculator calculatorService) {
        this.calculatorService = calculatorService;
    }
}
