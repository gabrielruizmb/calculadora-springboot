package com.example.calculadora;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.SSLEngineResult.Status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.calculadora.calculadora.CalculatorController;
import com.example.calculadora.calculadora.CalculatorInput;
import com.example.calculadora.calculadora.CalculatorOutput;
import com.example.calculadora.calculadora.CalculatorService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CalculatorControllerTests {

    @Autowired
    MockMvc mockMvc;

    // @Autowired
    // private ObjectMapper objectMapper;

    // @Autowired
    // private CalculatorController calculatorController;

    @MockBean
    private CalculatorService calculatorService;
    
    @Test
    public void calculateTest() throws Exception {
        List<Double> numbersList = new ArrayList<>();
		numbersList.add(3.0);
		numbersList.add(2.0);
		numbersList.add(7.0);

        CalculatorInput calculatorInput = new CalculatorInput(numbersList);
        CalculatorOutput calculatorOutput = new CalculatorOutput(
            1, 0, 0);

        when(calculatorService.calculator(calculatorInput))
            .thenReturn(calculatorOutput);
        
        this.mockMvc.perform(post("/calculadora"))
                .andExpect(status().isOk());
    }
}
