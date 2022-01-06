package Banco;

public class CajaCorriente extends Cuenta {
	
	private Double descubierto=150.0;
	private Double dineroAdeudado;

	public CajaCorriente(Integer CUIT, Double saldo, TipoCuenta tipo) {
		super(CUIT, saldo);
		setTipo(tipo);
		this.dineroAdeudado=0.0;
		
		
	}

	@Override
	public Double extraer(Double importeAExtraer) {
		Double importeRetirado = 0.0;
		Double diferencia;

		if (importeAExtraer <= super.getSaldo()) {
			importeRetirado = super.extraer(importeAExtraer);
		}
		else if (importeAExtraer <= (super.getSaldo() + this.descubierto)) {
			diferencia = importeAExtraer - super.getSaldo();
			this.descubierto -= diferencia;
			this.dineroAdeudado += diferencia + (diferencia * 5) / 100;
			importeRetirado=super.extraer(super.getSaldo());
		}
		return importeRetirado;
	}
	
	@Override
	public  Boolean depositar(Double deposito) {
	if(this.dineroAdeudado==0.0) {
		super.depositar(deposito);
		return true;
	}else {
		if(deposito>=this.dineroAdeudado) {
			depositar(deposito-this.dineroAdeudado);
			this.dineroAdeudado=0.0;
			this.descubierto=150.0;
			return true;
		}else {
			this.dineroAdeudado-=deposito;
		}
	}return false;
	}

	public Double getLimiteAdicional() {
		return descubierto;
	}

	public void setLimiteAdicional(Double limiteAdicional) {
		this.descubierto = limiteAdicional;
	}

	public Double getDeberAlBanco() {
		return dineroAdeudado;
	}

	public void setDeberAlBanco(Double deberAlBanco) {
		this.dineroAdeudado = deberAlBanco;
	}

}
