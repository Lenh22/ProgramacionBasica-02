package HashSet;

import java.util.Comparator;

public class OrdenPorAnioPatente implements Comparator<Auto>{

	@Override
	public int compare(Auto o1, Auto o2) {
		if(o1.getAnio().compareTo(o2.getAnio())!=0) {
			return o1.getAnio().compareTo(o2.getAnio());
		} 
			
		
		return o1.getPatente().compareTo(o2.getPatente()) ;
	}

}
