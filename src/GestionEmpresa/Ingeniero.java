package GestionEmpresa;

public class Ingeniero extends Empleado{

	private Double adicionalProductividad;
	//Agregacion
	public Ingeniero(String nombre, String apellido, String fechNacimiento, Double salario, Departamento departamento, Double adicionalProductividad) {
		super(nombre, apellido, fechNacimiento, salario, departamento);
		this.adicionalProductividad=adicionalProductividad;
	}
	
	//Comp
	public Ingeniero(String nombre, String apellido, String fechNacimiento, Double salario, String nombreDepartamento, Double adicionalProductividad) {
		super(nombre, apellido, fechNacimiento, salario, nombreDepartamento);
		this.adicionalProductividad=adicionalProductividad;
	}
	
	@Override
	public Double calcularSueldo() {
		Double resultado= super.getSalario() * adicionalProductividad;
		return resultado;
	}
	

}
