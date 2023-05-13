package ejercicio3;

public class SeguroVida implements Seguro {

	private double valorSeguro;

	SeguroVida(double precio) {
		this.valorSeguro = precio;
	}

	@Override
	public double calcularCosto() {
		return this.valorSeguro;
	}
}
