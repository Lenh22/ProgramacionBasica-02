package MontaCarga;

import java.util.Comparator;

public class OrdenPorPropietario implements Comparator<Carga>{

	@Override
	public int compare(Carga o1, Carga o2) {
//En forma ascendente	
		return o1.getNombre().compareTo(o2.getNombre());
//En forma descendente		
//		if(o1.getNombre().compareTo(o2.getPropietario()==0) {
//			return o1.getId().compareTo(o2.getId())*(-1);
//		}return 0;
	}

}
