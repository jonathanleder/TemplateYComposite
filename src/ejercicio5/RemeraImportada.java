package ejercicio5;

public class RemeraImportada extends Remera {

	// Importada: 3% de recargo, 5% impuesto aduanero, 25% precio final
	static final double RECARGO = 0.03;
	static final double IMPUESTO_ADUANERO = 0.05;
	static final double GANANCIA = 0.25;

	RemeraImportada(double precioUnitario) {
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
		return precio * IMPUESTO_ADUANERO;
	}

}
