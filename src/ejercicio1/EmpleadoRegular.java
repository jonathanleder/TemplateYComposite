package ejercicio1;

import java.util.Objects;

public class EmpleadoRegular implements Empleado {

	private double salario;

	EmpleadoRegular(double salario) {
		Objects.requireNonNull(salario);
		if (salario < 0) {
			throw new RuntimeException("El empleado no puede tener monto menor a 0");
		}
		this.salario = salario;
	}

	@Override
	public double montoSalarial() {
		return salario();
	}

	@Override
	public double salario() {

		return this.salario;
	}
}
