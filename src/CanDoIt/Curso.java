package CanDoIt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso implements Comparable<Curso>{ //El Comparable para ordenar

	private String nombreCurso;
	private List<Alumno> alumnos;
	private Integer codigo;

	public Curso(String nombreCurso, Integer codigo) {
		this.nombreCurso = nombreCurso;
		this.codigo=codigo;
		alumnos = new ArrayList<Alumno>();
	}

	public Integer getCodigo() {
		return codigo;
	}

	protected Boolean agregarAlumno(Alumno alumno) {
		Boolean seAgrego=false;
		if (!alumnos.contains(alumno)) {
			alumnos.add(alumno);
			seAgrego=true;
//			System.out.println("El Alumno "+alumno.getNombre()+" "+alumno.getApellido()+ "se acaba de agregar a "+getNombre());
		} 
		return seAgrego;

	}

	protected Boolean quitarAlumno(Integer dni) {
		for (Alumno alumno : alumnos) {
			if (alumno.getDni().equals(dni)) {
				alumnos.remove(alumno);
				return true;
			}
		}
		return false;
	}

	public Integer getCantidadDeAlumnos() {
		return alumnos.size();
	}

	public List<Alumno> obtenerListadoDeAlumnosEnCursoOrdenadosPorApellido() {
		List<Alumno> ordenado = new ArrayList<>();
		ordenado.addAll(alumnos);
		Collections.sort(ordenado); // Use Comparable en Alumno
		return ordenado;
	}

	public String getNombre() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}
	


//Para q no se repita su codigo ya q es unico por materia
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Curso other = (Curso) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
//con esto se ordenan por nombre al listar
	@Override
	public int compareTo(Curso o) {
		return Integer.valueOf(this.nombreCurso.compareTo(o.getNombre()));
	}

	
}
