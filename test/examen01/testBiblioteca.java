package examen01;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


import org.junit.Test;




public class testBiblioteca {
	
	
	@Test
	public void queNoHayanDosLibrosIguales() {
		Libro libro1 = new Libro(12345, "asdasda", "Lean");
		Libro libro2 = new Libro(12345, "asdasda", "Lean");
		Estudiantes estudiante1 = new Estudiantes(123454, "ea", "pedro");
		Biblioteca biblioteca = new Biblioteca("jose");
		assertEquals(libro1, libro2);
	}
	
	@Test
	public void queSePuedaImprimirElLibroDeHistoriaYDeGeografia() {
		Historia historia = new Historia(1234, "historia", "pepe");
		Geografia geografia = new Geografia(13456, "Geografia", "Len");		
		String textoEsperado1 = "Geografia";
		String textoEsperado2 = "Historia";
		assertEquals(historia.fotocopiable(), textoEsperado2);
		assertEquals(geografia.fotocopiable(), textoEsperado1);		
	}
	
	@Test
	public void puedanPedirMasDeDosLibros() {
		Libro libro1 = new Libro(12345, "asdasda", "Lean");
		Historia historia = new Historia(1234, "historia", "pepe");
		Geografia geografia = new Geografia(13456, "Geografia", "Len");		
		Estudiantes estudiante1 = new Estudiantes(123454, "ea", "pedro");
		Biblioteca biblioteca = new Biblioteca("Nueva");
		biblioteca.prestarLibro(libro1, estudiante1);
		biblioteca.prestarLibro(historia, estudiante1);
	//	assertFalse(biblioteca.prestarLibro(geografia, estudiante1));
		
	}
	@Test
	public void noEsteDisponible() {
		Libro libro1 = new Libro(1234, "Nose", "Pepe");
		Estudiantes estudiante1 = new Estudiantes(123435, "Lean", "Alonso");
		Biblioteca biblioteca = new Biblioteca("moron");
		biblioteca.prestarLibro(libro1, estudiante1);
		assertFalse(libro1.getDisponible());
	}
	@Test
	public void sePuedaDevolver() {
		Libro libro1 = new Libro(12345, "asdasda", "Lean");
		Estudiantes estudiante1 = new Estudiantes(39347169, "yo", "pepe");
		Biblioteca biblioteca = new Biblioteca("jose");
		biblioteca.prestarLibro(libro1, estudiante1);
		biblioteca.sacarLibroEstudiante(libro1, estudiante1);
		assertTrue(libro1.getDisponible());
	}
	@Test
	public void queSePuedaAgregarUnLibro() {
		Biblioteca biblioteca=new Biblioteca("moron");
		Libro hist=new Historia(1, "pepe", "autor");
	//assertTrue(biblioteca.agregarLibro(hist));
		
	}

}
