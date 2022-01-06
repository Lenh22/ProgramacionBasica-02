package Futsal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class testFutsal {
	
	@Test
	public void queSeAgregueTorneo() {
		
		Torneo torneo= new Torneo("Torneo", 25);
		
		Equipo equipo1= new Equipo("Argentina");
		Equipo equipo2=new Equipo("EEUU");
		
		torneo.agregarEquipo(equipo1);
		torneo.agregarEquipo(equipo2);
		
		assertNotNull(torneo.getEquipos());
		
	}
	@Test
	public void queSeAgregueJugador() {
		
		Torneo torneo= new Torneo("Torneo", 25);
		
		Equipo equipo1= new Equipo("Argentina");
		Equipo equipo2=new Equipo("EEUU");
		
		torneo.agregarEquipo(equipo1);
		torneo.agregarEquipo(equipo2);
		
		Jugador jugador1=new Jugador("Lean", 22, 10000.0, 0);
		Jugador jugador2=new Jugador("Kay", 19, 20000.0, 0);
		Jugador jugador3=new Jugador("Uma", 18, 5000.0, 0);
		Jugador jugador4=new Jugador("Ia", 20, 5000.0, 0);
		Jugador jugador5=new Jugador("Patri", 32, 5000.0, 0);
		
		Jugador jugador6=new Jugador("Yo", 1, 10000.0, 0);
		Jugador jugador7=new Jugador("Tu", 2, 10000.0, 0);
		Jugador jugador8=new Jugador("El", 3, 10000.0, 0);
		Jugador jugador9=new Jugador("Nosotros", 4, 10000.0, 0);
		Jugador jugador10=new Jugador("Vosotros", 5, 10000.0, 0);
		
		equipo1.agregarJugador(jugador1);
		equipo1.agregarJugador(jugador2);
		equipo1.agregarJugador(jugador3);
		equipo1.agregarJugador(jugador4);
		equipo1.agregarJugador(jugador5);
		
		
		equipo2.agregarJugador(jugador6);
		equipo2.agregarJugador(jugador7);
		equipo2.agregarJugador(jugador8);
		equipo2.agregarJugador(jugador9);
		equipo2.agregarJugador(jugador10);
		
		
		assertNotNull(equipo1.getJugadores());
		assertNotNull(equipo2.getJugadores());
		
	}
	@Test
	public void queSeCreePartido() {
		
		Torneo torneo= new Torneo("Torneo", 25);
		
		Equipo equipo1= new Equipo("Argentina");
		Equipo equipo2=new Equipo("EEUU");
		
		torneo.agregarEquipo(equipo1);
		torneo.agregarEquipo(equipo2);
		
		Jugador jugador1=new Jugador("Lean", 22, 10000.0, 0);
		Jugador jugador2=new Jugador("Kay", 19, 20000.0, 0);
		Jugador jugador3=new Jugador("Uma", 18, 5000.0, 0);
		Jugador jugador4=new Jugador("Ia", 20, 5000.0, 0);
		Jugador jugador5=new Jugador("Patri", 32, 5000.0, 0);
		
		Jugador jugador6=new Jugador("Yo", 1, 10000.0, 0);
		Jugador jugador7=new Jugador("Tu", 2, 10000.0, 0);
		Jugador jugador8=new Jugador("El", 3, 10000.0, 0);
		Jugador jugador9=new Jugador("Nosotros", 4, 10000.0, 0);
		Jugador jugador10=new Jugador("Vosotros", 5, 10000.0, 0);
		
		equipo1.agregarJugador(jugador1);
		equipo1.agregarJugador(jugador2);
		equipo1.agregarJugador(jugador3);
		equipo1.agregarJugador(jugador4);
		equipo1.agregarJugador(jugador5);
		
		
		equipo2.agregarJugador(jugador6);
		equipo2.agregarJugador(jugador7);
		equipo2.agregarJugador(jugador8);
		equipo2.agregarJugador(jugador9);
		equipo2.agregarJugador(jugador10);
		
		torneo.registrarPartido(equipo1, equipo2);
		
		assertNotNull(torneo.getPartido());
	
		
	}
	@Test
	public void queSeExpulseJugador() {
		
		Torneo torneo= new Torneo("Torneo", 25);
		
		Equipo equipo1= new Equipo("Argentina");
		Equipo equipo2=new Equipo("EEUU");
		
		torneo.agregarEquipo(equipo1);
		torneo.agregarEquipo(equipo2);
		
		Jugador jugador1=new Jugador("Lean", 22, 10000.0, 0);
		Jugador jugador2=new Jugador("Kay", 19, 20000.0, 0);
		Jugador jugador3=new Jugador("Uma", 18, 5000.0, 0);
		Jugador jugador4=new Jugador("Ia", 20, 5000.0, 0);
		Jugador jugador5=new Jugador("Patri", 32, 5000.0, 0);
		
		Jugador jugador6=new Jugador("Yo", 1, 10000.0, 0);
		Jugador jugador7=new Jugador("Tu", 2, 10000.0, 0);
		Jugador jugador8=new Jugador("El", 3, 10000.0, 0);
		Jugador jugador9=new Jugador("Nosotros", 4, 10000.0, 0);
		Jugador jugador10=new Jugador("Vosotros", 5, 10000.0, 0);
		
		equipo1.agregarJugador(jugador1);
		equipo1.agregarJugador(jugador2);
		equipo1.agregarJugador(jugador3);
		equipo1.agregarJugador(jugador4);
		equipo1.agregarJugador(jugador5);
		
		
		equipo2.agregarJugador(jugador6);
		equipo2.agregarJugador(jugador7);
		equipo2.agregarJugador(jugador8);
		equipo2.agregarJugador(jugador9);
		equipo2.agregarJugador(jugador10);
		
		torneo.registrarPartido(equipo1, equipo2);
		
	 
		Boolean valorObt3=torneo.getPartido().expulsado(jugador6);
		assertTrue(valorObt3);
	}
	@Test
	public void queSeDeGolJugador() {
		
		Torneo torneo= new Torneo("Torneo", 25);
		
		Equipo equipo1= new Equipo("Argentina");
		Equipo equipo2=new Equipo("EEUU");
		
		torneo.agregarEquipo(equipo1);
		torneo.agregarEquipo(equipo2);
		
		Jugador jugador1=new Jugador("Lean", 22, 10000.0, 0);
		Jugador jugador2=new Jugador("Kay", 19, 20000.0, 0);
		Jugador jugador3=new Jugador("Uma", 18, 5000.0, 0);
		Jugador jugador4=new Jugador("Ia", 20, 5000.0, 0);
		Jugador jugador5=new Jugador("Patri", 32, 5000.0, 0);
		
		Jugador jugador6=new Jugador("Yo", 1, 10000.0, 0);
		Jugador jugador7=new Jugador("Tu", 2, 10000.0, 0);
		Jugador jugador8=new Jugador("El", 3, 10000.0, 0);
		Jugador jugador9=new Jugador("Nosotros", 4, 10000.0, 0);
		Jugador jugador10=new Jugador("Vosotros", 5, 10000.0, 0);
		
		equipo1.agregarJugador(jugador1);
		equipo1.agregarJugador(jugador2);
		equipo1.agregarJugador(jugador3);
		equipo1.agregarJugador(jugador4);
		equipo1.agregarJugador(jugador5);
		
		
		equipo2.agregarJugador(jugador6);
		equipo2.agregarJugador(jugador7);
		equipo2.agregarJugador(jugador8);
		equipo2.agregarJugador(jugador9);
		equipo2.agregarJugador(jugador10);
		
		torneo.registrarPartido(equipo1, equipo2);
		
		Jugador valorOb4=torneo.getPartido().gol(jugador1, 15.0);
		assertEquals(valorOb4, jugador1);		
		
	}

	@Test
	public void queSeAmonestaJugador() {
		
		Torneo torneo= new Torneo("Torneo", 25);
		
		Equipo equipo1= new Equipo("Argentina");
		Equipo equipo2=new Equipo("EEUU");
		
		torneo.agregarEquipo(equipo1);
		torneo.agregarEquipo(equipo2);
		
		Jugador jugador1=new Jugador("Lean", 22, 10000.0, 0);
		Jugador jugador2=new Jugador("Kay", 19, 20000.0, 0);
		Jugador jugador3=new Jugador("Uma", 18, 5000.0, 0);
		Jugador jugador4=new Jugador("Ia", 20, 5000.0, 0);
		Jugador jugador5=new Jugador("Patri", 32, 5000.0, 0);
		
		Jugador jugador6=new Jugador("Yo", 1, 10000.0, 0);
		Jugador jugador7=new Jugador("Tu", 2, 10000.0, 0);
		Jugador jugador8=new Jugador("El", 3, 10000.0, 0);
		Jugador jugador9=new Jugador("Nosotros", 4, 10000.0, 0);
		Jugador jugador10=new Jugador("Vosotros", 5, 10000.0, 0);
		
		equipo1.agregarJugador(jugador1);
		equipo1.agregarJugador(jugador2);
		equipo1.agregarJugador(jugador3);
		equipo1.agregarJugador(jugador4);
		equipo1.agregarJugador(jugador5);
		
		
		equipo2.agregarJugador(jugador6);
		equipo2.agregarJugador(jugador7);
		equipo2.agregarJugador(jugador8);
		equipo2.agregarJugador(jugador9);
		equipo2.agregarJugador(jugador10);
		
		torneo.registrarPartido(equipo1, equipo2);
				
		Jugador valorOb5=torneo.getPartido().amonestado(jugador1, 10.0);
		assertEquals(valorOb5, jugador1);	
		
	}
	@Test
	public void queSeCalculeValorDelEquipo() {
		
		Equipo equipo1= new Equipo("Argentina");
		
		Jugador jugador1=new Jugador("Lean", 22, 5000.0, 0);
		Jugador jugador2=new Jugador("Kay", 19, 5000.0, 0);
		Jugador jugador3=new Jugador("Uma", 18, 5000.0, 0);
		Jugador jugador4=new Jugador("Ia", 20, 5000.0, 0);
		Jugador jugador5=new Jugador("Patri", 32, 5000.0, 0);
		
		equipo1.agregarJugador(jugador1);
		equipo1.agregarJugador(jugador2);
		equipo1.agregarJugador(jugador3);
		equipo1.agregarJugador(jugador4);
		equipo1.agregarJugador(jugador5);

//		Double valorObtenido=equipo1.calcularValorEquipo();
		
		assertEquals(25000.0, equipo1.calcularValorEquipo(), 0.1);
	}
	@Test
	public void queSeCalculeEdadPromedio() {
		
		Equipo equipo1= new Equipo("Argentina");
		
		Jugador jugador1=new Jugador("Yo", 5, 5000.0, 0);
		Jugador jugador2=new Jugador("Tu", 5, 5000.0, 0);
		Jugador jugador3=new Jugador("El", 5, 5000.0, 0);
		Jugador jugador4=new Jugador("Nosostros", 5, 5000.0, 0);
		Jugador jugador5=new Jugador("Vosotros", 5, 5000.0, 0);
		
		equipo1.agregarJugador(jugador1);
		equipo1.agregarJugador(jugador2);
		equipo1.agregarJugador(jugador3);
		equipo1.agregarJugador(jugador4);
		equipo1.agregarJugador(jugador5);

		Double valorObtenido=equipo1.calcularEdadPromedio();
		
		assertEquals(5.0, valorObtenido,0.01);
	}


}
