package Tarea2Cuenta;

public class Cuenta {
	protected String nombre;
	protected Double salarioInicial;

	
	public Cuenta(String nombre, Double salarioInicial) {
		this.nombre=nombre;
		this.salarioInicial=salarioInicial;
		
	}
	
	public Double depositar(Double deposito) {
	 this.salarioInicial =+ deposito;
	 return this.salarioInicial;
	}
	
	public Double extraer(Double extraccion) {
		if(this.salarioInicial>extraccion) {
			this.salarioInicial =- extraccion;
			}return this.salarioInicial;
	}

	public Double getSalarioInicial() {
		return salarioInicial;
	}

	public void setSalarioInicial(Double salarioInicial) {
		this.salarioInicial = salarioInicial;
	}

}
