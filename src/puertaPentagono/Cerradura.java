//Tenemos un cerrajero, que crea 3 cerraduras,
//al principio todas cerradas, la cerradura sabe decir 
//si esta abierta; Se abre con una clave y se cierra 
//con una clave que puede ser la misma u otra
//Tenemos un carpintero que fabrica una puerta,
//y le pone las 3 cerraduras que fabricó el cerrajero,
//la puerta sabe decir saber si esta abierta,
//y para abrir la puerta debo introducir las 
//3 claves correctas

package puertaPentagono;

public class Cerradura {
	private Boolean cerrada;
	private Integer clave;
	
	public Cerradura(Integer claveIntentada) {
		this.clave=claveIntentada;
		this.cerrada= Boolean.FALSE;
		
	}
	public Boolean estaAbierta() {
		return cerrada;
	}
	public Boolean abrir() {
		return this.cerrada=Boolean.TRUE;
	}
	public Boolean cerrar() {
		return this.cerrada=Boolean.FALSE;
	}
	
	
	public void setClave(Integer clave) {
		this.clave = clave;
	}
	public Integer getClave() {
		return clave;
	}
	

}
