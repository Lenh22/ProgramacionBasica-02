package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Venta {

	private Integer dniDelComprador;
	private String nombreDelComprador;
	private ArrayList<Producto> productosVendidos;//Se almacenan los vendidos

	public Venta(Integer dniDelComprador, String nombreDelComprador) {
		this.dniDelComprador=dniDelComprador;
		this.nombreDelComprador=nombreDelComprador;
		this.productosVendidos= new ArrayList<Producto>();
	}
	public void agregarProductoALaVenta(Producto producto) {
		productosVendidos.add(producto);
	}
	public Double getImporte() {
		Double importeTotal=0.0;
		for (Producto producto : productosVendidos) {
			importeTotal+=producto.getPrecio();
			
		}return importeTotal;
	}

}
