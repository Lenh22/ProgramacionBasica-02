package CarritoCompra;

public class Bebida extends Producto{

	private Integer litros;

	public Bebida(String nombre, Double precio, Integer litros) {
		super(nombre, precio,TipoProducto.BEBIDA);
		this.litros=litros;
	}

}
