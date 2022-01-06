package CallCenter;

public class Contacto {

	
	private String nombreApellido;
	private Integer numero;
	private String email;
	private String direccion;
	private Integer cp;
	private String localidad;
	private Provincias provincia;
	private String esCliente;
	private String llamado;

	public Contacto(String nombreApellido, Integer numero, String email, String direccion, Integer cp, String localidad, Provincias provincia,
			String esCliente, String llamado) {
		this.nombreApellido=nombreApellido;
		this.numero=numero;
		this.email=email;
		this.direccion=direccion;
		this.cp=cp;
		this.localidad=localidad;
		this.provincia=provincia;
		this.esCliente=esCliente;
		this.llamado=llamado;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getCp() {
		return cp;
	}

	public void setCp(Integer cp) {
		this.cp = cp;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Provincias getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincias provincia) {
		this.provincia = provincia;
	}

	public Boolean getEsCliente() {
		if(this.esCliente.equals("Si")) {
		return true;}
		return false;
	}

	public void setEsCliente(String esCliente) {
		this.esCliente = esCliente;
	}

	public Boolean getLlamado() {
		if(this.llamado.equals("Si")) {
		return true;}
		return false;
	
	}

	public void setLlamado(String llamado) {
		this.llamado = llamado;
	}

	
}
