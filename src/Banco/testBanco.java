package Banco;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class testBanco {
	
	@Test
	public void queSeCreeUnBanco() {
		Banco banco= new Banco("nombreBanco");
		
		Cliente cliente1= new Cliente(1234,"Lean");
		Cliente cliente2= new Cliente(1234,"Kay");
		Cliente cliente3= new Cliente(1234,"Fiona");
		
		Cuenta sueldo= new CajaSueldo(204101,500.0, TipoCuenta.CAJASUELDO);
		Cuenta ahorro= new CajaAhorro(204102,500.0, TipoCuenta.CAJAAHORRO);
		Cuenta corriente= new CajaCorriente(204103,500.0, TipoCuenta.CAJACORRIENTE);
		
		sueldo.agregarcliente(cliente1);
		ahorro.agregarcliente(cliente1);
		corriente.agregarcliente(cliente2);
		
		banco.agregarCuenta(sueldo);
		banco.agregarCuenta(ahorro);
		banco.agregarCuenta(corriente);
		
		
	}
	@Test
	public void queSeCobreCincoPorcientoDeComisionAlDepositarDineroLuegoDeHaberRealizadoUnaExtraccionMayorAlSaldo() {
		
		CajaCorriente corriente= new CajaCorriente(204103,0.0, TipoCuenta.CAJACORRIENTE);
		
		corriente.depositar(100.0);
		corriente.extraer(200.0);
		assertEquals(-100.0, corriente.getSaldo(), 0.1);
		corriente.depositar(200.0);
		
		assertEquals(95.0, corriente.getSaldo(), 0.1);
	}
	
	@Test
	public void queSeCobreElCincoPorCientoDeComisionPorMasQueElProximoDepositoNoSeaSuficieteParaCubrirElDescubierto() {
		CajaCorriente corriente= new CajaCorriente(204103,0.0, TipoCuenta.CAJACORRIENTE);
		
		corriente.depositar(100.0);
	
		corriente.extraer(200.0);
	
		corriente.depositar(100.0);
		assertEquals(0.0, corriente.getSaldo(), 0.1);
	}

	@Test
	public void queUnaExtraccionCuandoYaSeTieneDeudaIncrementeLaDeuda() {
		CajaCorriente corriente= new CajaCorriente(204103,500.0, TipoCuenta.CAJACORRIENTE);
		
		corriente.depositar(100.0);
		corriente.extraer(200.0);
		corriente.extraer(50.0);
		
		assertEquals(corriente.getDeberAlBanco(), 7.5, 0.1);
		
	}
	@Test
	public void queVariasOperacionesDeDepositoYExtraccionGenerenElSaldoYLaDeudaCorrecto() {
		CajaCorriente corriente= new CajaCorriente(204103,0.0, TipoCuenta.CAJACORRIENTE);
		
		assertTrue(corriente.depositar(100.0));
		corriente.extraer(200.0);
		
		corriente.extraer(50.0);
		corriente.depositar(50.0);	

		corriente.depositar(50.0);
		
		corriente.extraer(40.0);
	
		corriente.depositar(150.0);
		

		assertEquals(corriente.getSaldo(), 0.0, 0.1);
		assertEquals(corriente.getDeberAlBanco(), 0.0, 0.1);
	}
	
	@Test 
	public void queSePuedaTrasferirAOtraCuenta() {
		Banco banco= new Banco("BancoGalicia");
		CajaCorriente corriente= new CajaCorriente(20,0.0, TipoCuenta.CAJACORRIENTE);
		CajaAhorro ahorro= new CajaAhorro(123, 100.0, TipoCuenta.CAJAAHORRO);
		
		banco.agregarCuenta(ahorro);
		banco.agregarCuenta(corriente);
		
		banco.trasferirPlata(123, 20, 100.0);
		
		assertEquals(0.0, corriente.getSaldo(),0.1);
		
	}
}
