package CarritoCompra;

import java.util.Comparator;

public class ordenamientoDelProductoPorNombre implements Comparator<Producto> {

	@Override
	public int compare(Producto o1, Producto o2) {
//		if(o1.getNombre().equals(o2.getNombre())) {
//			return 0;
//		}
		return Integer.valueOf(o1.getNombre().compareTo(o2.getNombre()));
	}

}
