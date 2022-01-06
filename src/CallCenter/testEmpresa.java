package CallCenter;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import EjPersonas.Provincia;

public class testEmpresa {

	@Test
	public void queSePuedaAgregarContacto() {
		Center callCenter= new Center("Oeste Cable Color");
		
		Contacto contacto= new Contacto("nombreYApellido",1137674625, "email", "direccion", 1702, "localidad", Provincias.BUENOSAIRES, "No", "Si" );
		
		Boolean valorObt1=callCenter.agregarContacto(contacto);
		
		assertTrue(valorObt1);
		

	}
	@Test
	public void queSePuedaRealizarLlamado() {
		Center callCenter= new Center("Oeste Cable Color");
																																	//EsCliente-Llamado
		Contacto contacto= new Contacto("nombreYApellido",1137674625, "email", "direccion", 1702, "localidad", Provincias.BUENOSAIRES, "No", "Si" );
		
		callCenter.agregarContacto(contacto);
		
		Boolean valorObt2=callCenter.realizarLlamada(contacto);
		
		assertTrue(valorObt2);
			
	}
	@Test
	public void queSePuedaHacerCliente() {
		Center callCenter= new Center("Oeste Cable Color");
		
		Contacto contacto= new Contacto("nombreYApellido",1137674625, "email", "direccion", 1702, "localidad", Provincias.BUENOSAIRES, "No", "Si" );
		
		callCenter.agregarContacto(contacto);
		
		callCenter.realizarLlamada(contacto);
		
		Boolean valorObt3=callCenter.hacerCliente(contacto);

		
		assertTrue(valorObt3);	
	}
	
	
	
}
