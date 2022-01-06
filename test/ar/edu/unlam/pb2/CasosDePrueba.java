package ar.edu.unlam.pb2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.Test;

public class CasosDePrueba {

	@Test
	public void queSePuedaInstanciarUnComestible() {
		Comestible producto = new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0);
		
		assertEquals("Cerealitas", ((Galletitas)producto).getDescripcion());
		assertEquals("22/06/2021", producto.getFechaDeElaboracion());
		assertEquals("31/01/2022", producto.getFechaDeVencimiento());
		assertEquals("Arcor", ((Galletitas)producto).getMarca());
	}
	
	@Test
	public void queSePuedaInstanciarOtroComestible() {
		Comestible producto = new Carne(2, "Tapa de nalga", "07/07/2021", "15/07/2021", 2.0, "La Estancia", 600.0);
		
		assertEquals("Tapa de nalga", ((Carne)producto).getDescripcion());
		assertEquals("07/07/2021", producto.getFechaDeElaboracion());
		assertEquals("15/07/2021", producto.getFechaDeVencimiento());
		assertEquals(2.0, ((Carne)producto).getKilos(), 0.1);
	}
	
	@Test
	public void queSePuedaInstanciarUnElectrodomestico() {
		Electrodomestico producto = new Televisor(3, "Serie Dorada", 42, 12, "Samsung", 200000.0);
		
		assertEquals("Serie Dorada", ((Televisor)producto).getDescripcion());
		assertEquals((Integer)42, ((Televisor)producto).getPulgadas());
		assertEquals((Integer)12, producto.getGarantia());
		assertEquals("Samsung", ((Televisor)producto).getMarca());
	}
	
	@Test
	public void queSePuedaInstanciarOtroElectrodomestico() {
		Electrodomestico producto = new Heladera(4, "Nuevo Modelo", true, 12, "Samsung", 150000.0);
		
		assertEquals("Nuevo Modelo", ((Heladera)producto).getDescripcion());
		assertEquals(true, ((Heladera)producto).isNoFrost());
		assertEquals((Integer)12, producto.getGarantia());
		assertEquals("Samsung", ((Heladera)producto).getMarca());
	}
	
	@Test
	public void queSePuedaInstanciarUnaIndumentaria() {
		Indumentaria producto = new Remera(5, "Básica", "XL", "Lacoste", "Azul", 2000.0);
		
		assertEquals("Básica", ((Remera)producto).getDescripcion());
		assertEquals("XL", producto.getTalle());
		assertEquals("Lacoste", ((Remera)producto).getMarca());
	}
	
	@Test
	public void queSePuedaInstanciarOtraIndumentaria() {
		Indumentaria producto = new Zapatilla(6, "De running", 42, "Nike", "Blancas", 5000.0);
//En el constructor de Zapatilla pase el parametro "Talle" como Integer y lo hice .toString 
//ya que no se podia tocar el test
		assertEquals("De running", ((Zapatilla)producto).getDescripcion());
		assertEquals("42", producto.getTalle());
		assertEquals("Blancas", producto.getColor());
		assertEquals("Nike", ((Zapatilla)producto).getMarca());
	}
	
	@Test
	public void queSePuedaStockear() {
		Supermercado vital = new Supermercado("Vital");
		
		vital.ingresarProducto(new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0));
		vital.ingresarProducto(new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0));
		vital.ingresarProducto(new Carne(2, "Tapa de nalga", "07/07/2021", "15/07/2021", 2.0, "La Estancia", 600.0));
		vital.ingresarProducto(new Televisor(3, "Serie Dorada", 42, 12, "Samsung", 200000.0));
		vital.ingresarProducto(new Heladera(4, "Nuevo Modelo", true, 12, "Samsung", 150000.0));
		vital.ingresarProducto(new Remera(5, "Básica", "XL", "Lacoste", "Azul", 2000.0));
		vital.ingresarProducto(new Zapatilla(6, "De running", 42, "Nike", "Blancas", 5000.0));
		vital.ingresarProducto(new Zapatilla(7, "Diarias", 45, "Topper", "Blancas", 2500.0));
		vital.ingresarProducto(new Televisor(8, "3D", 75, 12, "LG", 500000.0));
		vital.ingresarProducto(new Remera(9, "Básica", "L", "Lacoste", "Azul", 2000.0));
		vital.ingresarProducto(new Remera(9, "Básica", "M", "Lacoste", "Roja", 2000.0));
		vital.ingresarProducto(new Remera(9, "Básica", "S", "Lacoste", "Roja", 2000.0));
		vital.ingresarProducto(new Galletitas(10, "Oreo", "05/05/2021", "30/03/2022", "Arcor", 150.0));
		
		assertEquals(10, vital.getOfertaDeProductos().size());
		assertEquals((Integer)2, vital.getStock(1));
		assertEquals((Integer)1, vital.getStock(2));
		assertEquals((Integer)3, vital.getStock(9));
	}
	
	@Test
	public void queSePuedaGenerarUnaVenta() {
		
		final Integer PRODUCTO_A_COMPRAR_1 = 1;
		final Integer PRODUCTO_A_COMPRAR_2 = 2;
		
		Supermercado vital = new Supermercado("Vital");
		
		vital.ingresarProducto(new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0));
		vital.ingresarProducto(new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0));
		vital.ingresarProducto(new Carne(2, "Tapa de nalga", "07/07/2021", "15/07/2021", 2.0, "La Estancia", 600.0));
		vital.ingresarProducto(new Televisor(3, "Serie Dorada", 42, 12, "Samsung", 200000.0));
		vital.ingresarProducto(new Heladera(4, "Nuevo Modelo", true, 12, "Samsung", 150000.0));
		vital.ingresarProducto(new Remera(5, "Básica", "XL", "Lacoste", "Azul", 2000.0));
		vital.ingresarProducto(new Zapatilla(6, "De running", 42, "Nike", "Blancas", 5000.0));
		vital.ingresarProducto(new Zapatilla(7, "Diarias", 45, "Topper", "Blancas", 2500.0));
		vital.ingresarProducto(new Televisor(8, "3D", 75, 12, "LG", 500000.0));
		vital.ingresarProducto(new Remera(9, "Básica", "L", "Lacoste", "Azul", 2000.0));
		vital.ingresarProducto(new Remera(9, "Básica", "M", "Lacoste", "Roja", 2000.0));
		vital.ingresarProducto(new Remera(9, "Básica", "S", "Lacoste", "Roja", 2000.0));
		vital.ingresarProducto(new Galletitas(10, "Oreo", "05/05/2021", "30/03/2022", "Arcor", 150.0));
		
		Integer numeroDeVenta = vital.registrarNuevaVenta(28923812, "Camila Ganzo");
		
		try {
			vital.agregarAlCarrito(numeroDeVenta, PRODUCTO_A_COMPRAR_1);
			vital.agregarAlCarrito(numeroDeVenta, PRODUCTO_A_COMPRAR_2);
		} catch (ProductoSinStock e) {
			e.printStackTrace();
		} catch (ProductoInexistente e) {
			e.printStackTrace();
		}

		
		
		assertEquals((Integer)720, vital.getVenta(numeroDeVenta).getImporte(), 0.01);
	}
	
	@Test (expected = ProductoInexistente.class)
	public void queNoSePuedaVenderUnProductoInexistente() throws ProductoSinStock, ProductoInexistente {
		Supermercado vital = new Supermercado("Vital");
		
		vital.ingresarProducto(new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0));
		vital.ingresarProducto(new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0));
		vital.ingresarProducto(new Carne(2, "Tapa de nalga", "07/07/2021", "15/07/2021", 2.0, "La Estancia", 600.0));
		vital.ingresarProducto(new Televisor(3, "Serie Dorada", 42, 12, "Samsung", 200000.0));
		vital.ingresarProducto(new Heladera(4, "Nuevo Modelo", true, 12, "Samsung", 150000.0));
		vital.ingresarProducto(new Remera(5, "Básica", "XL", "Lacoste", "Azul", 2000.0));
		vital.ingresarProducto(new Zapatilla(6, "De running", 42, "Nike", "Blancas", 5000.0));
		vital.ingresarProducto(new Zapatilla(7, "Diarias", 45, "Topper", "Blancas", 2500.0));
		vital.ingresarProducto(new Televisor(8, "3D", 75, 12, "LG", 500000.0));
		vital.ingresarProducto(new Remera(9, "Básica", "L", "Lacoste", "Azul", 2000.0));
		vital.ingresarProducto(new Remera(9, "Básica", "M", "Lacoste", "Roja", 2000.0));
		vital.ingresarProducto(new Remera(9, "Básica", "S", "Lacoste", "Roja", 2000.0));
		vital.ingresarProducto(new Galletitas(10, "Oreo", "05/05/2021", "30/03/2022", "Arcor", 150.0));
		
		Integer numeroDeVenta = vital.registrarNuevaVenta(28923812, "Camila Ganzo");
		
		vital.agregarAlCarrito(numeroDeVenta, 1);
		vital.agregarAlCarrito(numeroDeVenta, 11);
		
	}

	@Test (expected = ProductoSinStock.class)
	public void queNoSePuedaVenderUnProductoSinStock() throws ProductoSinStock, ProductoInexistente {
		Supermercado vital = new Supermercado("Vital");
		
		vital.ingresarProducto(new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0));
		vital.ingresarProducto(new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0));
		vital.ingresarProducto(new Carne(2, "Tapa de nalga", "07/07/2021", "15/07/2021", 2.0, "La Estancia", 600.0));
		vital.ingresarProducto(new Televisor(3, "Serie Dorada", 42, 12, "Samsung", 200000.0));
		vital.ingresarProducto(new Heladera(4, "Nuevo Modelo", true, 12, "Samsung", 150000.0));
		vital.ingresarProducto(new Remera(5, "Básica", "XL", "Lacoste", "Azul", 2000.0));
		vital.ingresarProducto(new Zapatilla(6, "De running", 42, "Nike", "Blancas", 5000.0));
		vital.ingresarProducto(new Zapatilla(7, "Diarias", 45, "Topper", "Blancas", 2500.0));
		vital.ingresarProducto(new Televisor(8, "3D", 75, 12, "LG", 500000.0));
		vital.ingresarProducto(new Remera(9, "Básica", "L", "Lacoste", "Azul", 2000.0));
		vital.ingresarProducto(new Remera(9, "Básica", "M", "Lacoste", "Roja", 2000.0));
		vital.ingresarProducto(new Remera(9, "Básica", "S", "Lacoste", "Roja", 2000.0));
		vital.ingresarProducto(new Galletitas(10, "Oreo", "05/05/2021", "30/03/2022", "Arcor", 150.0));
		
		Integer numeroDeVenta = vital.registrarNuevaVenta(28923812, "Camila Ganzo");
		
		vital.agregarAlCarrito(numeroDeVenta, 1);
		vital.agregarAlCarrito(numeroDeVenta, 1);
		vital.agregarAlCarrito(numeroDeVenta, 1);
		
	}
	@Test 
	public void queSePuedanObtenerLosProductosComestibles() {
		//El que se debia editar
		Supermercado vital = new Supermercado("Vital");
		
		vital.ingresarProducto(new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0));
		vital.ingresarProducto(new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0));
		vital.ingresarProducto(new Carne(2, "Tapa de nalga", "07/07/2021", "15/07/2021", 2.0, "La Estancia", 600.0));
		vital.ingresarProducto(new Televisor(3, "Serie Dorada", 42, 12, "Samsung", 200000.0));
		vital.ingresarProducto(new Heladera(4, "Nuevo Modelo", true, 12, "Samsung", 150000.0));
		vital.ingresarProducto(new Remera(5, "Básica", "XL", "Lacoste", "Azul", 2000.0));
		vital.ingresarProducto(new Zapatilla(6, "De running", 42, "Nike", "Blancas", 5000.0));
		vital.ingresarProducto(new Zapatilla(7, "Diarias", 45, "Topper", "Blancas", 2500.0));
		vital.ingresarProducto(new Televisor(8, "3D", 75, 12, "LG", 500000.0));
		vital.ingresarProducto(new Remera(9, "Básica", "L", "Lacoste", "Azul", 2000.0));
		vital.ingresarProducto(new Remera(9, "Básica", "M", "Lacoste", "Roja", 2000.0));
		vital.ingresarProducto(new Remera(9, "Básica", "S", "Lacoste", "Roja", 2000.0));
		vital.ingresarProducto(new Galletitas(10, "Oreo", "05/05/2021", "30/03/2022", "Arcor", 150.0));
		
		assertNotNull(vital.obtenerLosComestibles());
		Set<Comestible> comida= vital.obtenerLosComestibles();
		
		assertEquals(3,comida.size(),0.1);
		
		for (Comestible comestible : comida) {
	 		assertTrue(comestible instanceof Comestible);
		}
	}
	
	//Test de ordenamiento
	@Test
	public void queSePuedaOrdenarLosProductos() {
		Supermercado vital = new Supermercado("Vital");
		
		vital.ingresarProducto(new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0));
		vital.ingresarProducto(new Carne(2, "Tapa de nalga", "07/07/2021", "15/07/2021", 2.0, "La Estancia", 600.0));
		vital.ingresarProducto(new Televisor(3, "Serie Dorada", 42, 12, "Samsung", 200000.0));
		vital.ingresarProducto(new Heladera(4, "Nuevo Modelo", true, 12, "Samsung", 150000.0));
		vital.ingresarProducto(new Remera(5, "Básica", "XL", "Lacoste", "Azul", 2000.0));
		vital.ingresarProducto(new Zapatilla(6, "De running", 42, "Nike", "Blancas", 5000.0));
		vital.ingresarProducto(new Zapatilla(7, "Diarias", 45, "Topper", "Blancas", 2500.0));
		vital.ingresarProducto(new Televisor(8, "3D", 75, 12, "LG", 500000.0));
		vital.ingresarProducto(new Remera(9, "Básica", "L", "Lacoste", "Azul", 2000.0));
		vital.ingresarProducto(new Galletitas(10, "Oreo", "05/05/2021", "30/03/2022", "Arcor", 150.0));
		vital.ingresarProducto(new Galletitas(12, "Z", "05/05/2021", "30/03/2022", "Ser", 120.0));
		vital.ingresarProducto(new Remera(13, "Alonso", "L", "GAP", "Bordo", 2000.0));
		
		List<Producto> ordenados= new ArrayList<>();
		ordenados = vital.obtenerProductosExistentesOrdenadosPorNombre();
//Este for muestra que estan ordenados	
//		System.out.println("Ordenados por nombre: ");	
//		for (Producto producto : ordenados) {
//			System.out.println(producto.getDescripcion());
//		}
		
		
//Para verificar el test si esta ordenado hice un Equals comparando los primeros parametros y los ultimos
		assertEquals("3D", ordenados.get(0).getDescripcion());//Compara si el primero es 3D
		assertEquals("Diarias",ordenados.get(6).getDescripcion());//Compara si el del medio es Diaria
		assertEquals("Z", ordenados.get(11).getDescripcion());//Compara si el Ultimo es Z
	}

}
