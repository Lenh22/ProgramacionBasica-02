package Monitoreo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ReproductorMusica.claveDuplicadaException;

public class Mapa {

	private Boolean hayUnaCoalicion;
	private String nombre;
	private Set<MedioTransporte> vehiculos;

	public Mapa(String nombre) {
		this.nombre = nombre;
		this.vehiculos = new HashSet<MedioTransporte>();
		this.hayUnaCoalicion = false;
	}

	public void agregarVehiculo(MedioTransporte transporte) {
		if (mismaCoordenada(transporte)) {
			this.hayUnaCoalicion=true;
		}
		
		this.vehiculos.add(transporte);

	}

	private Boolean mismaCoordenada(MedioTransporte vehi1) {
		Boolean mismaCordenada = false;
			if (buscarVehiculoCoordenada(vehi1.getLatitud(), vehi1.getLongitud())!=null) {
				mismaCordenada = true;
			}
		
		return mismaCordenada;
	}
	
	private MedioTransporte buscarVehiculoCoordenada(Double latitud, Double longitud) {
		for (MedioTransporte medioTransporte : vehiculos) {
			if (latitud.equals(medioTransporte.getLatitud())) {
				if (longitud.equals(medioTransporte.getLongitud())) {
					return medioTransporte;
				}
			}
		}return null;
	}

	public Integer getCantidadDeVehiculos() {
		return this.vehiculos.size();
	}
	
	
	public Boolean hayCoalición() throws  ColitionException {
			for (MedioTransporte medio2 : vehiculos) {
					if (mismaCoordenada(medio2)) {
						this.hayUnaCoalicion=true;
						throw new ColitionException("Chocaran");
					}else {
						this.hayUnaCoalicion=false;
					}		
			}
		return hayUnaCoalicion;
				
	}
// [1,2,3,4,5]  > transporte
// [1,2,3,4,5]  >medioTransporte
}
