package GestionEmpresa;

public class Gerente extends Empleado {

	private Cochera cochera;

	public Gerente(String nombre, String apellido, String fechNacimiento, Double salario, Departamento departamento, Integer nroEncochera) {
		super(nombre, apellido, fechNacimiento, salario, departamento);
		this.cochera=new Cochera(nroEncochera);
	}

	public Cochera getCochera() {
		return cochera;
	}

}
