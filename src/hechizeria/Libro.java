package hechizeria;

import java.util.HashMap;

public class Libro {

	private String nombre;
	private HashMap hechizos;

	public Libro(String nombre) {
		this.nombre=nombre;
		this.hechizos=new HashMap<>();
		// TODO Auto-generated constructor stub
	}

	public Boolean agregarHechizo(Hechizo hechizo) {
		// TODO Auto-generated method stub
		this.hechizos.put(hechizo.getNumero(), hechizo.getNombre());
		return true;
	}


	public Boolean hechizoDesarmar(Mueble mueble) {
		if(mueble.hechizoDesarmar()) {
		// TODO Auto-generated method stub
		return true;
		}else{
			return false;
		}
		
	}


	public Boolean hechizoAgrandar(Animal animal) {
		if(animal.hechizoAgrandar()) {
		// TODO Auto-generated method stub
		return true;
		}else{
			return false;
		}
}

	public Boolean hechizoDesarmar(Animal animal) {
		if(animal.hechizoDesarmar()) {
		// TODO Auto-generated method stub
		return true;
		}else{
			return false;
		}
	}

	public Boolean hechizoAgrandar(Mueble mueble) {
		if(mueble.hechizoAgrandar()) {
		// TODO Auto-generated method stub
		return true;
		}else{
			return false;
		}
	}

	public Integer cantidadDeHechizos() {
		// TODO Auto-generated method stub
		return this.hechizos.size();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashMap getHechizos() {
		return hechizos;
	}

	public void setHechizos(HashMap hechizos) {
		this.hechizos = hechizos;
	}
	


}
