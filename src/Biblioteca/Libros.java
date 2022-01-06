package Biblioteca;

public class Libros {
	private Integer codigo;
	private String nombre,autor;
	private TipoLibro tipoDeLibro;
	private Boolean habilitado=true;

	public Libros(Integer codigo, String nombre, String autor,TipoLibro tipoDeLibro) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.autor = autor;
		this.tipoDeLibro=tipoDeLibro;
	}

	public String fotocopiable() {
		String fotocopia= "";
		if (tipoDeLibro==TipoLibro.GEOGRAFIA||tipoDeLibro==TipoLibro.GEOGRAFIA) {
			fotocopia="Esta es una fotocopia del libro";
		}else {fotocopia="Este libro no puede ser fotocopiable";}
		return fotocopia;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Boolean getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(Boolean habilitado) {
		this.habilitado = habilitado;
	}






}
