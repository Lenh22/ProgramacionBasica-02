package Tarea2Cuenta;

public class CuentaCorriente extends Cuenta{
	private Double descubierto;

	public CuentaCorriente(String nombre, Double salarioInicial, Double descubierto) {
		super(nombre, salarioInicial);
		this.descubierto=descubierto;
	}
	
	@Override
	public Double extraer(Double extraccion) {
		if(this.salarioInicial>extraccion) {
			this.salarioInicial =- extraccion;
			}else {
				if(this.salarioInicial<extraccion && this.salarioInicial+descubierto > extraccion) {
					this.salarioInicial=-extraccion+ (salarioInicial*0.05);
				}
			}
		return this.salarioInicial;
	}

}
