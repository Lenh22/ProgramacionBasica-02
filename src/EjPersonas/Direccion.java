package EjPersonas;

public class Direccion {
	private String calle;
	private Integer numero;
	private Ciudad ciudad;
	
	public Direccion(String calle, Integer numero, Ciudad ciudad) {
		this.calle=calle;
		this.ciudad=ciudad;
		this.numero=numero;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

}

