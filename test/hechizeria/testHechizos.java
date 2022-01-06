package hechizeria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class testHechizos {
	@Test
	public void queSeCreeUnLibro(){
		Libro libro=new Libro("Libro de Hechizos");
		assertNotNull(libro);
	}
	
	@Test
	public void queSeAgregueUnLibro(){
		Libro libro=new Libro("Libro de Hechizos");
		assertNotNull(libro);
		Hechizo hechizo=new Hechizo(1,"Patronus");
		assertTrue(libro.agregarHechizo(hechizo));
	}
	
	@Test 
	public void quePuedaHechizarUnMuebleYAnimal(){
		Libro libro=new Libro("Libro de Hechizos");
		assertNotNull(libro);
		Hechizo hechizo=new Hechizo(1,"Patronus");
		assertTrue(libro.agregarHechizo(hechizo));
		Mueble mueble=new Mueble("Mesa");
		Animal animal=new Animal("Gato");
		assertNotNull(mueble);
		assertNotNull(animal);
		assertTrue(libro.hechizoDesarmar(mueble));
		assertTrue(libro.hechizoAgrandar(animal));

	}
	
	@Test 
	public void queNoPuedaHechizar(){

		Libro libro=new Libro("Libro de Hechizos");
		Hechizo hechizo=new Hechizo(1,"Patronus");
		assertTrue(libro.agregarHechizo(hechizo));
		Mueble mueble=new Mueble("Mesa");
		Animal animal=new Animal("Gato");

		assertFalse(libro.hechizoDesarmar(animal));
		assertFalse(libro.hechizoAgrandar(mueble));
		
	}
	@Test
	public void queNoSePuedanAgregarDosHechizosIguales() {
		Libro libro=new Libro("Libro de Hechizos");
		assertNotNull(libro);
		Hechizo hechizo=new Hechizo(1,"Patronus");
		assertTrue(libro.agregarHechizo(hechizo));
		assertEquals(1, libro.cantidadDeHechizos(),0.1);
		
		Hechizo hechizo2=new Hechizo(1,"Patronus");
		assertFalse(libro.agregarHechizo(hechizo2));//Problema aca, si lo agrega
		assertEquals(1, libro.cantidadDeHechizos(),0.01);
		
	}
	

}
