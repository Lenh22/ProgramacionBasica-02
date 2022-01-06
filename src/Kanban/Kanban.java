package Kanban;

import java.util.ArrayList;

public class Kanban {
	protected ArrayList<Usuario> usuarios;
	protected ArrayList<Tareas> tareas;
	
	public Kanban() {
		usuarios=new ArrayList<>();
		tareas= new ArrayList<>();
	}
//Al agregar usuario viene junto a sus tareas si es que tiene
	public void agregarUsuario(Usuario usuario) {
		usuarios.add(usuario);
		for (int i = 0; i < usuarios.size(); i++) {
			if(usuarios.get(i).getTieneTarea()) {
				agregarTarea(usuario.getTarea());
			}
		}
	}
//Agrega tareas al ArrayList
	public void agregarTarea(Tareas tarea) {
		tareas.add(tarea);
	}
//Retorna al usuario encontrado
	public Usuario buscarUsuario(String nombre) {
		for (int i = 0; i < usuarios.size(); i++) {
			if(usuarios.get(i).getNombre().equals(nombre)) {
				return usuarios.get(i);
			}
		}return null;
	}
//Cambia el estado de un usuario si es que la tiene
	public Boolean cambiarEstadoTarea(Usuario usuario, Integer idTarea, EstadoTarea estado) {
		for (int i = 0; i < usuarios.size(); i++) {
			if(usuarios.get(i).getTarea().getIdTarea()==idTarea) {
				usuarios.get(i).getTarea().setEstado(estado);
				return true;
			}
		}return false;
		
	}
	//TIENE ERROR MIRAR TEST
	public Boolean agregarTareaAUsuario(Usuario usuario, Integer idTarea) {
		Tareas tarea = null;
		//Busca si esta la tarea en el ArrayList y esta en PENDIENTE
		for (int i = 0; i < tareas.size(); i++) {
			if(tareas.get(i).getIdTarea()==idTarea) {
			if(tareas.get(i).getEstado()==EstadoTarea.PENDIENTE){
				tareas.get(i).setEstado(EstadoTarea.EN_CURSO);
				tarea=tareas.get(i);
				}
			}else {
					return false;
		}
	}
		//Busca que exista el usuario y  no tenga tareas
		for (int i = 0; i < usuarios.size(); i++) {
			if(usuarios.get(i).equals(usuario)){
			if(!usuarios.get(i).getTieneTarea() && usuarios.get(i).getTarea()==null) {	
				usuarios.get(i).setTarea(tarea);
				usuarios.get(i).setTieneTarea(true);
				return true;
			}
		}
	}return false;
}
	//TIENE ERROR MIRAR TEST
	public Boolean cambiarTareaAUsuario(Usuario usuario, Integer idTarea) {
		Tareas tarea = null;
		//Busca si esta la tarea en el ArrayList y es PENDIENTE en estado
		for (int i = 0; i < tareas.size(); i++) {
			if(tareas.get(i).getIdTarea()==idTarea) {
				if(tareas.get(i).getEstado()==EstadoTarea.PENDIENTE){
				tareas.get(i).setEstado(EstadoTarea.EN_CURSO);
				tarea=tareas.get(i);
				}
			}else {
					return false;
			}
		}
		//Busca que exista el usuario y le cambia la tarea
		for (int i = 0; i < usuarios.size(); i++) {
			if(usuarios.get(i).equals(usuario)){
				usuarios.get(i).setTarea(tarea);
				return true;	
		}else {
			tareas.get(i).setEstado(EstadoTarea.PENDIENTE);
		}
	}return false;
}
//Si el usuario existe le quita tarea y deja Null eso
	public void quitarTareaAUsuario(Usuario usuario) {
		for (int i = 0; i < usuarios.size(); i++) {
			if(usuarios.get(i).equals(usuario)) {
				usuarios.get(i).quitarTarea();
			}
		}
	}
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	public ArrayList<Tareas> getTareas() {
		return tareas;
	}
	
	

}
