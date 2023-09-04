package com.example.calculadora.calculadora;

public class CalculatorService {
	public int listSize(CalculatorInput calculatorInput) {
		return calculatorInput.numbersList().size();
	}

	public Double findSmallestNumber(CalculatorInput calculatorInput) {
		Double smallestNumber = Double.MAX_VALUE;
		for (Double number : calculatorInput.numbersList()) {
			if (number < smallestNumber) {
				smallestNumber = number;
			}
		}
		return smallestNumber;
	}
}
