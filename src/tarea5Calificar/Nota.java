package tarea5Calificar;

public class Nota {

	private Integer nota;
	private String nombre;

	public Nota(String nombre, Integer nota) {
		this.nota=nota;
		this.nombre=nombre;
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

}
