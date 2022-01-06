package Figura;

public abstract class Figura {
	
	private String color;
	private String nombre;

	public Figura(String nombre, String color) {
		this.color=color;
		this.nombre=nombre;
	}
	
	public abstract Double calcularArea();
	
	public abstract Double calcularPerimetro();
	
	public void imprimirFigura() {
		System.out.println("Soy un"+nombre+" de color"+ color);
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
