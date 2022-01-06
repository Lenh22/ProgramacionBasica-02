package Figura;

public class Circulo extends Figura {

	private Double radio;
	private Double PI=3.14;

	public Circulo(String nombre, String color,Double radio) {
		super(nombre, color);
		this.radio=radio;
	}
	
	@Override 
	
	public Double calcularArea() {
		return PI*(radio*radio);
	}

	@Override
	public Double calcularPerimetro() {
		return 2* PI* this.radio;
	}
	

}
