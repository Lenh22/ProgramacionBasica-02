//Crear usando TDD, la clase Usuario, que contenga una password como atributo, 
//y para poder asignarle la password al usuario, hay que determinar si la password fuerte.
//
//Condiciones para que una password sea fuerte:
//
//	1.Tenga mas de 8 caracteres de longitud
//	2. Tenga al menos 1 caracter en mayúscula
//	3. Tenga al menos 1 caracter en minuscula

package Tarea1Usuario;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import cajafuerte.CajaFuerte;

	public class UsuarioTests {
	private Usuario usuario;
	
@Test

	public void laContraseñaNoEsFuerte() {
	
	String contraseña= "Basica"; 
	Usuario usuario= new Usuario(contraseña);
	usuario.setPassword("Linkin");
	
	Assert.assertTrue(usuario.esFuerte()==false);
}
@Test
	public void laContraseñaEsFuerte() {
	
	String contraseña= "Basica"; 
	Usuario usuario= new Usuario(contraseña);
	usuario.setPassword("Metallica");
	
	Assert.assertTrue(usuario.esFuerte()==true);
	
}
@Test
public void queNoHayDosContraseñasIguales() {
	Usuario usuario1 = new Usuario("J34kf32fad35");
	Usuario usuario2 = new Usuario("J34kf32fad35");
	assertEquals(usuario1, usuario2);
}

@Test
public void queNoSeaFuerteSiNoCumploLosRequisitos() {
	Usuario usuario1 = new Usuario("1111213141245");
	assertFalse(usuario1.esFuerte());
}

@Test
public void siNoTieneMasDeOchoCaracteresNoEsFuerte() {
	Usuario usuario1 = new Usuario("J34k");
	assertFalse(usuario1.esFuerte());
}
@Test
public void siNoTieneUnaMayusculaNoEsFuerte() {
	Usuario usuario1 = new Usuario("asdfdfsd25352efsd");
	assertFalse(usuario1.esFuerte());
}
@Test
public void siNoTieneUnaMinusculaNoEsFuerte() {
	Usuario usuario1 = new Usuario("ASFF23SEGF32F");
	assertFalse(usuario1.esFuerte());
}

}
