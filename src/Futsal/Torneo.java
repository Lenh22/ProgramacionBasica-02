package Futsal;

public class Torneo {

	private String nombre;
	private Integer cantPartidos;
	private Equipo[] equipos;
//	private Partido[] partidos;
	private Partido partido;
	
	public Torneo(String nombre, Integer cantPartidos) {
		this.nombre=nombre;
		this.cantPartidos=cantPartidos;
		equipos= new Equipo[25];
//		partidos=new Partido[25];
		
	}
 
	public Boolean agregarEquipo(Equipo equipo1) {
		for (int i = 0; i < equipos.length; i++) {
			if(equipos[i]==null) {
				equipos[i]=equipo1;
				return true;
			}
		}return false;
	}

	public void registrarPartido(Equipo equipo1, Equipo equipo2) {
		if(buscarEquipo(equipo1)&&buscarEquipo(equipo2)) {
			this.partido= new Partido(equipo1, equipo2);
//			for (int i = 0; i < partidos.length; i++) {
//				if(partidos[i]==null)
//					partidos[i]=partido;
//			}
		}
	}
	public Boolean buscarEquipo(Equipo equipo) {
		for (int i = 0; i < equipos.length; i++) {
			if(equipos[i].equals(equipo))
				return true;
		}return false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantPartidos() {
		return cantPartidos;
	}

	public void setCantPartidos(Integer cantPartidos) {
		this.cantPartidos = cantPartidos;
	}

	public Equipo[] getEquipos() {
		return equipos;
	}

	public void setEquipos(Equipo[] equipos) {
		this.equipos = equipos;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}





}
