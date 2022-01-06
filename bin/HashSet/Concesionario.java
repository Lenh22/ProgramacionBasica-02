package HashSet;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Concesionario {
	
	private String nombre;
	//Un Set
	private Set<Auto> autos;

	public Concesionario (String nombre) {
		this.nombre=nombre;
		//Un HashSet para q no se repita
		this.autos=new TreeSet<>();
	}

	public Boolean agregarAuto(Auto auto) {
		//Lo q hace el if es conteo si el auto esta, retorna Boolean	
		//if(!this.autos.contains(auto)) 
				return this.autos.add(auto);
				
		
		//return false;
	}

	public Integer obtenerCantidadAutos() {
		
		return this.autos.size();
	}
	
	public Auto buscarAuto(Auto auto) {
	 //El iterator es puntero al prox elemento. Este caso lo usamos para buscar el auto
		Iterator <Auto> it=this.autos.iterator();
		
		while(it.hasNext()) {
			Auto autoAComparar=it.next();
			if(autoAComparar.equals(auto))
				return autoAComparar;
		}
		return null;
		
	}

	public Set<Auto> obtenerFlora() {
		
		return this.autos;
	}
	public TreeSet<Auto> obtenerAutosPorAnioyPatente(){
		
		OrdenPorAnioPatente orden=new OrdenPorAnioPatente();
		TreeSet <Auto> ordenAnioPatente=new TreeSet<Auto>(orden);
		ordenAnioPatente.addAll(autos);
		
		return ordenAnioPatente;
	}
	
	public TreeSet<Auto> obtenerAutosPorOrdenEspecifico(Comparator<Auto> orden){
		
		//OrdenPorAnioPatente orden=new OrdenPorAnioPatente();
		TreeSet <Auto> ordenAnioPatente=new TreeSet<Auto>(orden);
		ordenAnioPatente.addAll(autos);
		
		return ordenAnioPatente;
	}
	
	
}
