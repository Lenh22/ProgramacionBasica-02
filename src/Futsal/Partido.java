package Futsal;

public class Partido {

	private Equipo local;
	private Equipo visitante;
	
	private Integer golLocal;
	private Integer golVisitante;
	
	private Jugador[] goles;
	private Jugador[] amonestados;
	private Jugador[] expulsados;
	
	private Double[] minutosGol;
	private Double[] minutosAmon;


	public Partido(Equipo local, Equipo visitante) {
		this.local=local;
		this.visitante=visitante;
		this.golLocal=0;
		this.golVisitante=0;
		
		this.goles= new Jugador[100];
		this.amonestados= new Jugador[100];
		this.expulsados= new Jugador[100];
		
		this.minutosGol=new Double[100];
		this.minutosAmon=new Double[100];
	}
 
	public Jugador gol(Jugador jugador1, Double tiempo) {
		for (int i = 0; i < goles.length; i++) {
			if (this.goles[i]==null) {
				this.goles[i]=jugador1;
				this.minutosGol[i]=tiempo;
					if(local.buscarJugador(jugador1)) {
						this.golLocal++;
					}else {
						if(visitante.buscarJugador(jugador1))
						this.golVisitante++;
					}
				return jugador1;
			}		
		}return null;
		
	}

	public Jugador amonestado(Jugador jugador1, Double d) {
		for (int i = 0; i < amonestados.length; i++) {
			if (this.amonestados[i]==null) {
				this.amonestados[i]=jugador1;
				this.minutosAmon[i]=d;
				return jugador1;
			}		
		}return null;
	}

	public Boolean expulsado(Jugador jugador) {
		for (int i = 0; i < expulsados.length; i++) {
			if (this.expulsados[i]==null) {
				this.expulsados[i]=jugador;
				
				if(this.local.buscarJugador(jugador)) {
					this.local.quitarJugador(jugador);
					return true;
				}else {
					if(this.visitante.buscarJugador(jugador)) {
						this.visitante.quitarJugador(jugador);
						return true;
					}
				}

			}		
		}
		return false;
		
	}
	public String resultadoPartido() {
		String resultado=local.getNombre()+" Goles:"+getGolLocal()+visitante.getNombre()+" Goles:"+getGolVisitante();
		return resultado;
	}
	public void resumenPartido() {
		String resumen= resultadoPartido()+"Total Goles: "+getGoles()+" Minutos:"+getMinutosGol()+
						  " Amonestados:"+getAmonestados()+" En minutos: "+getMinutosAmon();
		System.out.println(resumen);
	}
	public Integer getGolLocal() {
		return golLocal;
	}

	public void setGolLocal(Integer golLocal) {
		this.golLocal = golLocal;
	}

	public Integer getGolVisitante() {
		return golVisitante;
	}

	public void setGolVisitante(Integer golVisitante) {
		this.golVisitante = golVisitante;
	}

	public Equipo getLocal() {
		return local;
	}

	public void setLocal(Equipo local) {
		this.local = local;
	}

	public Equipo getVisitante() {
		return visitante;
	}

	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}

	public Jugador[] getGoles() {
		return goles;
	}

	public void setGoles(Jugador[] goles) {
		this.goles = goles;
	}

	public Jugador[] getAmonestados() {
		return amonestados;
	}

	public void setAmonestados(Jugador[] amonestados) {
		this.amonestados = amonestados;
	}

	public Jugador[] getExpulsados() {
		return expulsados;
	}

	public void setExpulsados(Jugador[] expulsados) {
		this.expulsados = expulsados;
	}

	public Double[] getMinutosGol() {
		return minutosGol;
	}

	public void setMinutosGol(Double[] minutosGol) {
		this.minutosGol = minutosGol;
	}

	public Double[] getMinutosAmon() {
		return minutosAmon;
	}

	public void setMinutosAmon(Double[] minutosAmon) {
		this.minutosAmon = minutosAmon;
	}
	

}
