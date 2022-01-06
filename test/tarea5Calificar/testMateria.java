package tarea5Calificar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class testMateria {
	
	@Test
	public void queSePuedaCrearUnaMateria() {
		Materia materia=new Materia("Programacion");
		
		assertNotNull(materia);
		
	}
	
	@Test
	public void queSePuedaAgregarUnaNota() {
		Materia materia=new Materia("Programacion");
		assertNotNull(materia);
		Nota nota1=new Nota("Leandro",5);
		assertTrue(materia.agregarNota(nota1));
		
		
	}
	
	@Test
	public void queNoSePuedaAgregarMasDeDosNotas() {
		Materia materia=new Materia("Programacion");
		assertNotNull(materia);
		
		Nota nota1=new Nota("Leandro",7);
		Nota nota2=new Nota("Pepe",6);
		Nota nota3=new Nota("Moni",3);
		assertTrue(materia.agregarNota(nota1));
		assertTrue(materia.agregarNota(nota2));
		assertTrue(materia.agregarNota(nota3));
		
		assertEquals(2, materia.cantidadNotas(), 0.01);
	}
	
	

}
