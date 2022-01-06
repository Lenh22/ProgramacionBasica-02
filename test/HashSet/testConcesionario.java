package HashSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class testConcesionario {
	
	@Test
	public void queSePuedaCrearUnConcesionario() {
		Concesionario concesionario=new Concesionario ("Car");
		
		assertNotNull(concesionario);
		
		
	}
	
	@Test
	public void queSePuedaAgregarUnAutoAlConcesionario() {
		Concesionario concesionario=new Concesionario ("Car");
		assertNotNull(concesionario);
		//Creo el coche y agrego
		Auto auto=new Auto("abc123","Renaut","Clio",2021);
		
		assertTrue(concesionario.agregarAuto(auto));
	}
	@Test
	public void queNoSePuedaAgregarDosAutoIgualesAlConcesionario() {
		Concesionario concesionario=new Concesionario ("Car");
		assertNotNull(concesionario);
		Auto auto=new Auto("abc123","Renaut","Clio",2021);
		assertTrue(concesionario.agregarAuto(auto));
		//Para obtener cant de autos
		assertEquals(1, concesionario.obtenerCantidadAutos(),0.01);
		//Agrego segundo auto y comparo
		Auto auto2=new Auto("abc123","Renaut","Clio",2021);
		
		assertFalse(concesionario.agregarAuto(auto2));
		
		assertEquals(1, concesionario.obtenerCantidadAutos(),0.01);
	}
	@Test
	public void queSePuedaBuscar() {
		Concesionario concesionario=new Concesionario ("Car");
		assertNotNull(concesionario);
		//Creo el coche y agrego
		Auto auto=new Auto("abc123","Renaut","Clio",2021);
		assertTrue(concesionario.agregarAuto(auto));
		//Para obtener cant de autos
		assertEquals(1, concesionario.obtenerCantidadAutos(),0.01);
		//Agrego segundo auto y comparo
		Auto auto2=new Auto("abc123","Renaut","Clio",2021);
		assertFalse(concesionario.agregarAuto(auto2));
		assertEquals(1, concesionario.obtenerCantidadAutos(),0.01);
		//Buscar coche
		Auto auto3= concesionario.buscarAuto(auto2);
		
		assertNotNull(auto3);
		
	}
	@Test
	public void queSePuedaAgregarVariosAutosAlConcesionarioEnOrden() {
		Concesionario concesionario=new Concesionario ("Car");
		assertNotNull(concesionario);
		//Creo el coche y agrego
		Auto auto=new Auto("abc125","Renaut","Clio",2021);
		Auto auto2=new Auto("abc123","Renaut","Clio",2021);
		Auto auto3=new Auto("abc124","Renaut","Clio",2021);

		assertTrue(concesionario.agregarAuto(auto));
		assertTrue(concesionario.agregarAuto(auto2));
		assertTrue(concesionario.agregarAuto(auto3));
		
		Set <Auto> listaAutos=concesionario.obtenerFlora();
		//Manera 1
		List<Auto> otraListaAuto=new LinkedList<>();
		
		otraListaAuto.addAll(listaAutos);
		
		otraListaAuto.get(0).getPatente();
		otraListaAuto.get(1).getPatente();
		otraListaAuto.get(2).getPatente();
		
		//O esta manera 2
		int i=0;
		for (Auto auto4 : listaAutos) {
			switch (i) {
			case 0:
				assertEquals("abc125",auto.getPatente());
				break;
			case 1:
				assertEquals("abc124",auto.getPatente());
				break;
			case 2:
				assertEquals("abc123",auto.getPatente());
				break;
			default:
				break;
			}
		}
	}
	public void queSeMeDeElAutoEnElOrdenQueYoQuiera() {
		Concesionario concesionario=new Concesionario ("Car");
		assertNotNull(concesionario);
		//Creo el coche y agrego
		Auto auto=new Auto("abc125","Renaut","Clio",2021);
		Auto auto2=new Auto("abc123","Renaut","Clio",2021);
		Auto auto3=new Auto("abc124","Renaut","Clio",2021);

		assertTrue(concesionario.agregarAuto(auto));
		assertTrue(concesionario.agregarAuto(auto2));
		assertTrue(concesionario.agregarAuto(auto3));
		
		Comparator o=new OrdenPorAnioPatente();
		TreeSet<Auto> tso=concesionario.obtenerAutosPorOrdenEspecifico(null);
		
	}
	

}
