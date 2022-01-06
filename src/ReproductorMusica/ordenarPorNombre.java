package ReproductorMusica;

import java.util.Comparator;

public class ordenarPorNombre implements Comparator<Musica> {

	@Override
	public int compare(Musica o1, Musica o2) {
		return Integer.valueOf(o1.getNombre().compareTo(o2.getNombre()));
	}

}
