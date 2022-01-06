package hechizeria;

public class Animal extends Hechizable {

	private String nombre;

	public Animal(String nombre) {
		this.nombre=nombre;
		// TODO Auto-generated constructor stub
	}
	@Override
	public Boolean hechizoDesarmar() {
		return false;
	}
	

	

}
