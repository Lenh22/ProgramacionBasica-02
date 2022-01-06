package GestionEmpresa;

import java.util.Date;

public class Empleado {
	
	private String nombre;
	private String apellido;
	private String fechNacimiento;
	private Double salario;
	private Departamento departamento;
	
	private Date fechNac;

	//Agregacion
	public Empleado(String nombre, String apellido, String fechNacimiento, Double salario, Departamento departamento) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.fechNacimiento=fechNacimiento;
		this.salario=salario;
	//	
		this.departamento= departamento;

	}
	//Uso de Date
	public Empleado(String nombre, String apellido, Date fechNac, Double salario, Departamento departamento) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.salario=salario;
		this.departamento= departamento;
	//
		this.fechNac=fechNac;


	}
	
	//Composicion
	public Empleado(String nombre, String apellido, String fechNacimiento, Double salario, String nombreDepa) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.fechNacimiento=fechNacimiento;
		this.salario=salario;
	//	
		departamento=new Departamento(nombreDepa);
	}
	
	
	
	public Double calcularSueldo() {
		return this.salario;
	}
	
	
	//
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

	public String getFechNacimiento() {
		return fechNacimiento;
	}

	public void setFechNacimiento(String fechNacimiento) {
		this.fechNacimiento = fechNacimiento;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}



}
