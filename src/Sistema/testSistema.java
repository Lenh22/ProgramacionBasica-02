package Sistema;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class testSistema {
	
	@Test
	public void queSeAgregueUsuario() {
		Sistema sistema= new Sistema("nombre", 10);
		Usuario usuario= new Usuario("nombre", "contrasena",10);


		//AgregaUsuario
		Boolean valorOBT1=sistema.ingresarUsuario(usuario);
		assertTrue(valorOBT1);
		
		//QueNoHayaCopia
		Usuario usuarioCopia= new Usuario("nombre", "contrasena",22);
		Boolean valorOBT2=sistema.ingresarUsuario(usuarioCopia);
		assertFalse(valorOBT2);
		
		//LoguearUsuario
		Boolean valorOBT3=sistema.loguearUsuario("nombre","contrasena");
		assertTrue(valorOBT3);
		
		//cantLogueado
		Integer valorOBT4=sistema.calcularLaCantidadDeUsuariosLogueados();
		assertEquals(1,valorOBT4,0.1);
		
		//PorcentajeLogueado
		Double valorOBT6=sistema.calcularElPorcentajeDeUsuariosLogueados();
		assertEquals(1.0,valorOBT6,0.1);
		
		//EdadPromedio
		Double valorOBT7=sistema.calcularEdadPromedio();
		assertEquals(10.0,valorOBT7,0.1);
		
		//CantBloqueado
		Usuario usuarioDeBloqueo= new Usuario("P", "contrasena",10);
		assertTrue(sistema.ingresarUsuario(usuarioDeBloqueo));
		assertTrue(sistema.bloquearUsuario("P"));
		Integer valorOBT5=sistema.calcularLaCantidadDeUsuariosBloqueados();
		//assertEquals(1,valorOBT5,0.1);
	}

}
