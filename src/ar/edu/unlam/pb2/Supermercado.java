package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Supermercado {
	//LEANDRO ACORDARTE AGREGAR EN VENTA UN LIST

	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el número de venta)
	Integer contadorDeVentas = 0; // Identificador del número de venta

	public Supermercado(String nombre) {
		this.nombre = nombre;
		productosDisponibles = new ArrayList<Producto>();
		productosExistentes = new HashSet<Producto>();
		ventasRealizadas = new HashMap<Integer, Venta>();
	}

	public void ingresarProducto(Producto nuevo) {
		if (!productosExistentes.contains(nuevo)) {
			productosExistentes.add(nuevo);
			productosDisponibles.add(nuevo);
		} else {
			productosDisponibles.add(nuevo);
		}
	}

	public Set<Producto> getOfertaDeProductos() {
		return productosExistentes;
	}

	public Integer getStock(Integer codigo) {
		Integer stock = 0;
		for (Producto producto : productosDisponibles) {
			if (producto.getClave().equals(codigo)) {
				stock++;
			}
		}
		return stock;

	}

	private Boolean productoExiste(Integer codigoDeProducto) throws ProductoInexistente {
		for (Producto producto : productosExistentes) {
			if (producto.getClave().equals(codigoDeProducto)) {
				return true;
			}
		}
		throw new ProductoInexistente("Este producto no esta aqui"); // Excepcion
	}

	private Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock {
		for (Producto producto : productosDisponibles) {
			if (producto.getClave().equals(codigoDeProducto)) {
				return producto;
			}

		}
		throw new ProductoSinStock("No esta en stock");
	}


	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}

	public Venta getVenta(Integer nueroDeVenta) {
		if (ventasRealizadas.get(nueroDeVenta) != null) {
			return ventasRealizadas.get(nueroDeVenta);
		}
		return null;

	}

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto)
			throws ProductoSinStock, ProductoInexistente {
		// Incorpora al carrito de compras, de la venta identificada, por el
		// "numeroDeVenta", el producto identificado por el "codigoDeProducto"
		if (productoExiste(codigoDeProducto)) {
			if (getProductoPorCodigo(codigoDeProducto) != null) {
				getVenta(numeroDeVenta).agregarProductoALaVenta(getProductoPorCodigo(codigoDeProducto));
				quitarDeDisponible(codigoDeProducto);
			}
		}
	}

//Agregado
	private void quitarDeDisponible(Integer codigoDeProducto) {
		// Si encuentra la clave quita el producto (Uno menos en Stock)
		for (Producto producto : productosDisponibles) {
			if (producto.getClave().equals(codigoDeProducto)) {
				productosDisponibles.remove(producto);
				break;
			}
		}
	}

	public Set<Comestible> obtenerLosComestibles() {
		Set<Comestible> comida = new HashSet<Comestible>();
		for (Producto producto : productosExistentes) {
			if (producto instanceof Comestible) {
				comida.add((Comestible) producto);
			}
		}
		return comida;
	}

	public List<Producto> obtenerProductosExistentesOrdenadosPorNombre() {
		List<Producto> ordenado = new ArrayList<>();
		ordenado.addAll(productosExistentes);
		Collections.sort(ordenado); // Use Comparable en Productos
		return ordenado;
	}
}
