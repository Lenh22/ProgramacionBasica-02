package ar.edu.unlam.pb2;

public class Comestible extends Producto{
	
	private String fechaDeElaboracion;
	private String fechaDeVencimiento;
	
	public Comestible(Integer clave, String nombre, String fechaDeElaboracion, String fechaDeVencimiento, String marca,Double precio) {
		super(clave,nombre,marca,precio);
		this.fechaDeElaboracion=fechaDeElaboracion;
		this.fechaDeVencimiento=fechaDeVencimiento;
	}
	public String getFechaDeElaboracion() {
		return fechaDeElaboracion;
	}

	public void setFechaDeElaboracion(String fechaDeElaboracion) {
		this.fechaDeElaboracion = fechaDeElaboracion;
	}

	public String getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}

	public void setFechaDeVencimiento(String fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}

}