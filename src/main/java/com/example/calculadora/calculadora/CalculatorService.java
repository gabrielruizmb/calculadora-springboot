package com.example.calculadora.calculadora;

public class CalculatorService {
	public int listSize(CalculatorInput calculatorInput) {
		return calculatorInput.numbersList().size();
	}

	public double findSmallestNumber(CalculatorInput calculatorInput) {
		double smallestNumber = Double.MAX_VALUE;

		for (Double number : calculatorInput.numbersList()) {
			if (number < smallestNumber) {
				smallestNumber = number;
			}
		}
		return smallestNumber;
	}

	public double findBiggestNumber(CalculatorInput calculatorInput) {
		double biggestNumber = Double.MIN_VALUE;
		
		for (Double number : calculatorInput.numbersList()) {
			if (number > biggestNumber) {
				biggestNumber = number;
			}
		}
		return biggestNumber;
	}
}
