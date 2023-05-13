package ejercicio5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RemeraTest {

	@Test
	void testRemeraNacional() {
		Remera nacional = new RemeraNacional(100);

		double resultadoEsperado = 93.38;

		assertEquals(resultadoEsperado, nacional.calcularPrecio());
	}

	@Test
	void testRemeraImportada() {
		Remera importada = new RemeraImportada(100);

		double resultadoEsperado = 135.1875;
		assertEquals(resultadoEsperado, importada.calcularPrecio());
	}

}
