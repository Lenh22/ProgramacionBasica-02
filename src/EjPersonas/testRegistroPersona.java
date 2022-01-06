package EjPersonas;

import EjPersonas.Provincia;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class testRegistroPersona {
	
	@Test
	public void queSeAgreguePersona () {
		
		Ciudad lugar=new Ciudad(1708, "Moron", 	Provincia.BUENOSAIRES );
		Direccion casa= new Direccion("Peron", 1234, lugar);
		Persona hijo= new Persona("koki","argento", casa );
		Persona hija= new Persona("paola","argento", casa );
		Persona papa= new Persona("pepe","argento", casa );
		Persona mama= new Persona("moni","argento", casa );
		
		
		RegistroPersona registro= new RegistroPersona(123);
		
		Boolean valor1=registro.registrarPersona(hijo);
		Boolean valor2=registro.registrarPersona(hija);
		Boolean valor3=registro.registrarPersona(papa);
		Boolean valor4=registro.registrarPersona(mama);
		
		assertTrue(valor1);
		assertTrue(valor2);
		assertTrue(valor3);
		assertTrue(valor4);
		
	} 
	
	@Test
	public void queSePuedaTenerListadoDePersonasEnUnaProvincia() {
		
		Ciudad bsas=new Ciudad(1708, "Moron", 	Provincia.BUENOSAIRES );
		Ciudad cordoba=new Ciudad(1234, "Matanza", 	Provincia.CORDOBA );
		Ciudad lapampa=new Ciudad(5678, "Guernica", 	Provincia.LAPAMPA );
		Ciudad santafe=new Ciudad(9011, "Korn", 	Provincia.SANTAFE );
		
		Direccion direccion1= new Direccion("Alberto", 0303, bsas);
		Direccion direccion2= new Direccion("Delcaño", 456, bsas);
		Direccion direccion3= new Direccion("Macri", 911, bsas);
		
		Direccion direccion4= new Direccion("Aguero", 1234, cordoba);
		Direccion direccion5= new Direccion("Messirve", 1234, lapampa);
		Direccion direccion6= new Direccion("Tevez", 1234, santafe);
		
		Persona hijo1= new Persona("yo","soy", direccion1 );
		Persona hijo2= new Persona("tu","eres", direccion1 );
		Persona hijo3= new Persona("el","es", direccion1 );
		
		Persona hija1= new Persona("vosotros","sereis", direccion2 );
		Persona hija2= new Persona("nosotros","somos", direccion2 );
		Persona hija3= new Persona("ellos","son", direccion2 );
		
		Persona papa= new Persona("pepe","argento", direccion3 );
		Persona mama= new Persona("moni","argento", direccion4 );
		
		
		RegistroPersona registro= new RegistroPersona(123);
		
		registro.registrarPersona(hijo1);
		registro.registrarPersona(hijo2);
		registro.registrarPersona(hijo3);
		registro.registrarPersona(hija1);
		registro.registrarPersona(hija2);
		registro.registrarPersona(hija3);
		registro.registrarPersona(papa);
		registro.registrarPersona(mama);
		
		//Aca el test comienza
		Persona personasEnLaProvBsAs[]; 
		
		Provincia NOMBRE_PROVINCIA_ESPERADO=Provincia.BUENOSAIRES;
		
		personasEnLaProvBsAs = registro.obtenerListadoDePersonaDeUnaProvincia(Provincia.BUENOSAIRES);
		
		assertEquals(NOMBRE_PROVINCIA_ESPERADO, personasEnLaProvBsAs[1].getDireccion().getCiudad().getProvincia());
	}
	
	

}
