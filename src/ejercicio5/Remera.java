package ejercicio5;

public abstract class Remera {

	protected double precioUnitario;

	Remera(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	protected double calcularPrecio() {
		double precioTotal = this.precioUnitario;
		precioTotal += aplicarRecargo(precioTotal);
		precioTotal += calcularBonificacionOImpuesto(precioTotal);
		precioTotal += determinarPrecioFinal(precioTotal);

		return precioTotal;

	}

	protected abstract double determinarPrecioFinal(double precio);

	protected abstract double aplicarRecargo(double precio);

	protected abstract double calcularBonificacionOImpuesto(double precio);
}