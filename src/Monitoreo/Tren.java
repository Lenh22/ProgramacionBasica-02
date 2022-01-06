package Monitoreo;

public class Tren extends MedioTransporte {
	private Integer cantidadDeVagones;
	private Integer cantidadMaximaPasajerosPorVagon;
	private Integer velocidadMaxima;

	
	public Tren(Integer cantidadDeVagones,Integer cantidadMaximaPasajerosPorVagon,Integer velocidadMaxima,Double latitud, Double longitud) {
		super(latitud, longitud);
		this.cantidadDeVagones=cantidadDeVagones;
		this.cantidadMaximaPasajerosPorVagon=cantidadMaximaPasajerosPorVagon;
		this.velocidadMaxima=velocidadMaxima;	
	}


	public Integer getCantidadDeVagones() {
		return cantidadDeVagones;
	}


	public void setCantidadDeVagones(Integer cantidadDeVagones) {
		this.cantidadDeVagones = cantidadDeVagones;
	}


	public Integer getCantidadMaximaDePasajerosPorVagon() {
		return cantidadMaximaPasajerosPorVagon;
	}


	public void setCantidadMaximaPasajerosPorVagon(Integer cantidadMaximaPasajerosPorVagon) {
		this.cantidadMaximaPasajerosPorVagon = cantidadMaximaPasajerosPorVagon;
	}


	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}


	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	
}
	

