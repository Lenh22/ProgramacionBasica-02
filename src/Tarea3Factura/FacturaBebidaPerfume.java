package Tarea3Factura;

public class FacturaBebidaPerfume extends Factura implements impuestoDelQuincePorciento{

	private Double precioUnitarioByP;
	private Double precioTotalByP;

	public FacturaBebidaPerfume(String articulo, Double precioUnitarioArticulo) {
		super(articulo, precioUnitarioArticulo);
		this.precioUnitarioByP=precioUnitarioArticulo;
	}

	@Override
	public Double impuestoDeBebidasYPerfumes() {
		this.precioTotalByP+= precioUnitarioByP + (precioUnitarioByP*impuesto);
		return this.precioTotalByP;
		
	}

}
