package MontaCarga;

public class Carga implements Comparable <Carga> {

	private Integer id;
	private String nombre;
	private Double peso;

	public Carga(Integer id, String nombre, Double peso) {
		this.id= id;
		this.nombre=nombre;
		this.peso=peso;
	}
	//Para implementar comparable
		@Override
		public int compareTo(Carga o) {
			// TODO Auto-generated method stub
			return this.getId().compareTo(o.getId());
		}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carga other = (Carga) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Carga [id=" + id + ", nombre=" + nombre + ", peso=" + peso + "]";
	}

	
	
	

}
