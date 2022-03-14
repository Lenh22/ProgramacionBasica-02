package CanDoIt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Administracion {

	private String nombre;
	private List<Curso> cursosTotales;
	private List<Alumno> alumnosTotales;
	
	//Crea objeto y guarda a los alumnos en Arrays
	public Administracion(String nombre) {
		this.nombre = nombre;
		alumnosTotales = new ArrayList<Alumno>();
		cursosTotales = new ArrayList<Curso>();
	}
	
	public Boolean agregarAlumno(Alumno alumno) {
		if (!alumnosTotales.contains(alumno)) {//Se fija si no contiene al alumno ya dentro del array
			alumnosTotales.add(alumno);
			return true;
		} else {
			return false;
		}
	}

	public Boolean agregarCurso(Curso curso) {
		if (!cursosTotales.contains(curso)) {//Se fija si no esta el curso en el array
			cursosTotales.add(curso);
			return true;
		} else {
			return false;
		}
	}
	
	public Boolean agregarAlumnoACurso(Integer dni, Integer id) {//Agrega directamente al alumno en el curso
	
		if(buscarAlumno(dni)!=null && buscarCurso(id)!=null) {
			buscarCurso(id).agregarAlumno(buscarAlumno(dni));
			return true;
		}
		return false;
	}
	
	public Boolean quitarAlumnoDeCurso(Integer dni, Integer id) {//Quita directamente al alumno en el curso
		
		if(buscarAlumno(dni)!=null && buscarCurso(id)!=null) {//usamos los metodos buscar para encontrarlos 
			buscarCurso(id).quitarAlumno(dni);
			return true;
		}
		return false;
	}
	
	public Boolean eliminarAlumno(Integer dni) {//Elimina un alumno de la administracion como de todos los cursos
		for (Alumno alumno : alumnosTotales) {
			if (alumno.getDni().equals(dni)) {
				alumnosTotales.remove(alumno);
				for (Curso curso : cursosTotales) {
					curso.quitarAlumno(dni);
				}
				return true;
			}
		}
		return false;
	}
	
	public Boolean eliminarCurso(Integer codigo) {
		for (Curso curso : cursosTotales) {
			if (curso.getCodigo().equals(codigo)) {
				cursosTotales.remove(curso);
				return true;
			}
		}
		return false;
	}
	
	public Alumno buscarAlumno(Integer dni) {
		Alumno alumnoBuscado=null;
		for (int i = 0; i < alumnosTotales.size(); i++) {
			if(alumnosTotales.get(i)!=null) {
				if(alumnosTotales.get(i).getDni().equals(dni)) {
					alumnoBuscado=alumnosTotales.get(i);
				}
			}
		}
		return alumnoBuscado;
	}
	
	public Curso buscarCurso(Integer id) {
		Curso cursoBuscado=null;
		for (int i = 0; i < cursosTotales.size(); i++) {
			if(cursosTotales.get(i)!=null) {
				if(cursosTotales.get(i).getCodigo().equals(id)) {
					cursoBuscado=cursosTotales.get(i);
				}
			}
		}
		return cursoBuscado;
	}
	
	public List<Curso> obtenerListadoDeCursoOrdenados() {
		List<Curso> ordenado = new ArrayList<>();
		ordenado.addAll(cursosTotales);
		Collections.sort(ordenado); // Use Comparable en Alumno
		return ordenado;
	}
	public List<Alumno> obtenerListadoDeTotalAlumnoOrdenados() {
		List<Alumno> ordenado = new ArrayList<>();
		ordenado.addAll(alumnosTotales);
		Collections.sort(ordenado); // Use Comparable en Alumno
		return ordenado;
	}
	

	public List<Alumno> getAlumnos() {
		return alumnosTotales;
	}

	public Integer getCantidadDeAlumnos() {
		return alumnosTotales.size();
	}

	public List<Curso> getCursos() {
		return cursosTotales;
	}

	public Integer getCantidadDeCursos() {
		return cursosTotales.size();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Curso> getCursosTotales() {
		return cursosTotales;
	}

	public List<Alumno> getAlumnosTotales() {
		return alumnosTotales;
	}
	

}
