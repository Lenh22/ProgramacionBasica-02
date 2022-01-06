package Futsal;

public class Jugador {

	private String nombre;
	private Integer edad;
	private Double precio;
	private Integer amonestaciones;

	public Jugador(String nombre, Integer edad, Double precio, Integer amonestaciones) {
		this.nombre=nombre;
		this.edad=edad;
		this.precio=precio;
		this.amonestaciones=amonestaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getAmonestaciones() {
		return amonestaciones;
	}

	public void setAmonestaciones(Integer amonestaciones) {
		this.amonestaciones = amonestaciones;
	}

}
