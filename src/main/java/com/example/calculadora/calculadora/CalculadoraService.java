package com.example.calculadora.calculadora;

public class CalculadoraService {
	public int tamanhoDaLista(ValoresDeEntradaDTO valoresDeEntradaDTO) {
		return valoresDeEntradaDTO.Entrada().size();
	}
}
