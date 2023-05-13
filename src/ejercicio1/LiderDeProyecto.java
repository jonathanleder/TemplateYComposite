package ejercicio1;

import java.util.List;
import java.util.Objects;

public class LiderDeProyecto implements Empleado {

	private List<Empleado> empleados;
	private double salario;

	LiderDeProyecto(double salario) {
		Objects.requireNonNull(salario);
		if (salario < 0) {
			throw new RuntimeException("El empleado no puede tener monto menor a 0");
		}
		this.salario = salario;
	}

	LiderDeProyecto(double salario, List<Empleado> listaEmpleados) {
		this.salario = salario;
		this.empleados = listaEmpleados;
	}

	@Override
	public double montoSalarial() {
		double monto = 0;
		for (Empleado unEmpleado : this.empleados) {
			monto += unEmpleado.montoSalarial();
		}

		return salario() + monto;
	}

	@Override
	public double salario() {

		return this.salario;
	}

}
