package EjPersonas;

public class Ciudad {
	private Integer cp;
	private String nombre;
	private Provincia provincia;
	
	public Ciudad(Integer cp, String nombre, Provincia provincia) {
		this.cp=cp;
		this.nombre=nombre;
		this.provincia=provincia;
	}

	public Integer getCp() {
		return cp;
	}

	public void setCp(Integer cp) {
		this.cp = cp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
}
