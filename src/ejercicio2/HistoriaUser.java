package ejercicio2;

import java.util.List;

public class HistoriaUser implements Item {

	private List<Item> tareas;

	HistoriaUser(List<Item> listaDeTareas) {
		this.tareas = listaDeTareas;
	}

	@Override
	public int calcularTiempo() {
		int tiempoTotal = 0;
		for (Item unaTarea : tareas) {
			tiempoTotal += unaTarea.calcularTiempo();
		}
		return tiempoTotal;
	}

}
