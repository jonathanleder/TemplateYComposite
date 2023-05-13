package ejercicio4;

import java.util.Objects;

public abstract class Calculador {

	private LogTransaction log;
	protected int mesEnPromocion;

	Calculador(int mesDePromo) {
		Objects.requireNonNull(mesDePromo);
		if (!(mesDePromo > 0) && !(mesDePromo < 13))
			new RuntimeException("Debe ingresar un mes valido");
		this.mesEnPromocion = mesDePromo;
	}

	public double calcularPrecio(double precioProducto) {
		double precioTotal = precioProducto;
		if (esMesDePromo()) {
			precioTotal -= mesConPromocion(precioProducto);
		} else {
			precioTotal -= mesSinPromocion(precioProducto);
		}
		guardarRegistro();
		return precioTotal;

	}

	abstract protected double mesConPromocion(double precioProducto);

	abstract protected double mesSinPromocion(double precioProducto);

	abstract protected boolean esMesDePromo();

	private void guardarRegistro() {
		this.log = new LogTransaction(this.getClass().getName());
	}
}
