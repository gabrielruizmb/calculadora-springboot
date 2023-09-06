package com.example.calculadora;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.calculadora.calculadora.CalculatorService;
import com.example.calculadora.calculadora.CalculatorInput;
import com.example.calculadora.calculadora.CalculatorOutput;

@SpringBootTest
class CalculadoraApplicationTests {
	@Test
	void contextLoads() {
		List<Double> numbersList = new ArrayList<>();
		numbersList.add(3.0);
		numbersList.add(2.0);
		numbersList.add(7.0);

		CalculatorInput calculatorInput = new CalculatorInput(numbersList);
		CalculatorService calculatorService = new CalculatorService();
		CalculatorOutput calculatorOutput = calculatorService.calculator(calculatorInput);
		
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
			7, 
			calculatorService.findBiggestNumber(calculatorInput),
			0
		);

		// Testa a função calculadora
		Assert.assertTrue(
			calculatorOutput.getListSize() == calculatorService.listSize(calculatorInput) &&
			calculatorOutput.getSmallestNumber() == calculatorService.findSmallestNumber(calculatorInput) &&
			calculatorOutput.getBiggestNumber() == calculatorService.findBiggestNumber(calculatorInput)
		);;

		// Testa a função que retorna a média dos valores inseridos
		// Assert.assertEquals(
		// 	4, 
		// 	calculatorService.calculateAverage(CalculatorInput),
		// );

	}
}
