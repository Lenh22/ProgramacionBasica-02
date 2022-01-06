package Monitoreo;

public class Vehiculo extends  MedioTransporte{
	
	private String patente;
	private Integer velocidadMaxima;
	private Integer cantidadMaximaDePasajeros;
	
	
	public Vehiculo(String patente,Integer cantidadMaximaDePasajeros,
			Integer velocidadMaxima,Double latitud, Double longitud) {
		super(latitud, longitud);
		this.cantidadMaximaDePasajeros=cantidadMaximaDePasajeros;
		this.patente=patente;
		this.velocidadMaxima = velocidadMaxima;
	}


	public Integer getCantidadMaximaDePasajeros() {
		return cantidadMaximaDePasajeros;
	}


	public void setCantidadMaximaDePasajeros(Integer cantidadMaximaDePasajeros) {
		this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
	}


	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}


	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}


	public String getPatente() {
		return patente;
	}


	public void setPatente(String patente) {
		this.patente = patente;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patente == null) ? 0 : patente.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Vehiculo other = (Vehiculo) obj;
		if (patente == null) {
			if (other.patente != null)
				return false;
		} else if (!patente.equals(other.patente))
			return false;
		return true;
	}
	
}
