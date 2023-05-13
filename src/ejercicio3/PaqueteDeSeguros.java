package ejercicio3;

import java.util.List;

public class PaqueteDeSeguros implements Seguro {

	private List<Seguro> seguros;

	static final double DESCUENTO_POR_SEGURO = 5;

	PaqueteDeSeguros(List<Seguro> listaDeSeguros) {
		this.seguros = listaDeSeguros;
	}

	@Override
	public double calcularCosto() {
		double totalPaquete = 0;
		double descuentoAcumulativo = 0;
		for (Seguro unSeguro : seguros) {
			totalPaquete += unSeguro.calcularCosto();
			descuentoAcumulativo += DESCUENTO_POR_SEGURO;
		}
		return calcularDescuento(totalPaquete, descuentoAcumulativo);
	}

	private double calcularDescuento(double total, double descuento) {
		double descuentoTotal = descuento / 100;
		return total -= total * descuentoTotal;
	}

}
