package ejercicio4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorNoJubilado extends Calculador {

	static final double DESCUENTO_PROMO = 0.15;
	static final double DESCUENTO = 0.21;

	CalculadorNoJubilado(int mesDePromo) {
		super(mesDePromo);
	}

	@Override
	protected boolean esMesDePromo() {
		return of(mesEnPromocion).equals(now().getMonth());
	}

	@Override
	protected double mesConPromocion(double precioProducto) {
		return precioProducto * DESCUENTO_PROMO;
	}

	@Override
	protected double mesSinPromocion(double precioProducto) {
		return precioProducto * DESCUENTO;
	}

}
