package ar.edu.unlam.pb2;


public class Producto implements Comparable<Producto> {

	private Integer clave;
	private String descripcion;
	private String marca;
	private Double precio;

	public Producto(Integer clave, String descripcion, String marca, Double precio) {
		this.clave = clave;
		this.descripcion = descripcion;
		this.marca = marca;
		this.precio = precio;
	}

	public Integer getClave() {
		return clave;
	}

	public void setClave(Integer clave) {
		this.clave = clave;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (clave == null) {
			if (other.clave != null)
				return false;
		} else if (!clave.equals(other.clave))
			return false;
		return true;
	}

	// Agregando Ordenamiento por Nombre
	@Override
	public int compareTo(Producto o) {
		return Integer.valueOf(this.descripcion.compareTo(o.getDescripcion()));
	}
}
