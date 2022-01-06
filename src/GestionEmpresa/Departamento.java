package GestionEmpresa;

public class Departamento {
	
	private String nombre;
	private Empleado director;

	public Departamento(String nombre) {
		this.nombre=nombre;
	}
	
	public Boolean agregarDirector(Empleado director) {
		if(this.director==null) {
			this.director=director;
			return true;
		}
		return false;
	}

	public Empleado despedirDirector(Empleado director) {
		if(this.director.equals(director)) {
			this.director=null;
		}
		return this.director;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}