package ar.edu.unlam.pb2;

public class Electrodomestico extends Producto{

	private Integer garantia;

	public Electrodomestico(Integer clave, String descripcion, Integer garantia, String marca, Double precio) {
		super(clave, descripcion, marca, precio);
		this.garantia=garantia;
	}

	public Integer getGarantia() {
		return garantia;
	}

	public void setGarantia(Integer garantia) {
		this.garantia = garantia;
	}

}
