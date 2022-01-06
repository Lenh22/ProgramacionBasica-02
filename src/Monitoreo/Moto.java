package Monitoreo;

public class Moto extends Vehiculo {
	
	static Integer CAPACIDA_MAXIMA_DE_PASAJEROS=2;

	public Moto(String patente,Integer velocidadMaxima, Double latitud, Double longitud) {
		super(patente,CAPACIDA_MAXIMA_DE_PASAJEROS ,velocidadMaxima, latitud, longitud);

	}

	public static Integer getCAPACIDA_MAXIMA_DE_PASAJEROS() {
		return CAPACIDA_MAXIMA_DE_PASAJEROS;
	}


	
}
