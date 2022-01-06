//Se desea desarrollar un software para la gestión de los empleados de una empresa. Para cada empleado se desea conocer el nombre, apellido, salario y fecha de nacimiento.
//Como la empresa está organizada en forma de departamentos, también se debe conocer el gerente encargado de cada uno de ellos. Adicionalmente, los gerentes cuentan con la posibilidad de tener una cochera en donde estacionar sus vehículos.
//También se cuenta con un manejo especial para aquellos empleados de tipo “Ingenieros”, dado que su salario base se ve afectado por un concepto adicional denominado “para la productividad”.
//Por último, se encuentran los directores quienes además de tener su cochera, poseen un “sueldo extra” producto de tener la responsabilidad de ser directivo de la empresa.

package herenciaEmpleado;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestEmpleado {


    

    @Test
    public void queSePuedaCrearUnEmpleado() {
	String nombre = "Ale";
	String apellido = "gon";
	Double salario = 1000.0;
	String fecha_nacimiento = "21/2/1990";
	Gerente gerente = new Gerente("el capo","garcia",2000000.0,"20/5/1965",null,"c5");
	Gerente subgerente = new Gerente("gerente prncipal","garcia",2000000.0,"20/5/1965",gerente,"c5");
	Empleado empleado = new Empleado(nombre, apellido, salario, fecha_nacimiento, subgerente);
    assertNotNull(empleado);
    
    Ingeniero ingeniero= new Ingeniero("nombre", "apellido", 2000.0, "20/05/1999", subgerente, 100.0);
  
    assertNotNull(ingeniero);
    
    }
}
