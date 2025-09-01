package calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTestAula {
	@Test
	public void somaTest() {
		Calculadora calc = new Calculadora();
		int resultado = calc.soma(5, 3);
		assertEquals(8,resultado);
	}
}
