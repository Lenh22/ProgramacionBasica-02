package Tarea2Cuenta;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestCuenta {
	
	
@Test
	public void queSePuedaCrearUnaCuentaSueldo() {
	String nombre="Maria Elena";
	Double salario= 4000.0;
	
	CuentaSueldo cuentaSueldo= new CuentaSueldo (nombre, salario);
	assertNotNull(cuentaSueldo);
}
@Test
	public void queSePuedaCrearUnaCuentaAhorro() {
	String nombre="Maria Elena";
	Double salario= 4000.0;
	
	CuentaAhorro cuentaAhorro= new CuentaAhorro (nombre, salario);
	assertNotNull(cuentaAhorro);
	}
@Test
public void queSePuedaCrearUnaCuentaCorriente() {
String nombre="Maria Elena";
Double salario= 4000.0;
Double descubierto=200.0;

CuentaCorriente cuentaCorriente= new CuentaCorriente (nombre, salario, descubierto);
assertNotNull(cuentaCorriente);
}
@Test
public void queSePuedaDepositarEnLasCuentas() {
String nombre1="Maria Elena";
String nombre2="Pepe";
String nombre3="Moni";
Double salario= 4000.0;
Double descubierto=200.0;
Double depositar=1000.0;
Double salarioInicial;
Double salarioConDeposito;

CuentaAhorro cuentaAhorro= new CuentaAhorro (nombre2, salario);

salarioInicial=cuentaAhorro.getSalarioInicial();
cuentaAhorro.depositar(depositar);
salarioConDeposito=cuentaAhorro.getSalarioInicial();

assertNotEquals(salarioConDeposito, salarioInicial);
}

}
