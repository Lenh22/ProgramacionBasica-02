package Banco;

public abstract class Cuenta {
	
	private Integer CUIT;
	private Double saldo;
	private TipoCuenta tipo;
	private Cliente cliente;

	public Cuenta(Integer CUIT, Double saldo) {
		this.CUIT=CUIT;
		this.saldo=saldo;	
	}

	public Double extraer(Double importeAExtraer) {
		Double importeRetirado = 0.;
		
		if(importeAExtraer <= this.saldo) {
			this.saldo -= importeAExtraer;
			importeRetirado = importeAExtraer;
		}
		return importeRetirado;
	}
	
	public  Boolean depositar(Double deposito) {
		this.saldo+=deposito;
		return true;
	}
	
	public Boolean agregarcliente(Cliente cliente) {
		Boolean agrego=false;
			if(this.cliente==null) {
				this.cliente=cliente;
				agrego=true;
			}
			return agrego;
	
	}

	public Integer getCUIT() {
		return CUIT;
	}

	public void setCUIT(Integer cUIT) {
		CUIT = cUIT;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public TipoCuenta getTipo() {
		return tipo;
	}

	public void setTipo(TipoCuenta tipo) {
		this.tipo = tipo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}


