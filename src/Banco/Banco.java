package Banco;

import java.util.Iterator;

public class Banco {

	private String nombre;
	private Cuenta[] cuentas;
	private Cliente[] clientes;

	public Banco(String nombre) {
		this.nombre = nombre;
		this.cuentas = new Cuenta[100];
		this.clientes = new Cliente[100];
	}

	public Boolean agregarCliente(Cliente cliente1) {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] == null)
				clientes[i] = cliente1;
			return true;
		}
		return false;

	}

	public Boolean agregarCuenta(Cuenta cuenta) {
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i] == null)
				cuentas[i] = cuenta;
			return true;
		}
		return false;
	}

	public Cliente getCliente(Cliente cliente1) {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i].equals(cliente1)) {
				return cliente1;
			}
		}
		return null;
	}

	public Double consultarSaldo(Integer cuit) {
		Double saldoCuenta = 0.0;
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i] != null)
				if (cuentas[i].getCUIT().equals(cuit)) {
					saldoCuenta = cuentas[i].getSaldo();
					break;
				}
		}
		return saldoCuenta;
	}

	public Cuenta[] buscarCuenta(Cliente cliente) {
		Cuenta[] cuentasClientes = new Cuenta[100];
		Integer cantDeCuentasEncontradas = 0;
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i] != null)
				if (cuentas[i].getCliente().equals(cliente)) {
					cuentasClientes[cantDeCuentasEncontradas] = cuentas[i];
					cantDeCuentasEncontradas++;
				}
		}
		return cuentasClientes;
	}

	public Cuenta buscarCuenta(Integer cuit) {
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i] != null)
				if (cuentas[i].getCUIT().equals(cuit)) {
					return cuentas[i];
				}
		}
		return null;
	}

	public void trasferirPlata(Integer CUITenvio, Integer CUITrecibo, Double cantidad) {
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i] != null) {
				if (cuentas[i].getCUIT().equals(CUITenvio)) {
					for (int j = 0; j < cuentas.length; j++) {
						if (cuentas[j] != null) {
							if (cuentas[j].getCUIT().equals(CUITrecibo)) {
								cuentas[i].extraer(cantidad);
								cuentas[j].depositar(cantidad);
							}
						}
					}
				}
			}
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cuenta[] getCuentas() {
		return cuentas;
	}

	public void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

}
