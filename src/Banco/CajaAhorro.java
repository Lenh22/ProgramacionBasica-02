package Banco;

public class CajaAhorro extends Cuenta {
	
	private Integer contador=0;

	public CajaAhorro(Integer CUIT, Double saldo, TipoCuenta tipo) {
		super(CUIT, saldo);
		setTipo(tipo);
	}


	@Override
	public Double extraer(Double retirar) {
		Double aRetirar=0.0;
		if(retirar<=getSaldo()) {
			if(contador<=5) {
				this.setSaldo(getSaldo()-retirar);
				this.contador++;
				aRetirar=getSaldo()-retirar;
			}else {
				this.setSaldo(getSaldo()-retirar-6);
				aRetirar=getSaldo()-(retirar+6);
			}
			
		}return retirar;
	}

}
