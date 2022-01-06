package Tarea4NoHomero;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class testNoHomero {
	
	
	@Test
	public void queSeCreeUnBar(){
		Bar bar=new Bar("Moe");
		assertNotNull(bar);
		
	}
	@Test
	public void queSeAgregeUnCliente(){
		Bar bar=new Bar("Moe");
		assertNotNull(bar);
		Cliente cliente=new Cliente("Bart",12);
		assertTrue(bar.agregarCliente(cliente));
	}
	@Test
	public void queNoSePuedanAgregarDosClienteIguales() {
		Bar bar=new Bar("Moe");
		assertNotNull(bar);
		Cliente cliente=new Cliente("Bart",12);
		assertTrue(bar.agregarCliente(cliente));//agrega
		assertEquals(1, bar.cantidadDeClientes(),0.1);
	
		Cliente cliente2=new Cliente("Bart",12);
		assertFalse(bar.agregarCliente(cliente2));
		assertEquals(1, bar.cantidadDeClientes(),0.01);
		
	}
	@Test
	public void queSePuedaBuscar() {
		Bar bar=new Bar("Moe");
		assertNotNull(bar);
		Cliente cliente=new Cliente("Bart",12);
		assertTrue(bar.agregarCliente(cliente));//agrega
		assertEquals(1, bar.cantidadDeClientes(),0.01);//Ver si hay 1
		
		Cliente cliente2=new Cliente("Bart",12);
		assertFalse(bar.agregarCliente(cliente2));
		assertEquals(1, bar.cantidadDeClientes(),0.01);
		
		Cliente cliente3=bar.buscarCliente(cliente);//Agrego al cliente a un nuevo atributo
		assertNotNull(cliente3);//Veo si existe
		
	}
	@Test
	public void queSeAgregenClienteEnFormaOrdenaPorNombre() {
		Bar bar=new Bar("Moe");
		assertNotNull(bar);
		
		Cliente cliente1=new Cliente("Apu",12);		
		Cliente cliente2=new Cliente("Krusty",34);
		Cliente cliente3=new Cliente("Barnie",31);		
		Cliente cliente4=new Cliente("Bart",40);
		Cliente cliente5=new Cliente("Marge",36);
		
		assertTrue(bar.agregarCliente(cliente1));//agrega
		assertTrue(bar.agregarCliente(cliente2));//agrega
		assertTrue(bar.agregarCliente(cliente3));//agrega
		assertTrue(bar.agregarCliente(cliente4));//agrega
		assertTrue(bar.agregarCliente(cliente5));//agrega
		
		assertEquals(bar.obtenerGrupo().first(),cliente1);//Compara el primer cliente
		assertEquals(bar.obtenerGrupo().last(),cliente2);//Compara el ultimo cliente
	
/*		
		Set<Cliente> listaCliente=bar.obtenerGrupo();//Agrego una lista con los clientes obtenidos
		
		List<Cliente> otraListaCliente=new LinkedList<>();//Agrego una lista en blanco
		
		otraListaCliente.addAll(listaCliente);//Ambas listas tienen clientes
		
		//En orden Descendente
		assertEquals("Apu",otraListaCliente.get(0).getNombre());
		assertEquals("Barnie",otraListaCliente.get(1).getNombre());
		assertEquals("Bart",otraListaCliente.get(2).getNombre());
		assertEquals("Marge",otraListaCliente.get(3).getNombre());
		assertEquals("Krusty",otraListaCliente.get(4).getNombre());
		
	*/	

		
	}
	@Test
	public void queSeAgregenClienteEnFormaOrdenaPorEdad() {
		Bar bar=new Bar("Moe");
		assertNotNull(bar);
		
		Cliente cliente1=new Cliente("Apu",18);		
		Cliente cliente2=new Cliente("Krusty",40);
		Cliente cliente3=new Cliente("Barnie",33);		
		Cliente cliente4=new Cliente("Bart",18);
		Cliente cliente5=new Cliente("Marge",40);
		
		assertTrue(bar.agregarCliente(cliente1));//agrega
		assertTrue(bar.agregarCliente(cliente2));//agrega
		assertTrue(bar.agregarCliente(cliente3));//agrega
		assertTrue(bar.agregarCliente(cliente4));//agrega
		assertTrue(bar.agregarCliente(cliente5));//agrega
		
		assertEquals(bar.cantidadDeClientes(),5,0.1);
		assertEquals(bar.obtenerGrupoEdad().first(),cliente1);//Compara el primer cliente
		assertEquals(bar.obtenerGrupoEdad().last(),cliente2);//Compara el ultimo cliente
	
	}
}
