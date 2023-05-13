package ejercicio3;

public class SeguroHogar implements Seguro {

	private double valorSeguro;

	SeguroHogar(double precio) {
		this.valorSeguro = precio;
	}

	@Override
	public double calcularCosto() {
		return this.valorSeguro;
	}

}
