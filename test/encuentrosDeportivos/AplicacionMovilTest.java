package encuentrosDeportivos;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AplicacionMovilTest {

	Partido partido;
	List<String> contrincantes;
	
	@Test
	public void testRecibirNotificacion() {
		
		//Setup
		partido = mock(Partido.class);
		
		contrincantes = new ArrayList<String>();
		contrincantes.add("Nadal");
		
		AplicacionMovil app = new AplicacionMovil("Google", "Nadal");
		
		//Exercise
		when(partido.getContrincantes()).thenReturn(contrincantes);
		when(partido.getResultado()).thenReturn("3-2");
		
		app.recibirNotificacion(partido);
		//Verify
		assertEquals(app.getResultadoObtenido(), "3-2");
		
		//More exercise
		contrincantes.remove(0);
		when(partido.getContrincantes()).thenReturn(contrincantes);
		
		app.recibirNotificacion(partido);
		//Verify
		assertEquals(app.getResultadoObtenido(), "El contrincante de interes no jugo este partido.");
	}
	
}
