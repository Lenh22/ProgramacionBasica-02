package herenciaEmpleado;

public class Gerente extends Empleado {
	
	private String cochera;
	
	public Gerente (String nombre, String apellido, Double salario,
						String fechaNac, Gerente gerente, String cochera) {
		super(nombre,apellido,salario, fechaNac, gerente);
		this.cochera=cochera;
		
		
	}

}
