package tarea5Calificar;

import java.util.Iterator;
import java.util.TreeSet;

public class Materia {

	private String nombre;
	private TreeSet notas;

	public Materia(String nombre) {
		this.nombre=nombre;
		this.notas=new TreeSet<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TreeSet getNotas() {
		return notas;
	}

	public void setNotas(TreeSet notas) {
		this.notas = notas;
	}



	public Integer cantidadNotas() {
		
		return this.notas.size();
	}

	public Boolean agregarNota(Nota nota1)  {
		if(notas.size()<2) {
			this.notas.add(nota1);
			return true;
		}
	return false;
	}
	

}
