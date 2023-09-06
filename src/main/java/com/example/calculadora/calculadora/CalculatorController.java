package com.example.calculadora.calculadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/calculadora")
public class CalculatorController {
    @Autowired
    CalculatorService calculatorService;

    // public CalculadoraController(CalculatorService calculatorService) {
    //     this.calculatorService = calculatorService;
    // }

    @PostMapping
    public ResponseEntity<CalculatorOutput> calculate(@RequestBody
                                                      CalculatorInput 
                                                      calculatorInput) {
        return ResponseEntity.ok(calculatorService.calculator(calculatorInput));
    }
}
