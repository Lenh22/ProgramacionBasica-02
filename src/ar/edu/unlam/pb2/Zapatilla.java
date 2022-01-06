package ar.edu.unlam.pb2;

public class Zapatilla extends Indumentaria {

	public Zapatilla(Integer clave, String descripcion, Integer talle, String marca, String color, Double precio) {
		super(clave, descripcion, talle.toString(), marca, color, precio);
		//Tuve que pasarlo al "Talle" en toString por el hecho que en el Test un talle esta
		//en String y este talle esta hecho en Integer
	}

}
