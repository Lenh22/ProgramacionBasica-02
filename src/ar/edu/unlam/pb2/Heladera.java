package ar.edu.unlam.pb2;

public class Heladera extends Electrodomestico {

	private Boolean noFrost;

	public Heladera(Integer clave, String descripcion, Boolean noFrost, Integer garantia, String marca, Double precio) {
		super(clave, descripcion, garantia, marca, precio);
		this.noFrost=noFrost;
	}

	public Boolean isNoFrost() {
		return noFrost;
	}

	public void setNoFrost(Boolean noFrost) {
		this.noFrost = noFrost;
	}

}