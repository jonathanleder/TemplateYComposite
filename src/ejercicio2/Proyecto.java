package ejercicio2;

import java.util.List;

public class Proyecto implements Item {

	private List<Item> partesDeProyecto;

	Proyecto(List<Item> partesDelProyecto) {
		this.partesDeProyecto = partesDelProyecto;
	}

	@Override
	public int calcularTiempo() {
		int tiempoTotal = 0;

		for (Item unaParte : this.partesDeProyecto) {
			tiempoTotal += unaParte.calcularTiempo();
		}
		return tiempoTotal;
	}

}
