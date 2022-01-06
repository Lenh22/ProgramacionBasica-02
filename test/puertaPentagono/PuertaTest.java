package puertaPentagono;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PuertaTest {
	private Puerta puerta;

	@Test
	public void alCrearUnaPuertaEsteCerrada() {
		
		puerta= new Puerta(1234,1234,1234);
		
	assertFalse(puerta.getEstadoDeApertura());
		
	}
	@Test
	public void abrirLaPuerta() {
		
		puerta= new Puerta(1234,1234,1234);
		
		puerta.abrirPuerta(1234, 1234, 1234);
		
		assertTrue(puerta.getEstadoDeApertura());
	}
	@Test
	public void queLaPuertaNoSeAbra() {

		Integer contrase�aIntentada=4321;
		
		puerta= new Puerta(1234,1234,1234);
		
		puerta.abrirPuerta(contrase�aIntentada, contrase�aIntentada, contrase�aIntentada);
		
		assertFalse(puerta.getEstadoDeApertura());
	}
}
