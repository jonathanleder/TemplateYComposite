package ejercicio5;

public class RemeraNacional extends Remera {

	// Nacional: 1.5% recargo, -20% de bonificacion, 15% precio final
	static final double RECARGO = 0.015;
	static final double BONIFICACION = -0.2;
	static final double GANANCIA = 0.15;

	RemeraNacional(double precioUnitario) {
		super(precioUnitario);
	}

	@Override
	protected double determinarPrecioFinal(double precio) {
		return precio * GANANCIA;
	}

	@Override
	protected double aplicarRecargo(double precio) {
		return precio * RECARGO;
	}

	@Override
	protected double calcularBonificacionOImpuesto(double precio) {
		return precio * BONIFICACION;
	}

}
