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

public class Puerta {
	private Boolean estadoDeApertura;

	private Cerradura cerradura1;
	private Cerradura cerradura2;
	private Cerradura cerradura3;

	public Puerta(Integer clave1, Integer clave2, Integer clave3) {
		estadoDeApertura=false;
		cerradura1= new Cerradura(clave1);
		cerradura2= new Cerradura(clave2);
		cerradura3= new Cerradura(clave3);
		
	}
	
//	(this.loQueSea.equals(loQueQuierescomparar)) {

	
public Boolean abrirPuerta (Integer cod1, Integer cod2, Integer cod3) {
	if(this.cerradura1.getClave().equals(cod1)&&
		this.cerradura2.getClave().equals(cod2)&&
		this.cerradura3.getClave().equals(cod3))
	{
		cerradura1.abrir();
		cerradura2.abrir();
		cerradura3.abrir();
		
		estadoDeApertura=true;
		
		return this.estadoDeApertura;
	}else {
		return estadoDeApertura;
	}

		
}

public Boolean getEstadoDeApertura() {
	return estadoDeApertura;
}

public void setEstadoDeApertura(Boolean estadoDeApertura) {
	this.estadoDeApertura = estadoDeApertura;
}



}
