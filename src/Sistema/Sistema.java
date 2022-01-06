package Sistema;

public class Sistema {

	private String nombre;
	private Usuario[] usuarios;
	
	private Double cantUsuarios;
	private Integer cantLogeados;
	private Integer cantBloqueados;
	

	public Sistema(String nombre, Integer cantMaxUsuarios) {
		// TODO Auto-generated constructor stub
		this.cantBloqueados=0;
		this.cantUsuarios=0.0;
		this.cantLogeados=0;
		this.nombre=nombre;
		this.usuarios= new Usuario[cantMaxUsuarios];
	}


	public Boolean ingresarUsuario(Usuario usuario) {
		Boolean ingresado=false;
		// TODO Auto-generated method stub
		for (int i = 0; i < usuarios.length; i++) {
			if(usuarios[i]!=null&&usuarios[i].getNombre().equals(usuario.getNombre())) {
				break;
			}else if(usuarios[i]==null) 
					usuarios[i]=usuario;
					ingresado=true;
					this.cantUsuarios++;
			break;
		}return ingresado;	
	}
//	public Boolean noRepetir(Usuario usuario) {
//		Boolean noRepetido=false;
//		for (int i = 0; i < usuarios.length; i++) {
//			if(usuarios[i]!=null&&!usuarios[i].getNombre().equals(usuario.getNombre())) {
//				noRepetido=true;
//			}else {
//				usuarios[i]=null;
//				cantUsuarios--;
//				noRepetido=false;
//			}
//		}
//		return noRepetido;
//	}


	public Boolean loguearUsuario(String nombre, String contrasena) {
		Boolean logueo=false;
		for (int i = 0; i < usuarios.length; i++) {
			if(usuarios[i]!=null)
			if(usuarios[i].getNombre().equals(nombre))
				if(usuarios[i].getContraseña().equals(contrasena)) {
					this.cantLogeados++;
					logueo=true;
					break;
				}
			}return logueo;
		}
	public Boolean bloquearUsuario(String nombre) {
	
		for (int i = 0; i < usuarios.length; i++) {
			if(usuarios[i]!=null) {
			if(usuarios[i].getNombre().equals(nombre))
				this.cantBloqueados++;
			return true;
			}
		}return false;
	}


	public Integer calcularLaCantidadDeUsuariosLogueados() {
		return this.cantLogeados;
	}


	public Integer calcularLaCantidadDeUsuariosBloqueados() {
		// TODO Auto-generated method stub
		return this.cantBloqueados;
	}


	public Double calcularElPorcentajeDeUsuariosLogueados() {
		Double porcentaje=0.0;
		porcentaje=cantUsuarios/cantLogeados;
		return porcentaje;
	}


	public Double calcularEdadPromedio() {
		// TODO Auto-generated method stub
		Integer edadTotal=0;
		Double edadPromedio=0.0;
		for (int i = 0; i < usuarios.length; i++) {
			if(usuarios[i]!=null)
				edadTotal+=usuarios[i].getEdad();
			edadPromedio=edadTotal/cantUsuarios;
		}

		return edadPromedio;
	}


	public Double getCantUsuarios() {
		return cantUsuarios;
	}


	public void setCantUsuarios(Double cantUsuarios) {
		this.cantUsuarios = cantUsuarios;
	}


	public Integer getCantLogeados() {
		return cantLogeados;
	}


	public void setCantLogeados(Integer cantLogeados) {
		this.cantLogeados = cantLogeados;
	}


	public Integer getCantBloqueados() {
		return cantBloqueados;
	}


	public void setCantBloqueados(Integer cantBloqueados) {
		this.cantBloqueados = cantBloqueados;
	}
	
	
	

}
