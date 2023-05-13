package ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class PaqueteDeSegurosTest {

	@Test
	void test() {
		Seguro vida = new SeguroVida(100);
		Seguro auto = new SeguroAutomovil(100);

		List<Seguro> seguros = new ArrayList<>();
		seguros.add(vida);
		seguros.add(auto);

		Seguro paquete = new PaqueteDeSeguros(seguros);
		double resultadoEsperado = 180;
		assertEquals(resultadoEsperado, paquete.calcularCosto());
	}

	@Test
	void testPaqueteCompleto() {
		Seguro vida = new SeguroVida(100);
		Seguro auto = new SeguroAutomovil(100);
		Seguro casa = new SeguroAutomovil(100);
		Seguro medico = new SeguroAutomovil(100);

		List<Seguro> seguros = new ArrayList<>();
		seguros.add(vida);
		seguros.add(auto);
		seguros.add(casa);
		seguros.add(medico);

		Seguro paquete = new PaqueteDeSeguros(seguros);

		double resultadoEsperado = 320;
		assertEquals(resultadoEsperado, paquete.calcularCosto());
	}

}
