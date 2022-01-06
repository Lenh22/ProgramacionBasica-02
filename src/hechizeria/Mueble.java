package hechizeria;

public class Mueble extends Hechizable {
	
	private String nombre;

	public Mueble(String nombre) {
		this.nombre=nombre;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean hechizoAgrandar(){
		return false;
		
	}

}
