package herenciaEmpleado;

public class Ingeniero extends Empleado {
	
	private Double plus;
	
	public Ingeniero (String nombre, String apellido, Double salario,String fechaNac, Gerente gerente,Double plus) {
			super(nombre,apellido,salario, fechaNac, gerente);
			this.plus=plus;
	}
	

	@Override
	public Double obtenerSalario() {
		//Llamar un metodo del padre se usa super.atributo
		return super.obtenerSalario() + this.plus;
	}

}
