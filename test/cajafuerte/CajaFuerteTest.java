package cajafuerte;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CajaFuerteTest {
	private CajaFuerte caja;
	
	@Test
	public void alCrearUnaCajaFuerteEstaAbierta() {
		
		whenCreoUnaCajaFuerte();
		
		thenLaCajaFuerteEstaAbierta();
	}
	private void whenCreoUnaCajaFuerte() {
		caja=new CajaFuerte();
		
	}
	private void thenLaCajaFuerteEstaAbierta() {
		Assert.assertTrue(caja.estaAbierta()==true);
	}
	
	@Test
	public void alCerrarDeberiaEstarCerrada() {
	
		givenExisteUnaCajaFuerte();
		
		whenCierroLaCajaFuerte(caja);
		
		thenLaCajaFuerteEstaCerrada(caja);
	}
	private void thenLaCajaFuerteEstaCerrada(CajaFuerte caja) {
		Assert.assertTrue(caja.estaAbierta()==false);
		
	}
	private void whenCierroLaCajaFuerte(CajaFuerte caja) {
		caja.cerrar(null);
		
	}
	private CajaFuerte givenExisteUnaCajaFuerte() {
		return caja= new CajaFuerte();
		
	}
	
	@Test
	
	public void alAbrirLaCajaFuerteConElCodigoDeCierreDeberiaEstarAbiera() {
		
		Integer codigoApertura =123;
		//CajaFuerte caja= givenExisteUnaCajaFuerte();
		CajaFuerte caja= new CajaFuerte();
		//givenCierroLaCajaFuerte(caja; codigoApertura);
		caja.cerrar(codigoApertura);
		//whenAbroLaCajaFuerteConCodigo(codigoApertura);
		caja.abrir(codigoApertura);
		//thenLaCajaFuerteEstaAbierta(caja);
		Assert.assertTrue(caja.estaAbierta()==true);
	
	
	}

}
