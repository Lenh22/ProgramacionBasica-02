package ReproductorMusica;

public class Musica implements Comparable <Musica> {

	private String nombre;
	private Integer minutos;
	private Integer segundos;

	public Musica(String nombre, Integer minutos, Integer segundos) {
		this.nombre=nombre;
		this.minutos=minutos;
		this.segundos=segundos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public void setMinutos(Integer minutos) {
		this.minutos = minutos;
	}

	public Integer getSegundos() {
		return segundos;
	}

	public void setSegundos(Integer segundos) {
		this.segundos = segundos;
	}

	@Override //El comparable para ordenar por nombre de A a Z
	public int compareTo(Musica o) {	
		return Integer.valueOf(o.getNombre().compareTo(this.nombre)*-1);
	}

}
