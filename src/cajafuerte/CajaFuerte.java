package cajafuerte;

public class CajaFuerte {
	private Boolean estadoDeApertura;
	private Integer codigoApertura;

	public CajaFuerte() {
		estadoDeApertura=Boolean.TRUE;
	}
	public boolean estaAbierta() {
		return estadoDeApertura;
	}

	public void cerrar(Integer codigoApertura) {
		estadoDeApertura=Boolean.FALSE;
		this.codigoApertura=codigoApertura;
		
	}
	public void abrir(Integer codigoApertura) {
		if(this.codigoApertura==codigoApertura) {
			estadoDeApertura=Boolean.TRUE;
		}
	}

}
