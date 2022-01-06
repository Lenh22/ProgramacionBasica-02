package Tarea3Factura;

public class  Factura {
	protected Double precioTotalArticulo;
	protected String articulo;
	protected Double precioUnitario;
	
	public Factura(String articulo, Double precioUnitario) {
		this.articulo=articulo;
		this.precioUnitario=precioUnitario;
	}
	public Double impuesto(){
		this.precioTotalArticulo+= precioUnitario + (precioUnitario*0.21);
		return this.precioTotalArticulo;
	}

}
