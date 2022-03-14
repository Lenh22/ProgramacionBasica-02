package CanDoIt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;


import org.junit.Test;

public class testAdmAlumnos {
//	Aca estara es test ya que se me hizo comodo comenzarlo con
//	TDD, cada metodo especifique el nombre de lo que haran

	// Aca algunos datos que los mantendre en el test
	String nombreAdm = "Administracion de Alumnos y Cursos"; // El nombre que usare con la administracion

	String nombreAl1 = "Leandro"; // El nombre del alumno
	String apellidoAl1 = "Alonso";// El apellido del alumno
	Integer dni1 = 123456; // DNI del alumno

	String nombreCur1 = "PB2"; // Nombre de un curso
	Integer codCurso=1; //Codigo del curso

	// Estos test solo fueron creados para crear los objetos mas rapido
	/*
	 * @Test public void queSeCreeUnaAdministracion() { Administracion adm = new
	 * Administracion (nombreAdm); }
	 * 
	 * @Test public void queSeCreeUnAlumno() { Alumno alumno1=new
	 * Alumno(nombreAl1,apellidoAl1,dni1); }
	 * 
	 * @Test public void queSeCreeUnCurso() { Curso curso1= new Curso(nombreCur1); }
	 */

	@Test
	public void queSePuedaAgregarUnAlumnoALaAdministracion() {
		// Se crean alumnos con sus parametros
		Alumno alumno1 = new Alumno(nombreAl1, apellidoAl1, dni1);
		Alumno alumno2 = new Alumno("Kay", "Alonso", 134653);
		// Creo una administracion y agrego a los alumnos
		Administracion adm = new Administracion(nombreAdm);
		adm.agregarAlumno(alumno1);
		adm.agregarAlumno(alumno2);
		// Uso una lista que guardara los alumnos que tendra la administracion
		List<Alumno> listaDeAlumnos = adm.getAlumnos();
		// Los valores que se esperan
		String valorEsperado1 = "Leandro";
		String valorEsperado2 = "Kay";
		// Compara el valor esperado con la posicion del alumno
		// Aunque tambien tuve la opcion de hacerlo con un buscador que habia agregado,
		// ese retornaria el alumno buscado
		assertEquals(valorEsperado1, listaDeAlumnos.get(0).getNombre());
		assertEquals(valorEsperado2, listaDeAlumnos.get(1).getNombre());
		// Este compara si hay 2 alumnos en la adm
		assertEquals(2, adm.getCantidadDeAlumnos(), 0.01);
	}

	@Test

	public void queSePuedaAgregarUnCursoALaAdministracion() {
		// Se crearon 2 cursos, uno usa un String directamente y el otro donde almacene
		// el dato "nombreCur1"
		Curso curso1 = new Curso(nombreCur1,codCurso);
		Curso curso2 = new Curso("Taller Web 1",2);
		// Creo una administracion y agrego los cursos
		Administracion adm = new Administracion(nombreAdm);
		adm.agregarCurso(curso1);
		adm.agregarCurso(curso2);
		// creo una lista en donde guardare los cursos
		List<Curso> listaDeCursos = new ArrayList<>();
		listaDeCursos = adm.getCursos();
		// Almaceno los valores que espero
		String valorEsperado1 = nombreCur1;
		String valorEsperado2 = "Taller Web 1";
		// Compara el valor esperado con la posicion del curso
		// Aunque tambien tuve la opcion de hacerlo con un buscador que habia agregado,
		// ese retornaria el curso buscado
		assertEquals(valorEsperado1, listaDeCursos.get(0).getNombre());
		assertEquals(valorEsperado2, listaDeCursos.get(1).getNombre());
		assertEquals(2, adm.getCantidadDeCursos(), 0.01);// verifica si hay 2 cursos en el adm
	}

	@Test
	public void queSeAgregueAlumnoACurso() {
		// Aca como antes, creo la administracion, alumnos y cursos
		Administracion adm = new Administracion(nombreAdm);

		Alumno alumno1 = new Alumno(nombreAl1, apellidoAl1, dni1);
		Alumno alumno2 = new Alumno("Kay", "Alonso", 134653);

		Curso curso1 = new Curso(nombreCur1,codCurso);
		// Agrego a los alumnos y cursos a la administracion
		adm.agregarAlumno(alumno1);
		adm.agregarAlumno(alumno2);
		adm.agregarCurso(curso1);
		// Aca agregue los alumnos a los cursos de dos maneras
		assertTrue(adm.agregarAlumnoACurso(dni1, codCurso));// Aqui la agregue desde el objeto Administracion
		assertTrue(curso1.agregarAlumno(alumno2));// Aqui la agregue desde el objeto Curso
		assertEquals(2, curso1.getCantidadDeAlumnos(), 0.01);// Esto compara si hay 2 personas en el curso

	}

	@Test
	public void queSeQuitenAlumnosDeCurso() {
		// Se crea la administracion, alumnos y curso
		Administracion adm = new Administracion(nombreAdm);

		Alumno alumno1 = new Alumno(nombreAl1, apellidoAl1, dni1);
		Alumno alumno2 = new Alumno("Kay", "Alonso", 134653);

		Curso curso1 = new Curso(nombreCur1,codCurso);

		adm.agregarAlumno(alumno1);
		adm.agregarAlumno(alumno2);
		adm.agregarCurso(curso1);

		adm.agregarAlumnoACurso(dni1, codCurso);
		curso1.agregarAlumno(alumno2);

		assertEquals(2, curso1.getCantidadDeAlumnos(), 0.01);
		// Aqui se quitaran los alumnos del curso
		assertTrue(adm.quitarAlumnoDeCurso(dni1, codCurso));
		assertTrue(curso1.quitarAlumno(134653));
		// Mostrara que la cantidad de alumnos en el curson son 0
		assertEquals(0, curso1.getCantidadDeAlumnos(), 0.01);
		// Pero aun en administracion, esos 2 los alumnos estan
		assertEquals(2, adm.getCantidadDeAlumnos(), 0.01);

	}

	@Test
	public void queNoSeAgreguenAlumnosRepetidosEnCursos() {
		// Creo que alumnos que son iguales
		Alumno alumno1 = new Alumno(nombreAl1, apellidoAl1, dni1);
		Alumno alumno2 = new Alumno(nombreAl1, apellidoAl1, dni1);
		Alumno alumno3 = new Alumno(nombreAl1, apellidoAl1, dni1);

		Curso curso1 = new Curso(nombreCur1,codCurso);
		// Ahora se intenta agregar a los 3 alumnos iguales
		curso1.agregarAlumno(alumno1);
		curso1.agregarAlumno(alumno2);
		curso1.agregarAlumno(alumno3);
		// Pero aca se compara con que hay solo 1 alumno
		assertEquals(1, curso1.getCantidadDeAlumnos(), 0.01);

	}

	@Test
	public void queNoSeAgreguenCursosRepetidos() {
		// Lo mismo con los cursos, son 3 iguales
		Curso curso1 = new Curso(nombreCur1,codCurso);
		Curso curso2 = new Curso(nombreCur1,codCurso);
		Curso curso3 = new Curso(nombreCur1,codCurso);

		Administracion adm = new Administracion(nombreAdm);

		// Se intentan agregar 3 cursos iguales
		adm.agregarCurso(curso1);
		adm.agregarCurso(curso2);
		adm.agregarCurso(curso3);
		// Pero resulta que solo uno hay
		assertEquals(1, adm.getCantidadDeCursos(), 0.01);
	}

	@Test
	public void queSeEncuentreUnAlumnoYUnCurso() {
		// Funcion busqueda
		Curso curso1 = new Curso(nombreCur1,codCurso);
		Alumno alumno1 = new Alumno(nombreAl1, apellidoAl1, dni1);

		Administracion adm = new Administracion(nombreAdm);

		adm.agregarAlumno(alumno1);
		adm.agregarCurso(curso1);

		// Se buscara en base al dni y nombre del curso
		assertEquals(alumno1, adm.buscarAlumno(dni1));
		assertEquals(curso1, adm.buscarCurso(codCurso));
	}

	@Test
	public void queSeElimineAlumnoDeAdministracion() {
		// Crea curso, alumnos y administracion
		Curso curso1 = new Curso(nombreCur1,codCurso);

		Alumno alumno1 = new Alumno(nombreAl1, apellidoAl1, dni1);
		Alumno alumno2 = new Alumno("Pepe", "Argento", 1236708);

		Administracion adm = new Administracion(nombreAdm);
		// Se agregan a la administracion
		adm.agregarAlumno(alumno1);
		adm.agregarAlumno(alumno2);
		adm.agregarCurso(curso1);
		// Se agregan 2 alumnos a 1 curso
		adm.agregarAlumnoACurso(dni1, codCurso);
		adm.agregarAlumnoACurso(1236708, codCurso);
		// Como elimino al alumno de Administracion se quitara de todos sus cursos
		adm.eliminarAlumno(dni1);

		assertEquals(1, adm.getCantidadDeAlumnos(), 0.01);// Se fija si hay solo 1 alumno en adm
		assertEquals(1, curso1.getCantidadDeAlumnos(), 0.01);// Se fija si hay solo 1 alumno en el curso

	}

}
