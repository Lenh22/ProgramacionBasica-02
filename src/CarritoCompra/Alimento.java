package CarritoCompra;

public class Alimento extends Producto {

	private Double kilos;

	public Alimento(String nombre, Double precio, Double kilos) {
		super(nombre, precio,TipoProducto.ALIMENTO);
		this.kilos=kilos;
	}

}
