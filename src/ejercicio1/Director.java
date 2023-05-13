package ejercicio1;

import java.util.List;
import java.util.Objects;

public class Director implements Empleado {

	private List<Empleado> gerentes;

	private double salario;

	Director(double salario) {
		Objects.requireNonNull(salario);
		if (salario < 0) {
			throw new RuntimeException("El empleado no puede tener monto menor a 0");
		}
		this.salario = salario;
	}

	Director(double salario, List<Empleado> listaGerentes) {
		this.salario = salario;
		this.gerentes = listaGerentes;
	}

	@Override
	public double montoSalarial() {
		double monto = 0;
		for (Empleado unEmpleado : this.gerentes) {
			monto += unEmpleado.montoSalarial();
		}

		return salario() + monto;
	}

	@Override
	public double salario() {

		return this.salario;
	}
}
