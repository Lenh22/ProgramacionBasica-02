package Tarea4NoHomero;

import java.util.Comparator;

public class OrdenPorEdadComparator implements Comparator<Cliente> {

	@Override
	public int compare(Cliente o1, Cliente o2) {
		
		return (o1.getEdad().compareTo(o2.getEdad()));
	}
	

}
