package CarritoCompra;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

public class CarritoDeCompraTest {

	@Test
	public void queSeAgregueProductosAlCarrito() {

		Producto bebida1 = new Bebida("Leche", 100.0, 2);
		Producto bebida2 = new Bebida("CocaCola", 110.0, 2);

		Producto alimento1 = new Alimento("Arroz", 100.0, 1.0);
		Producto alimento2 = new Alimento("Papa", 100.0, 1.0);
		Producto alimento3 = new Alimento("Fideos", 100.0, 1.0);

		CarritoDeCompra carrito = new CarritoDeCompra();

		// AgregarProductosTest
		assertTrue(carrito.agregarProducto(bebida1));
		assertTrue(carrito.agregarProducto(alimento1));

		// SacarlosTest
		assertTrue(carrito.sacarProducto(bebida1));
		assertEquals(1, carrito.cantidadProductos(), 0.1);

		// VerCantProductoTest
		carrito.agregarProducto(alimento2);
		carrito.agregarProducto(alimento3);
		assertEquals(3, carrito.cantidadProductos(), 0.1);

		// VerPrecioTotalSinDescuentoTest
		assertEquals(300.0, carrito.precioTotal(), 0.1);

		// SiElDescuentoEsValidoTest
		carrito.descuentos();
		assertEquals(270.0, carrito.precioTotal(), 0.1);

		// OrdenarCarritoDeCompraTest
		assertTrue(carrito.agregarProducto(bebida1));
		assertTrue(carrito.agregarProducto(bebida2));
		List<Producto> ordenado = new ArrayList<>();
		ordenado = carrito.obtenerProductosOrdenadosPorNombre();
		assertEquals("Arroz", carrito.getCarrito().get(0).getNombre());

		for (Producto producto : ordenado) {
			System.out.println(producto.getNombre());
		}

	}

}
