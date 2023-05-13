package ejercicio2;

import java.util.Objects;

public class Tarea implements Item {

	private int horas;

	Tarea(int cantidadDeHoras) {
		Objects.requireNonNull(cantidadDeHoras);
		if (cantidadDeHoras < 1)
			throw new RuntimeException("Debe ingresar un valor mayor a 1");
		this.horas = cantidadDeHoras;
	}

	@Override
	public int calcularTiempo() {
		return this.horas;
	}

}
