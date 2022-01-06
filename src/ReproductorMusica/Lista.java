package ReproductorMusica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import CarritoCompra.Producto;

public class Lista {

	private String nombreLista;
	private String autor;
	private HashMap<Integer, Musica> lista; // Agregando tema Map
	private Boolean reproducir;

	public Lista(String nombreLista, String autor) {
		this.nombreLista = nombreLista;
		this.autor = autor;
		this.reproducir = false; // Comienza pausado
		lista = new HashMap<Integer, Musica>();
	}

	public String getAutor() {
		return this.autor;
	}

	public Boolean agregarCancion(Integer clave, Musica musica) throws claveDuplicadaException {// Agregando tema
																								// Exception
		Boolean agregada = false;
		// Recorda q PUT retorna Null
		if (!lista.containsKey(clave)) {
			this.lista.put(clave, musica); // Esto retorna Null
			agregada = true;
		} else {
			throw new claveDuplicadaException(
					"No se pudo agregar la cancion: '" + musica.getNombre() + "',por tener Clave duplicada"); // Crea
																												// una
																												// excepcion
																												// si ya
																												// esta
																												// la
																												// clave
		}
		return agregada;
	}

	public Boolean eliminarCancionPorNumero(Integer nro) {
		if (lista.containsKey(nro)) {
			lista.remove(nro);// Elimina Key y value buscando la clave
			return true;
		}
		return false;
	}

	public Boolean reproducir() {
		this.reproducir = true;
		return reproducir;
	}

	public Boolean pausar() {
		this.reproducir = false;
		return reproducir;
	}

	public Double getDuracion() {
		Double minuto = 0.0;
		Double segundo = 0.0;
		Double duracionTotal = 0.0;

		for (Musica musica : lista.values()) {
			if (musica.getMinutos() + minuto < 60) { // Mientras no sea mayor a 60 se puede
				minuto += musica.getMinutos();
			}
			if (musica.getSegundos() + segundo < 60) {
				segundo += musica.getSegundos();
			} else {
				Double resto = (segundo + musica.getSegundos()) - 60.0; // Se queda solo con el resto de esos segundos
				minuto++;
				segundo = resto;
			}
			duracionTotal = minuto + (segundo / 100);// Los segundos se dividen por 100 para quedar luego de la coma
		}
		return duracionTotal;
	}

	public List ordenarMusicaPorNombre() { // Agregando tema Comparable o Comparator (Ordenamiento)
		List<Musica> ordenada = new ArrayList<>();
		ordenada.addAll(this.lista.values());
//Con COMPARABLE (En Clase Productos se implementa y se hace el metodo)
		Collections.sort(ordenada);

//Con COMPARATOR (Se crea una nueva clase)
//		Collections.sort(ordenado, new ordenarPorNombre());	
		return ordenada;
	}

//Get y Set
	public String getNombreLista() {
		return nombreLista;
	}

	public void setNombreLista(String nombreLista) {
		this.nombreLista = nombreLista;
	}

	public HashMap<Integer, Musica> getLista() {
		return lista;
	}

	public void setLista(HashMap<Integer, Musica> lista) {
		this.lista = lista;
	}

	public Boolean getReproducir() {
		return reproducir;
	}

	public void setReproducir(Boolean reproducir) {
		this.reproducir = reproducir;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getCantidadDeCanciones() {
		return lista.size();
	}

}
