package Futsal;

public class Equipo {

	private String nombre;
	private Jugador[] jugadores;
	private Integer contadorDeJugador=0;

	public Equipo(String nombre) {
		this.nombre=nombre;
		jugadores= new Jugador[21];
	}

	public Boolean agregarJugador(Jugador jugador1) {
		Boolean agregado=false;
		for (int i = 0; i < jugadores.length; i++) {
			if(jugadores[i]==null) {
				jugadores[i]=jugador1;
				agregado=true;
				contadorDeJugador++;
				break;
			}
		}return agregado;
		 
	}

	public Boolean buscarJugador(Jugador jugador) {
		for (int i = 0; i < jugadores.length; i++) {
			if(jugadores[i]==jugador) {
				return true;
			}
		}return false;
		
	}
	public Boolean quitarJugador(Jugador jugador) {
		for (int i = 0; i < jugadores.length; i++) {
			if(buscarJugador(jugador)) {
				jugadores[i]=null;
				return true;
			}
		}
		return false;
	}
	public Double calcularValorEquipo() {
		Double valor=0.0;
		for (int i = 0; i < jugadores.length; i++) {
			if(jugadores[i]!=null)
			valor+=jugadores[i].getPrecio();
		}
		return valor;
	}
	
	public Double calcularEdadPromedio() {
		Double promedio=0.0;
		Double edadTotal=0.0;
//		Integer contadorJugador=0;

		for (int i = 0; i < jugadores.length; i++) {
			if(jugadores[i]!=null) {
				edadTotal +=jugadores[i].getEdad();
//				contadorJugador++;
			}
		}
//		promedio = edadTotal/contadorJugador;
		promedio = edadTotal/getContadorDeJugador();
		return promedio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Jugador[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}

	public Integer getContadorDeJugador() {
		return contadorDeJugador;
	}

	public void setContadorDeJugador(Integer contadorDeJugador) {
		this.contadorDeJugador = contadorDeJugador;
	}
}
