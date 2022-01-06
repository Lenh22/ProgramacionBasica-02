package Banco;

public class CajaSueldo extends Cuenta {

		public CajaSueldo(Integer CUIT, Double saldo, TipoCuenta tipo) {
		super(CUIT, saldo);
		setTipo(tipo);
	}

	@Override
	public Double extraer(Double retirar) {
		if(retirar<=getSaldo()) {
			this.setSaldo(getSaldo()-retirar);
			
		}return retirar;
	}

}
