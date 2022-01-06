package Kanban;

public class Usuario {

	private String nombre;
	private Boolean tieneTarea;
	private Tareas tarea;

	public Usuario(String nombre) {
		this.nombre=nombre;
		this.tieneTarea=false;
	}

	public void crearTarea(EstadoTarea estado, String nombreTarea, Integer idTarea) {
		this.tarea= new Tareas(EstadoTarea.PENDIENTE,nombreTarea, idTarea);
		tieneTarea=true;
		
	}
	public void quitarTarea() {
		this.tarea=null;
		this.tieneTarea=false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getTieneTarea() {
		return tieneTarea;
	}

	public void setTieneTarea(Boolean tieneTarea) {
		this.tieneTarea = tieneTarea;
	}

	public Tareas getTarea() {
		return tarea;
	}

	public void setTarea(Tareas tarea) {
		this.tarea = tarea;
		this.tieneTarea=true;
	}
	

}
