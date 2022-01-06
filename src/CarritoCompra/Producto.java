package CarritoCompra;


public  class  Producto implements Comparable <Producto>  {
	
	private String nombre;
	private Double precio;
	private TipoProducto tipo;

	public Producto(String nombre, Double precio, TipoProducto tipo) {
		this.nombre=nombre;
		this.precio=precio;
		this.tipo=tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public TipoProducto getTipo() {
		return tipo;
	}

	public void setTipo(TipoProducto tipo) {
		this.tipo = tipo;
	}
//Usando Comparable
	@Override
	public int compareTo(Producto o) {
//Manera 1
//		int salida;
//		if(o.getNombre().compareTo(this.nombre)>0) {
//			salida=-1;
//		}else if(o.getNombre().compareTo(this.nombre)<0) {
//			salida=1;
//		}else {
//			salida=0;
//		}
//		return salida;
		
//Manera 2
		return Integer.valueOf(this.nombre.compareTo(o.getNombre()));
	}
}
