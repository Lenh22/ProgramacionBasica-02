package GestionEmpresa;

public class Empresa {

	private String nombre;
	private Empleado[] empleados;
	

	public Empresa(String nombre) {
		this.nombre=nombre;
		this.empleados= new Empleado[100];
		
		
	}

	public Boolean agregarEmpleado(Empleado empleado1) {
		for (int i = 0; i < empleados.length; i++) {
			if(empleados[i]==null)
				empleados[i]=empleado1;
			return true;
		}
		return false;
	}

}
