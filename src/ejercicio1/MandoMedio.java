package ejercicio1;

import java.util.List;
import java.util.Objects;

public class MandoMedio implements Empleado {

	private List<Empleado> lideres;

	private double salario;

	MandoMedio(double salario) {
		Objects.requireNonNull(salario);
		if (salario < 0) {
			throw new RuntimeException("El empleado no puede tener monto menor a 0");
		}
		this.salario = salario;
	}

	MandoMedio(double salario, List<Empleado> listaLideres) {
		this.salario = salario;
		this.lideres = listaLideres;
	}

	@Override
	public double montoSalarial() {
		double monto = 0;
		for (Empleado unEmpleado : this.lideres) {
			monto += unEmpleado.montoSalarial();
		}

		return salario() + monto;
	}

	@Override
	public double salario() {

		return this.salario;
	}

}
