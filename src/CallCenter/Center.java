package CallCenter;

public class Center {

	private String nombre;
	private Contacto[] contactos;

	public Center(String nombre) {
		this.nombre=nombre;
		this.contactos= new Contacto[100];
	}
	
	public Boolean agregarContacto(Contacto contacto) {
		for (int i = 0; i < contactos.length; i++) {
			if(contactos[i]==null) {
				contactos[i]=contacto;
				return true;
			}	
		}
		return false;
	}

	public Boolean buscarAlCandidato(Contacto contacto) {
		for (int i = 0; i < contactos.length; i++) {
			if (this.contactos[i].equals(contacto)) {
				return true;
			}
		}
		return false;
	}
	
	public Boolean realizarLlamada(Contacto contacto) {
		if(buscarAlCandidato(contacto)) {
			if(contacto.getEsCliente().equals(false)&&contacto.getLlamado().equals(true)) {
				return true;
			}
		}
		return false;
	}
	
	public Boolean hacerCliente(Contacto contacto) {
		if(realizarLlamada(contacto)) {
			contacto.setEsCliente("si");
			return true;
		}
		return false;
	}

}
