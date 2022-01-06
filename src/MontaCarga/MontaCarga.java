package MontaCarga;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MontaCarga {

	private Double pesoMaximo;
	private Set<Carga> cargas;
	//Los HashSet y TreeSet no dejan duplicados, no hay get
	//TreeSet ordena la coleccion y necesitas Comparable

	public MontaCarga(Double pesoMaximo) {
		this.pesoMaximo= pesoMaximo;
		this.cargas= new TreeSet<>();
	}

	public Boolean agregarCarga(Carga carga) {
		if(!cargas.contains(carga)) {
		if(obtenerPesoCargado()+carga.getPeso()<=pesoMaximo) {
		return this.cargas.add(carga);
		}
	}
		return false;
}
	public Double obtenerPesoCargado() {
		Double totalCargado= 0.0;
	
		for (Carga carga : cargas) {
			totalCargado+= carga.getPeso();
		}
		return totalCargado;
	}
	public Integer cantidadDeCargas() {
		return this.cargas.size();
	}
	
	public Carga buscarCargaPorId(Integer id) {
	for (Carga carga : cargas) {
		if(carga.getId().equals(id)) {
		return carga;
		}
	}
	return null;
	}
	
	public TreeSet<Carga> obtenerCargaOrdenadaPorPropietario(){
		//Se crea una clase para ordenar con Comparator
		OrdenPorPropietario orden = new OrdenPorPropietario();
		TreeSet<Carga> ordenada= new TreeSet<>(orden);
		
		ordenada.addAll(cargas);
		return ordenada;
	}

	public Double getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(Double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public Set<Carga> getCargas() {
		return cargas;
	}

	public void setCargas(Set<Carga> cargas) {
		this.cargas = cargas;
	}
	
	

}
