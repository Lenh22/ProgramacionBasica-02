package hechizeria;


public class Hechizo {

	private Integer numero;
	private String nombre;
	

	public Hechizo(Integer numero, String nombre) {
		this.numero=numero;
		this.nombre=nombre;
		
		// TODO Auto-generated constructor stub
	}


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}