package ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class CalculadorTest {

	@Test
	void testJubilado() {
		Calculador calculador = new CalculadorJubilado(LocalDate.now().getMonthValue());

		double resultadoEsperado = 90;
		assertEquals(resultadoEsperado, calculador.calcularPrecio(100));
	}

	@Test
	void testNoJubilado() {
		Calculador calculador = new CalculadorNoJubilado(LocalDate.now().getMonthValue());

		double resultadoEsperado = 85;
		assertEquals(resultadoEsperado, calculador.calcularPrecio(100));
	}
}
