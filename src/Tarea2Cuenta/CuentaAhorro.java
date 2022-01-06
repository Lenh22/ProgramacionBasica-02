package Tarea2Cuenta;

public class CuentaAhorro extends Cuenta{
	
	private Integer nroDeExtraccion;
	
	public CuentaAhorro(String nombre, Double salarioInicial) {
		super(nombre, salarioInicial);
		nroDeExtraccion=0;
	}
	
	@Override
	public Double extraer(Double extraccion) {
		if(this.salarioInicial>extraccion &&nroDeExtraccion==5) {
			this.salarioInicial =- (extraccion + 6);
			nroDeExtraccion=0;
			}else {this.salarioInicial=-extraccion;
					nroDeExtraccion++;
					}
		return this.salarioInicial;
	}

}
