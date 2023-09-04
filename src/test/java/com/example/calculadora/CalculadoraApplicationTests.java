package com.example.calculadora;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.calculadora.calculadora.CalculatorService;
import com.example.calculadora.calculadora.CalculatorInput;

@SpringBootTest
class CalculadoraApplicationTests {
	@Test
	void contextLoads() {
		List<Double> numbersList = new ArrayList<>();
		numbersList.add(3.0);
		numbersList.add(2.0);
		numbersList.add(5.0);

		CalculatorInput calculatorInput = new CalculatorInput(numbersList);
		CalculatorService calculatorService = new CalculatorService();
		
		// Testa a função que retorna o tamanho da lista
		Assert.assertEquals (
			3, 
			calculatorService.listSize(calculatorInput)
		);

		// Testa a função que retorna o menor número da lista
		Assert.assertEquals (
			2, 
			calculatorService.findSmallestNumber(calculatorInput), 
			0
		);

		// Testa a função que retorna o maior número da lista
		Assert.assertEquals(
			5, 
			calculatorService.findBiggestNumber(calculatorInput),
			0
		);
	}
}
