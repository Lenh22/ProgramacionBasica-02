//Crear usando TDD, la clase Usuario, que contenga una password como atributo, 
//y para poder asignarle la password al usuario, hay que determinar si la password fuerte.
//

//Condiciones para que una password sea fuerte:
//
//Tenga mas de 8 caracteres de longitud
//	2. Tenga al menos 1 caracter en mayúscula
//	3. Tenga al menos 1 caracter en minuscula

package Tarea1Usuario;

public class Usuario {

	private String password; 
	private Boolean esFuerte = false;
	
	private static final Integer LONGITUD_MINIMA = 8;
	
	public Usuario(String password) {
		this.password = password;
	}
	
	public Boolean esFuerte() {
		Integer minuscula = 0;
		Integer mayuscula = 0;
		
		if(password.length() >= 8) {
		for (int i = 0; i < password.length(); i++) {
			if(password.charAt(i) >= 65 && password.charAt(i) <= 90) {
				mayuscula++;
			}else if(password.charAt(i) >= 97 && password.charAt(i) <= 122) {
				minuscula++;
			}
		}
		}
		
		if(minuscula >= 1 && mayuscula >= 1) {
			this.esFuerte = true;
		}
		
		return esFuerte;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		Usuario other = (Usuario) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	
	
	
	
	
}
