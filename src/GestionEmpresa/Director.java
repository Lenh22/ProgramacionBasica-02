package GestionEmpresa;

public class Director extends Gerente{

	private Double salarioExtra;

	public Director(String nombre, String apellido, String fechNacimiento, Double salario, Departamento departamento, Double salarioExtra, Integer nroCochera) {
		super(nombre, apellido, fechNacimiento, salario, departamento, nroCochera);
		this.salarioExtra=salarioExtra;
	}
	
	@Override
	public Double calcularSueldo() {
		Double resultado= getSalario()+salarioExtra;
		return resultado;
	}

}
