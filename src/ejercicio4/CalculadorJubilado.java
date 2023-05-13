package ejercicio4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorJubilado extends Calculador {

	static final double DESCUENTO = 0.1;
	static final double SIN_DESCUENTO = 0.1;

	CalculadorJubilado(int mesDePromo) {
		super(mesDePromo);
	}

	@Override
	protected boolean esMesDePromo() {
		return !(of(this.mesEnPromocion).equals(now().getMonth()));
	}

	@Override
	protected double mesConPromocion(double precioProducto) {

		return precioProducto * DESCUENTO;

	}

	@Override
	protected double mesSinPromocion(double precioProducto) {
		return precioProducto * SIN_DESCUENTO;
	}

}
