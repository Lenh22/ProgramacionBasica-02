package CanDoIt;

import java.util.List;
import java.util.Scanner;

public class MainAdministracionAlumnoCurso {
	static final Scanner teclado = new Scanner(System.in);

	static String nombre;
	static String nombreCurso;
	static String apellido;
	static Integer dni;
	static Integer codigo;

	static final int VOLVER_ATRAS = 9;

	// MENU PRINCIPAL DE ADMINISTRACION
	static final int SALIR = 0;
	static final int GESTIONAR_ALUMNOS = 1;
	static final int GESTIONAR_CURSOS = 2;

	// MENU DE ALUMNO
	static final int REGISTRAR_ALUMNO = 1;
	static final int ELIMINAR_ALUMNO = 2;
	static final int AGREGAR_ALUMNO_A_CURSO = 3;
	static final int QUITAR_ALUMNO_DE_CURSO = 4;
	static final int LISTAR_TODOS_LOS_ALUMNOS = 5;// TMB MUESTRA LA CANTIDAD
	static final int BUSCAR_ALUMNO = 6;
//	static final int VOLVER_ATRAS = 9;
//	static final int SALIR=0;

	// MENU DE CURSO
	static final int REGISTRAR_CURSO = 1;
	static final int ELIMINAR_CURSO = 2;
//	static final int AGREGAR_ALUMNO_A_CURSO=3;
//	static final int QUITAR_ALUMNO_DE_CURSO=4;
	static final int LISTAR_TODOS_LOS_CURSOS = 5; // TMB MUESTRA LA CANTIDAD
	static final int CANTIDAD_DE_ALUMNOS_EN_CURSO = 6;
	static final int BUSCAR_CURSO = 7;
//	static final int VOLVER_ATRAS = 9;
//	static final int SALIR=0;

	/*--------ATENCION---------
		(Esto estara comentado en el codigo)
		Generare por default algunos alumnos y cursos ya que no se usar HIBERNATE para poder conectarlo
		a una Base de Batos y se puedan quedar almacenados sin tener que agregarlos otra vez, 
		pero si ejecuta el programa desde aqui podra ver que todo funciona correctamente
		Las clases las hice con TDD excepto el main.
		Lamentablemente no se usar, como dije en la entrevista del viernes, Hibernate, Maven o spring
		aunque investigue un poco sobre Hibernate, que hace una conexion con Java y la base de datos, se deberia crear una tabla
		en esa base y conectarla, pero no me dio el tiempo ni la practica (Porque intente y resulto mal) de poder aprenderlo correctamente.
		Cree en MySQL una Base de datos aunque no resulto el conectarla (dejare los errores que tuve sobre eso y dejare un archivo con los comandos en SQL),
		quedaria una Base de Datos con tablas de: Alumnos- Cursos- Administracion, totalmente vacias y sin poder rellenarse a travez de la conexion con Java
		Fue divertido, creo que no tuve tantos problemas como me imagine ya que este ejercicio me recordo a tareas que fui realizando en el curso de
		Programacion Basica 1 y 2, es mas, para ser sincero fui fijandome viejos ejercicios con cosas similares (O no tanto pero me daban ideas) 
		y usandolas de ejemplo en algunos casos para hacer esto
	
		Espero que les agrede mi esfuerzo, un saludo.
		Leandro Alonso
	*/
	public static void main(String[] args) {
		Administracion administracion = new Administracion("Administracion de Alumnos y Cursos");
		int opcionDeseada = 0;

		// ******************GENERACION POR DEFAULT QUE HARE PARA ALGUNOS ALUMNOS Y
		// CURSOS *******************
		administracion.agregarAlumno(new Alumno("Leandro", "Alonso", 123));// DNI: 123
		administracion.agregarAlumno(new Alumno("M", "Argento", 6868));// DNI: 6868
		administracion.agregarAlumno(new Alumno("F", "Zarauza", 1789));// DNI: 1789
		administracion.agregarAlumno(new Alumno("K", "Sanchez", 13453));// DNI: 13453
		administracion.agregarAlumno(new Alumno("L", "Messi", 13457));// DNI: 13457
		administracion.agregarAlumno(new Alumno("A", "Saez", 16554));// DNI: 16554
		administracion.agregarAlumno(new Alumno("P", "Argento", 43243));// DNI: 43243

		administracion.agregarCurso(new Curso("Programacion_Basica_1", 1));// ID: 1
		administracion.agregarCurso(new Curso("Base_De_Datos", 2));// ID: 2
		administracion.agregarCurso(new Curso("Taller_Web_1", 3));// ID :3
		// Programacion basica 1
		administracion.agregarAlumnoACurso(123, 1);
		administracion.agregarAlumnoACurso(43243, 1);
		administracion.agregarAlumnoACurso(6868, 1);
		// Base de datos
		administracion.agregarAlumnoACurso(123, 2);
		administracion.agregarAlumnoACurso(13453, 2);
		administracion.agregarAlumnoACurso(13457, 2);
		administracion.agregarAlumnoACurso(16554, 2);
		administracion.agregarAlumnoACurso(1789, 2);
		administracion.agregarAlumnoACurso(123, 2);
		// Taller web 1
		administracion.agregarAlumnoACurso(123, 3);

		// ************Aqui hacia abajo sera el main como
		// tal*****************************

		System.out.println("Bienvenidx a " + administracion.getNombre());

		do {
			opcionDeseada = menuPrincipal();
			switch (opcionDeseada) {
			case GESTIONAR_ALUMNOS:
				gestionDeAlumno(administracion);
				break;
			case GESTIONAR_CURSOS:
				gestionDeCursos(administracion);
				break;
			case SALIR:
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}

		} while (opcionDeseada != SALIR);
		System.out.println("Gracias por usar nuestro sistema.¡Adios, tenga buen dia!");

	}

	private static void gestionDeCursos(Administracion administracion) {
		int opcionDeseada;
		System.out.println("1- Para registrar Curso");
		System.out.println("2- Para eliminar Curso");
		System.out.println("3- Para agregar Alumno a Curso");
		System.out.println("4- Para quitar Alumno de Curso");
		System.out.println("5- Para listar todos los Cursos");
		System.out.println("6- Para ver la cantidad de alumnos en el curso");
		System.out.println("7- Para Buscar Curso");
		System.out.println("9- Para volver al inicio");
		opcionDeseada = teclado.nextInt();

		switch (opcionDeseada) {
		case REGISTRAR_CURSO:
			registrarCurso(administracion);
			break;
		case ELIMINAR_CURSO:
			eliminarCurso(administracion);
			break;
		case AGREGAR_ALUMNO_A_CURSO:
			agregarAlumnoACurso(administracion);
			break;
		case QUITAR_ALUMNO_DE_CURSO:
			quitarAlumnoDeCurso(administracion);
			break;
		case LISTAR_TODOS_LOS_CURSOS:
			listarCursos(administracion);
			break;
		case CANTIDAD_DE_ALUMNOS_EN_CURSO:
			cantidadAlumnosEnUnCurso(administracion);
			break;
		case BUSCAR_CURSO:
			buscarCurso(administracion);
			break;
		case VOLVER_ATRAS:
			break;

		default:
			System.out.println("Opcion incorrecta");
			break;
		}

	}

	private static void buscarCurso(Administracion administracion) {
		System.out.println("Ingrese ID para buscar");
		codigo = teclado.nextInt();
		Curso encontrado = administracion.buscarCurso(codigo);
		if (encontrado != null) {
			System.out.println(encontrado.getNombre() + " ID: " + encontrado.getCodigo());
		} else {
			System.out.println("No se pudo encontrar");
		}

	}

	private static void cantidadAlumnosEnUnCurso(Administracion administracion) {
		System.out.println("Ingrese ID del curso para ver sus Alumnos");
		codigo = teclado.nextInt();
		if (administracion.buscarCurso(codigo) != null) {
			System.out.println(
					"Cantidad de alumnos en curso: " + administracion.buscarCurso(codigo).getCantidadDeAlumnos());
			List<Alumno> lista = administracion.buscarCurso(codigo)
					.obtenerListadoDeAlumnosEnCursoOrdenadosPorApellido();
			System.out.println("Lista de Alumnos en el Curso: " + administracion.buscarCurso(codigo).getNombre());
			for (Alumno alumno : lista) {
				System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " -- " + alumno.getDni());
			}

		} else {
			System.out.println("No se encontro el Curso");
		}

	}

	private static void listarCursos(Administracion adm) {
		System.out.println("Cantidad de Cursos: " + adm.getCantidadDeCursos());
		List<Curso> lista = adm.obtenerListadoDeCursoOrdenados();

		System.out.println("Lista de Cursos: ");
		for (Curso curso : lista) {
			System.out.println(curso.getNombre() + " --ID: " + curso.getCodigo());
		}

	}

	private static void eliminarCurso(Administracion administracion) {
		System.out.println("Ingrese el ID del curso que desea eliminar");
		codigo = teclado.nextInt();

		if (administracion.buscarCurso(codigo) != null) {
			System.out.println("Curso de codigo " + codigo + " y nombre: "
					+ administracion.buscarCurso(codigo).getNombre() + " eliminado");
			administracion.eliminarCurso(codigo);
		} else {
			System.out.println("No se encontro el Curso a eliminar");
		}
	}

	private static void registrarCurso(Administracion administracion) {
		System.out.println("Ingrese nombre de curso sin espacios");
		nombreCurso = teclado.next();
		System.out.println("Ingrese ID del curso");
		codigo = teclado.nextInt();

		Curso cursoNuevo = new Curso(nombreCurso, codigo);
		Boolean seAgrego = administracion.agregarCurso(cursoNuevo);
		if (seAgrego == true) {
			System.out.println("Se agrego el curso con ID: " + codigo);
		} else {
			System.out.println("No se pudo agregar con ese ID");
		}

	}

	private static int gestionDeAlumno(Administracion administracion) {
		int opcionDeseada;
		System.out.println("1- Para registrar Alumno");
		System.out.println("2- Para eliminar Alumno");
		System.out.println("3- Para agregar Alumno a Curso");
		System.out.println("4- Para quitar Alumno de Curso");
		System.out.println("5- Para listar todos los Alumnos");
		System.out.println("6- Para Buscar Alumno");
		System.out.println("9- Para volver al inicio");
		opcionDeseada = teclado.nextInt();
		switch (opcionDeseada) {
		case REGISTRAR_ALUMNO:
			registrarAlumno(administracion);
			break;
		case ELIMINAR_ALUMNO:
			eliminarAlumno(administracion);
			break;
		case AGREGAR_ALUMNO_A_CURSO:
			agregarAlumnoACurso(administracion);
			break;
		case QUITAR_ALUMNO_DE_CURSO:
			quitarAlumnoDeCurso(administracion);
			break;
		case LISTAR_TODOS_LOS_ALUMNOS:
			listarAlumnos(administracion);
			break;
		case BUSCAR_ALUMNO:
			System.out.println("Ingrese DNI para buscar");
			dni = teclado.nextInt();
			Alumno encontrado = administracion.buscarAlumno(dni);
			if (encontrado != null) {
				System.out.println(
						encontrado.getNombre() + " " + encontrado.getApellido() + " DNI:" + encontrado.getDni());
			} else {
				System.out.println("No se pudo encontrar");
			}
			break;
		case VOLVER_ATRAS:
			break;
		default:
			System.out.println("Opcion incorrecta");
			break;
		}
		return opcionDeseada;

	}

	private static void quitarAlumnoDeCurso(Administracion administracion) {
		System.out.println("Ingrese el DNI del alumno");
		dni = teclado.nextInt();
		System.out.println("Ingrese el ID del Curso");
		codigo = teclado.nextInt();
		if (administracion.buscarAlumno(dni) != null) {
			if (administracion.buscarCurso(codigo) != null) {
				administracion.quitarAlumnoDeCurso(dni, codigo);
				System.out.println("Se ha quitado a " + administracion.buscarAlumno(dni).getNombre() + " "
						+ administracion.buscarAlumno(dni).getApellido() + " del curso "
						+ administracion.buscarCurso(codigo).getNombre());
			} else {
				System.out.println("No se encontro ese curso");
			}
		} else {
			System.out.println("No se encontro ese alumno");
		}

	}

	private static void agregarAlumnoACurso(Administracion administracion) {
		System.out.println("Ingrese el DNI del alumno");
		dni = teclado.nextInt();
		System.out.println("Ingrese el ID del Curso");
		codigo = teclado.nextInt();
		if (administracion.buscarAlumno(dni) != null) {
			if (administracion.buscarCurso(codigo) != null) {

				Boolean seAgrego = administracion.agregarAlumnoACurso(dni, codigo);
				if (seAgrego == true) {
					System.out.println("Esta " + administracion.buscarAlumno(dni).getApellido() + " al curso "
							+ administracion.buscarCurso(codigo).getNombre());
				} else {
					System.out.println("El Alumno " + administracion.buscarAlumno(dni).getNombre() + " "
							+ administracion.buscarAlumno(dni).getApellido() + " ya se encontraba en el curso de "
							+ administracion.buscarCurso(codigo).getNombre());
				}
			} else {
				System.out.println("No se encontro ese curso");
			}
		} else {
			System.out.println("No se encontro ese alumno");
		}

	}

	private static void eliminarAlumno(Administracion administracion) {
		System.out.println("Ingrese el DNI del alumno que desea eliminar");
		dni = teclado.nextInt();

		if (administracion.buscarAlumno(dni) != null) {
			System.out.println("Alumno " + administracion.buscarAlumno(dni).getNombre() + " "
					+ administracion.buscarAlumno(dni).getApellido() + " con DNI " + dni + " eliminado");
			administracion.eliminarAlumno(dni);
		} else {
			System.out.println("No se encontro el alumno a eliminar");
		}
	}

	private static void registrarAlumno(Administracion administracion) {
		System.out.println("Ingrese nombre sin espacios");
		nombre = teclado.next();
		System.out.println("Ingrese apellido");
		apellido = teclado.next();
		System.out.println("Ingrese DNI");
		dni = teclado.nextInt();
		Alumno nuevo = new Alumno(nombre, apellido, dni);
		Boolean seAgrego = administracion.agregarAlumno(nuevo);
		if (seAgrego == true) {
			System.out.println("Se registro el Alumno con dni: " + dni);
		} else {
			System.out.println("No se pudo crear el Alumno con ese DNI");
		}
	}

	private static int menuPrincipal() {
		int opcionDeseada;
		System.out.println("************************");
		System.out.println("Menu de opciones");
		System.out.println("1 - Para gestionar Alumnos");
		System.out.println("2 - Para gestionar Cursos");
		System.out.println("0 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion");
		opcionDeseada = teclado.nextInt();
		return opcionDeseada;
	}

	private static void listarAlumnos(Administracion adm) {
		List<Alumno> lista = adm.obtenerListadoDeTotalAlumnoOrdenados();

		System.out.println("Cantidad de Alumnos: " + adm.getCantidadDeAlumnos());
		System.out.println("Lista de Alumnos: ");
		for (Alumno alumno : lista) {
			System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " -- " + alumno.getDni());
		}

	}

}
