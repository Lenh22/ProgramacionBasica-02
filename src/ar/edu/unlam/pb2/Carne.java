package ar.edu.unlam.pb2;

public class Carne extends Comestible {

	private Double kilos;

	public Carne(Integer clave, String nombre, String fechaCreacion, String fechaVencimiento, Double kilos, String marca,
			Double precio) {
		super(clave, nombre, fechaCreacion, fechaVencimiento, marca, precio);
		this.kilos=kilos;
	}

	public Double getKilos() {
		return kilos;
	}

	public void setKilos(Double kilos) {
		this.kilos = kilos;
	}
	

}
