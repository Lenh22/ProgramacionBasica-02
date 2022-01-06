package CarritoCompra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarritoDeCompra {

	List<Producto> carrito;

	public CarritoDeCompra() {
		this.carrito = new ArrayList<Producto>();
	}

	public Boolean agregarProducto(Producto producto) {
		return carrito.add(producto);
	}

	public Boolean sacarProducto(Producto bebida1) {
		return carrito.remove(bebida1);
	}

	public Integer cantidadProductos() {
		return carrito.size();

	}

	public void descuentos() {
		Integer alimento = 0;
		Integer bebida = 0;
		Integer lacteo = 0;
		for (Producto producto : carrito) {
			if (producto.getTipo().equals(TipoProducto.ALIMENTO)) {
				alimento++;
			} else {
				if (producto.getTipo().equals(TipoProducto.BEBIDA)) {
					bebida++;
				} else {
					lacteo++;
				}
			}
		}
		if (alimento >= 3) {
			for (Producto producto : carrito) {
				if (producto.getTipo().equals(TipoProducto.ALIMENTO)) {
					producto.setPrecio(producto.getPrecio() - 10);
				}
			}
		}
		if (bebida >= 3) {
			for (Producto producto : carrito) {
				if (producto.getTipo().equals(TipoProducto.BEBIDA)) {
					producto.setPrecio(producto.getPrecio() - 5);
				}
			}
		}
		if (lacteo >= 3) {
			for (Producto producto : carrito) {
				if (producto.getTipo().equals(TipoProducto.LACTEO)) {
					producto.setPrecio(producto.getPrecio() - 2);
				}
			}
		}

	}

	public Double precioTotal() {
		Double total = 0.0;
		for (Producto producto : carrito) {
			total += producto.getPrecio();
		}
		return total;
	}

	public List<Producto> obtenerProductosOrdenadosPorNombre() {
		List<Producto> ordenado = new ArrayList<>();
		ordenado.addAll(carrito);
//Con COMPARABLE (En Clase Productos se hace el metodo)
		Collections.sort(ordenado);

//Con COMPARATOR (Se crea una nueva clase)
//		Collections.sort(ordenado, new ordenamientoDelProductoPorNombre());
		return ordenado;
	}

	public List<Producto> getCarrito() {
		return carrito;
	}

	public void setCarrito(List<Producto> carrito) {
		this.carrito = carrito;
	}

}
