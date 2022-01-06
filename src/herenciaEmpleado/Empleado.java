//Se desea desarrollar un software para la gestión de los empleados de una empresa. Para cada empleado se desea conocer el nombre, apellido, salario y fecha de nacimiento.
//Como la empresa está organizada en forma de departamentos, también se debe conocer el gerente encargado de cada uno de ellos. Adicionalmente, los gerentes cuentan con la posibilidad de tener una cochera en donde estacionar sus vehículos.
//También se cuenta con un manejo especial para aquellos empleados de tipo “Ingenieros”, dado que su salario base se ve afectado por un concepto adicional denominado “para la productividad”.
//Por último, se encuentran los directores quienes además de tener su cochera, poseen un “sueldo extra” producto de tener la responsabilidad de ser directivo de la empresa.

package herenciaEmpleado;

public class Empleado {

	
	protected String nombre;
	protected String apellido;
	protected Double salario;
	protected String fechaNac;
	protected Gerente gerente;
	
	
	public Empleado(String nombre, String apellido, Double salario, String fechaNac, Gerente gerente) {
		this.apellido=apellido;
		this.nombre=nombre;
		this.salario=salario;
		this.fechaNac=fechaNac;
		this.gerente=gerente;
	}
	
	public Double obtenerSalario() {
		return this.salario;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}


	public String getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

}
