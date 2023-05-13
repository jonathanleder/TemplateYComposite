package ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ProyectoTest {

	@Test
	void test() {

		List<Item> tareasHistorial = new ArrayList<>();
		tareasHistorial.add(new Tarea(1));
		tareasHistorial.add(new Tarea(2));
		tareasHistorial.add(new Tarea(3));

		List<Item> tareasSpike = new ArrayList<>();
		tareasSpike.add(new Tarea(4));
		tareasSpike.add(new Tarea(5));

		Item historiaUsuario = new HistoriaUser(tareasHistorial);
		Item Spike = new Spike(tareasSpike);

		List<Item> tareas = new ArrayList<>();
		tareas.add(historiaUsuario);
		tareas.add(Spike);

		Item miProyecto = new Proyecto(tareas);

		int tiempoEsperado = 15;
		assertEquals(tiempoEsperado, miProyecto.calcularTiempo());
	}

	@Test
	void testSpike() {

		List<Item> tareasSpike = new ArrayList<>();
		tareasSpike.add(new Tarea(4));
		tareasSpike.add(new Tarea(5));
		Item Spike = new Spike(tareasSpike);

		List<Item> tareas = new ArrayList<>();
		tareas.add(Spike);

		Item miProyecto = new Proyecto(tareas);

		int tiempoEsperado = 9;
		assertEquals(tiempoEsperado, miProyecto.calcularTiempo());
	}

}
