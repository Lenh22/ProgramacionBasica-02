package GestionEmpresa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class testEmpresa {
	
	@Test
	public void queSeAgregueEmpleados() {
		
		Empresa empresa= new Empresa("Jorgito");
		
		
		Departamento departamento1=new Departamento("Depa1");
		Departamento departamento2=new Departamento("Depa2");
		
		
		
		Empleado empleado1= new Ingeniero ("nombre", "apellido", "FechaNac", 5000.0 , departamento1, 10.0);
		Empleado empleado2= new Gerente ("Pepe", "Argento", "FechaNac", 4000.0 , departamento1, 2);
		Empleado empleado3= new Director ("Moni", "Argento", "FechaNac", 5000.0 , departamento2, 500.0, 2);
		Empleado empleado4= new Ingeniero ("Paola", "Argento", "FechaNac", 6000.0 , departamento2, 10.0);
		
		
		empresa.agregarEmpleado(empleado1);
		empresa.agregarEmpleado(empleado2);
		empresa.agregarEmpleado(empleado3);
		Boolean valorObtenido=empresa.agregarEmpleado(empleado4);
		
		assertTrue(valorObtenido);
	}
	@Test
	public void queSeCalculenLosSueldos() {
		
		Empresa empresa= new Empresa("Jorgito");
		
		Departamento departamento1=new Departamento("Depa1");
		Departamento departamento2=new Departamento("Depa2");
		
		Empleado empleado1= new Ingeniero ("nombre", "apellido", "FechaNac", 5000.0 , departamento1, 10.0);
		Empleado empleado2= new Gerente ("Pepe", "Argento", "FechaNac", 4000.0 , departamento1, 2);
		Empleado empleado3= new Director ("Moni", "Argento", "FechaNac", 5000.0 , departamento2, 500.0, 1);
		Empleado empleado4= new Ingeniero ("Paola", "Argento", "FechaNac", 6000.0 , departamento2, 10.0);
		
		empresa.agregarEmpleado(empleado1);
		empresa.agregarEmpleado(empleado2);
		empresa.agregarEmpleado(empleado3);
		empresa.agregarEmpleado(empleado4);
		
		Double valorObtenido1= empleado1.calcularSueldo();
		Double valorObtenido2= empleado2.calcularSueldo();
		Double valorObtenido3= empleado3.calcularSueldo();
		Double valorObtenido4= empleado4.calcularSueldo();
		
		assertEquals(50000.0, valorObtenido1, 0.1);
		assertEquals(4000.0, valorObtenido2, 0.1);
		assertEquals(5500.0, valorObtenido3, 0.1);
		assertEquals(60000.0, valorObtenido4, 0.1);
		
	}
	
	@Test
	public void queSePuedaAgregarDirectorAlDepa() {
		
		Empresa empresa= new Empresa("Jorgito");
		
		Departamento departamento2=new Departamento("Depa2");

		Empleado empleado3= new Director ("Moni", "Argento", "FechaNac", 5000.0 , departamento2, 500.0, 1);
		Empleado empleado4= new Ingeniero ("Paola", "Argento", "FechaNac", 6000.0 , "Depar2", 10.0);

		empresa.agregarEmpleado(empleado3);
		empresa.agregarEmpleado(empleado4);
		
		Boolean valorObtenido=empleado4.getDepartamento().agregarDirector(empleado3);
		
		assertTrue(valorObtenido);
		
	}
	@Test
	public void queSePuedaDespedirDirectorDelDepa() {
		
		Empresa empresa= new Empresa("Jorgito");
		
		Departamento departamento2=new Departamento("Depa2");
		//agregacioon
		Empleado empleado3= new Director ("Moni", "Argento", "FechaNac", 5000.0 , departamento2, 500.0, 1);
		//composicion
		Empleado empleado4= new Ingeniero ("Paola", "Argento", "FechaNac", 6000.0 , "Depar2", 10.0);

		empresa.agregarEmpleado(empleado3);
		empresa.agregarEmpleado(empleado4);
		
		empleado4.getDepartamento().agregarDirector(empleado3);
		Empleado valorObtenido=empleado4.getDepartamento().despedirDirector(empleado3);
		
		assertNull(valorObtenido);
		
		
	}
	

}
