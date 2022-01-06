package Kanban;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class testKanban {
	
	@Test
	public void queSePuedaAgregarTareas() {

		Usuario usuario= new Usuario("Len");
		usuario.crearTarea(EstadoTarea.PENDIENTE,"Tarea01",0);
//		kanban.buscarUsuario("Len").crearTarea(EstadoTarea.PENDIENTE,"Tarea01",0);

		Kanban kanban= new Kanban();
		kanban.agregarUsuario(usuario);

		
		//Que el usuario se haya agregado
		assertNotNull(kanban.getUsuarios().get(0));
		
		//Que guarde la tarea test
		assertNotNull(kanban.getTareas().get(0));
		
		//Compara si la tarea del usuario en Kanban es igual q la tarea del usuario guardado
		ArrayList<Tareas> tareas= new ArrayList<>();
		tareas.addAll(kanban.getTareas());
		assertEquals(tareas.get(0), usuario.getTarea());
		
		//Cambiar estado test
		kanban.cambiarEstadoTarea(usuario, 0, EstadoTarea.FINALIZADO);
		EstadoTarea estado= kanban.getUsuarios().get(0).getTarea().getEstado();
		assertEquals(EstadoTarea.FINALIZADO, estado);
		
		//Quitar tarea a usuario
		kanban.quitarTareaAUsuario(usuario);
		assertNull(usuario.getTarea());
		assertFalse(usuario.getTieneTarea());
		
		//Cambiar tarea al usuario
		//NO FUNCIONA
		assertTrue(kanban.cambiarTareaAUsuario(usuario, 0));
		assertNotNull(usuario.getTarea());
		assertEquals(kanban.getTareas().get(0).getIdTarea(),usuario.getTarea().getIdTarea());	
		
		//Agregarle una tarea al usuario que NO tenga una tarea
		//NO FUNCIONA
		Tareas tarea= new Tareas(EstadoTarea.PENDIENTE,"Tarea02",1);
		kanban.agregarTarea(tarea);
		assertTrue(kanban.agregarTareaAUsuario(usuario, 1));
		assertNotNull(usuario.getTarea());
		
		//
	}

}
