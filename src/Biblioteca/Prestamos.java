package Biblioteca;

public class Prestamos {
	private Integer nro_prest;
	private Estudiantes estudiante;
	private Libros libro;

	public Prestamos(Integer nro_prest, Estudiantes estudiante, Libros libro) {
		this.nro_prest = nro_prest;
		this.estudiante = estudiante;
		this.libro = libro;
	}
	
	
	public Boolean registrarPrestamo(Integer id,Estudiantes estudiante,Libros libro) {
		Boolean sePuedePrestar=true;
		if (estudiante.getnLibros()<2) {
			libro.setHabilitado(false);
			estudiante.setnLibros(estudiante.getnLibros()+1);
			
		}else {sePuedePrestar=false;}
		return sePuedePrestar;
	}

	
	public void registrarDevolucion(Libros libro, Estudiantes estudiante) {
		estudiante.setnLibros(estudiante.getnLibros()-1);
		libro.setHabilitado(true);
	}
	
	
	public String toString() {
		return "El libro "+ libro.getNombre() +"fue prestado a "+estudiante.getApellido()
				+estudiante.getNombre()+"de DNI "+estudiante.getDni();
		
	}


	public Integer getNro_prest() {
		return nro_prest;
	}

	public void setNro_prest(Integer nro_prest) {
		this.nro_prest = nro_prest;
	}

	public Estudiantes getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiantes estudiante) {
		this.estudiante = estudiante;
	}

	public Libros getLibro() {
		return libro;
	}

	public void setLibro(Libros libro) {
		this.libro = libro;
	}


	}

