package ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class DirectorTest {

	@Test
	void test() {

		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new EmpleadoRegular(20));
		listaEmpleados.add(new EmpleadoRegular(30));

		List<Empleado> listaLideres = new ArrayList<>();
		listaLideres.add(new LiderDeProyecto(50, listaEmpleados));

		List<Empleado> listaMandos = new ArrayList<>();
		listaMandos.add(new MandoMedio(100, listaLideres));

		List<Empleado> listaGerentes = new ArrayList<>();
		listaGerentes.add(new Gerente(200, listaMandos));

		Empleado maria = new Director(400, listaGerentes);

		double montoEsperado = 800;

		assertEquals(montoEsperado, maria.montoSalarial());
	}

	@Test
	void testMandoMedio() {

		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new EmpleadoRegular(20));
		listaEmpleados.add(new EmpleadoRegular(30));

		List<Empleado> listaLideres = new ArrayList<>();
		listaLideres.add(new LiderDeProyecto(50, listaEmpleados));

		List<Empleado> listaMandos = new ArrayList<>();
		Empleado roberto = new MandoMedio(100, listaLideres);
		listaMandos.add(roberto);

		double montoEsperado = 200;

		assertEquals(montoEsperado, roberto.montoSalarial());
	}

}
