package Biblioteca;

public class Estudiantes {
	private Integer dni,nLibros=0;
	private String nombre,Apellido;

	public Estudiantes(Integer dni,String nombre, String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		Apellido = apellido;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public Integer getnLibros() {
		return nLibros;
	}
	public void setnLibros(Integer nLibros) {
		this.nLibros = nLibros;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}


}
