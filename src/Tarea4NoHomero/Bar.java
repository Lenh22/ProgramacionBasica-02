package Tarea4NoHomero;
//Acordate de importar bien Len
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Bar {
	
	private String nombre;
	private TreeSet<Cliente> clientes;

	public Bar(String nombre) {
		this.nombre=nombre;
		this.clientes=new TreeSet<Cliente>();
	}

	public Boolean agregarCliente(Cliente cliente) {
		
		return this.clientes.add(cliente) ;
	}

	public Integer cantidadDeClientes() {
		
		return this.clientes.size();
	}

	public Cliente buscarCliente(Cliente cliente) {
		Iterator <Cliente> it=this.clientes.iterator();//Iterator para contar y guardar en it
		
		while(it.hasNext()) {//Aca mira si hay un prox valor o es Null (Mientras tenga valor adelante continua)
			Cliente clienteAComparar=it.next();//Guarda en variable el prox valor para comparar
			
			if(clienteAComparar.equals(cliente))//Compara para buscar
				return clienteAComparar;//Si lo encuentra lo retorna
		}
		return null;
	}

	public TreeSet<Cliente> obtenerGrupo() {
		return this.clientes;
	}

	public TreeSet<Cliente> obtenerGrupoEdad() {
		OrdenPorEdadComparator orden= new OrdenPorEdadComparator();
		TreeSet<Cliente> ordenados=new TreeSet<Cliente>(orden);
		ordenados.addAll(clientes);
		return ordenados;
	}
	
}
