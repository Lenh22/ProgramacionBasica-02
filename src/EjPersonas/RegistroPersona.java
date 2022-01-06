package EjPersonas;

import java.util.ArrayList;


public class RegistroPersona {
	private Persona[] padron;
	private  Integer cantMax;
	
	public RegistroPersona(Integer cantMax) {
		this.cantMax=cantMax;
		this.padron= new Persona[cantMax];
	}
	
	public Boolean registrarPersona(Persona persona) {
		for (int i = 0; i < padron.length; i++) {
			if(padron[i]==null) {
				padron[i]=persona;
				return true;
			}	
		}
		return false;
	}

	
	public Persona[] obtenerListadoDePersonaDeUnaProvincia(Provincia nombreProvincia) {
		Persona[] resultado=new Persona[cantMax];
		Integer contadorProvincia=0;
		
		for (int i = 0; i < padron.length; i++) {
			if(padron[i]!=null&&padron[i].getDireccion().getCiudad().getProvincia().equals(nombreProvincia)) {
				resultado[contadorProvincia++]=padron[i];
			}
		}
		return resultado;
		
	}
	
	
}
