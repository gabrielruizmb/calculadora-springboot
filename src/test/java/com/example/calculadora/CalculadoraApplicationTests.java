package com.example.calculadora;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.calculadora.calculadora.CalculadoraService;
import com.example.calculadora.calculadora.ValoresDeEntradaDTO;

@SpringBootTest
class CalculadoraApplicationTests {

	@Test
	void contextLoads() {
		List<Double> Entrada = new ArrayList<>();
		Entrada.add(5.0);
		Entrada.add(5.0);
		Entrada.add(5.0);

		ValoresDeEntradaDTO valoresDeEntradaDTO = new ValoresDeEntradaDTO(Entrada);
		CalculadoraService calculadoraService = new CalculadoraService();
		
		Assert.assertEquals(3, calculadoraService.tamanhoDaLista(valoresDeEntradaDTO));
	}

}
