package ejercicio1;

import java.util.List;
import java.util.Objects;

public class Gerente implements Empleado {

	private List<Empleado> mandosMedios;

	private double salario;

	Gerente(double salario) {
		Objects.requireNonNull(salario);
		if (salario < 0) {
			throw new RuntimeException("El empleado no puede tener monto menor a 0");
		}
		this.salario = salario;
	}

	Gerente(double salario, List<Empleado> listaMandos) {
		this.salario = salario;
		this.mandosMedios = listaMandos;
	}

	@Override
	public double montoSalarial() {
		double monto = 0;
		for (Empleado unEmpleado : this.mandosMedios) {
			monto += unEmpleado.montoSalarial();
		}

		return salario() + monto;
	}

	@Override
	public double salario() {

		return this.salario;
	}

}
