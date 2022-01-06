package Banco;

public class Cliente {

	private String nombre;
	private Integer dni;
	private Cuenta[] cuentas;

	public Cliente(Integer dni, String nombre) {
		this.nombre=nombre;
		this.dni=dni;
		this.cuentas=new Cuenta[3];
	}
	
	
	public Boolean esVIP() {
		Boolean vip=false;
		for (int i = 0; i < cuentas.length; i++) {
			Double total=+cuentas[i].getSaldo();
			if(total>=1000000) {
				vip=true;
			}
			
		}return vip;
	}
	public Boolean buscarSiDebe(CajaCorriente corriente) {
		for (int i = 0; i < cuentas.length; i++) {
			if(cuentas[i].equals(corriente)) {
				if(corriente.getDeberAlBanco()==0.0)
					return true;
			}
		}return false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Cuenta[] getCuentas() {
		return cuentas;
	}

	public void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}
	//hash e equals


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	

}
