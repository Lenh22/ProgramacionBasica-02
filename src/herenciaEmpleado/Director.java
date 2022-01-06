package herenciaEmpleado;

public class Director extends Empleado {
	
	private Double sueldoExtra;
	public Director(String nombre, String apellido, Double salario,String fechaNac, Gerente gerente,Double sueldoExtra) {
		super(nombre,apellido,salario, fechaNac, gerente);
		this.sueldoExtra=sueldoExtra;
	}
	
	@Override
	public Double obtenerSalario() {
		return super.obtenerSalario()+this.sueldoExtra;
	}

}
