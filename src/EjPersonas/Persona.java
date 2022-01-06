package EjPersonas;

public class Persona {
	private String nombre;
	private String apellido;
	private Direccion direccion;
	
	public Persona(String nombre, String apellido, Direccion direccion) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.direccion=direccion;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	
}
