package ejercicio3;

public class SeguroMedico implements Seguro {

	private double valorSeguro;

	SeguroMedico(double precio) {
		this.valorSeguro = precio;
	}

	@Override
	public double calcularCosto() {
		return this.valorSeguro;
	}
}
