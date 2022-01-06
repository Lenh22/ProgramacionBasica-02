package Figura;

public class Rectangulo extends Figura implements Imprimir {

	private Double base;
	private Double altura;

	public Rectangulo(String nombre, String color, Double base, Double altura) {
		super(nombre, color);
		this.base=base;
		this.altura=altura;
	}
	
	@Override 
	
	public Double calcularArea() {
		return this.base*this.altura;
	}

	@Override
	public Double calcularPerimetro() {
		return (2*this.base) + (2*this.altura);
	}

	@Override
	public String imprimir() {
		return "Soy un "+getNombre();
	}
	
	

}

