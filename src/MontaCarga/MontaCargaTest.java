package MontaCarga;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.Test;

public class MontaCargaTest {
	
	@Test
	public void queSeCreeCarga() {
		Carga carga= new Carga(1,"Len",10.0);
		
		assertNotNull(carga);
	}
	@Test
	public void queSeCreeMontaCarga() {
		MontaCarga mt= new MontaCarga(100.0);
		
		assertNotNull(mt);
	}
	
	@Test
	public void queSePuedaAgregarAlMontaCarga() {
		Carga carga= new Carga(1,"Len",10.0);
		MontaCarga mt= new MontaCarga(100.0);
		assertTrue( mt.agregarCarga(carga));
	}
	@Test
	public void queSeNoPuedaAgregar2CargasIguales() {
		Carga carga= new Carga(1,"Len",10.0);
		Carga carga1= new Carga(1,"Len",10.0);
		MontaCarga mt= new MontaCarga(100.0);
		mt.agregarCarga(carga);
		mt.agregarCarga(carga1);
		assertEquals(1,mt.cantidadDeCargas(),0.1);
	}
	
	@Test
	public void queMuestrePesoCargado() {
		Carga carga= new Carga(1,"Len",10.0);
		Carga carga2= new Carga(2,"K",10.0);
		Carga carga3= new Carga(3,"U",10.0);
		
		MontaCarga mt= new MontaCarga(100.0);
		mt.agregarCarga(carga2);
		mt.agregarCarga(carga3);
		mt.agregarCarga(carga);
		
		assertEquals(30, mt.obtenerPesoCargado(),0.1);
	}
	@Test
	public void queNoDejeCargarDspDelPesoMax() {
		Carga carga= new Carga(1,"Len",90.0);
		Carga carga1= new Carga(2,"Len",20.0);
		MontaCarga mt= new MontaCarga(100.0);
		mt.agregarCarga(carga);
		assertFalse(mt.agregarCarga(carga1));
	}
	@Test
	public void muestreInfoCarga() {
		Carga carga1= new Carga(1,"Len",10.0);
		Carga carga2= new Carga(2,"K",20.0);
		Carga carga3= new Carga(3,"U",30.0);
		
		MontaCarga mt= new MontaCarga(100.0);
		mt.agregarCarga(carga1);
		mt.agregarCarga(carga2);
		mt.agregarCarga(carga3);
		
		Set<Carga> todasLasCargas= mt.getCargas();
		
		for (Carga carga4 : todasLasCargas) {
			System.out.println(carga4.toString());
		}
	}

}
