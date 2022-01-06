package ReproductorMusica;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import CarritoCompra.Producto;

public class ReproductorTest {
	
	@Test (expected = claveDuplicadaException.class)
	public void queSeAgregueReproductores() throws claveDuplicadaException {//Agrego la excepcion de clave para cuando se agregan canciones a la lista
		//Crear musica
		Musica musica1 = new Musica ("Lamento Boliviano",3, 30);
		Musica musica2 = new Musica ("The Hill",3, 0);
		Musica musica3 = new Musica ("Sad but true",5, 0);
		
		//Crear lista
		Lista lista = new Lista ("Mi musica", "Len");
		
		//Datos personales
		lista.setAutor("Leandro");
		assertEquals("Leandro", lista.getAutor());
		
		//Agregar canciones (Aqui trabaja el excepcion de la clase)
		assertNotNull(lista.agregarCancion(1,musica1));
		assertNotNull(lista.agregarCancion(2,musica2));
		assertNotNull(lista.agregarCancion(3,musica3));
		
		//Reproducir lista
		assertFalse(lista.pausar());
		assertTrue(lista.reproducir());
		
		//Listar canciones
		HashMap<Integer, Musica> listaCanciones= new HashMap<Integer, Musica>();
		listaCanciones= lista.getLista();
		assertEquals("Lamento Boliviano",lista.getLista().get(1).getNombre());
		
		//Cantidad de canciones
		assertEquals(3, lista.getCantidadDeCanciones(),0.1);
		
		//Duracion de la lista
		assertEquals(11.30, lista.getDuracion(),0.1);
		
		//Eliminar cancion
		assertTrue(lista.eliminarCancionPorNumero(1));
		assertEquals(2, lista.getCantidadDeCanciones(),0.1);
		
		//Ordenar por Nombre de cancion
		Musica musica4= new Musica ("Arranca corazones", 0,0);
		Musica musica5= new Musica ("You give love a bad name", 0,0);
		lista.agregarCancion(4, musica4);
		lista.agregarCancion(5, musica5);
		lista.agregarCancion(1, musica1);
		
		List<Musica> ordenado = new ArrayList<>();
		ordenado=lista.ordenarMusicaPorNombre();  //Buscado en el Comparable o Comparator
		assertEquals("Arranca corazones",ordenado.get(0).getNombre()); //Mira si el primer tema es A
		assertEquals("You give love a bad name",ordenado.get(4).getNombre()); //Mira si el ultimo tema es Z
			for (int i = 0; i < ordenado.size(); i++) {
				System.out.println(ordenado.get(i).getNombre());
			}
			
		//Que me de una excepcion al agregar cancion con misma clave (Con Try y catch)
		Musica musica6= new Musica ("La balada del diablo y la muerte",5,0);
		try { //Intentara agregarla a la lista
			lista.agregarCancion(2, musica6);	
		}catch (claveDuplicadaException e) { //De no poder hacerlo agarrara el error y lo guarda aqui
			System.out.println(e.getMessage());//Mensaje puesto en la clase que creé de excepcion
		}
	}
}
