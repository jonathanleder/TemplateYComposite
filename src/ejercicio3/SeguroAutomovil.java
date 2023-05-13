package ejercicio3;

public class SeguroAutomovil implements Seguro {

	private double valorSeguro;

	SeguroAutomovil(double precio) {
		this.valorSeguro = precio;
	}

	@Override
	public double calcularCosto() {
		return this.valorSeguro;
	}
}
