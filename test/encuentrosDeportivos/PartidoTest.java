package encuentrosDeportivos;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.util.List;
import java.util.ArrayList;

public class PartidoTest {


	List<String> contrincantes;
	String contrincanteInteres;
	Deporte tenis;
	
	Servidor servidor1;
	Servidor servidor2;	
	
	AplicacionMovil aplicacion1;
	AplicacionMovil aplicacion2;
	AplicacionMovil aplicacion3;
	
	@Before
	public void setUp() throws Exception {
		
		//Setup
		tenis = new Tenis();
	
	}
	
	@Test
	public void testServidorNotificado() {
		
		//Setup
		servidor1 = mock(Servidor.class);
		servidor2 = mock(Servidor.class);
		contrincantes = new ArrayList<String>();
		
		//Exercise
		tenis.agregarListener(servidor1);

		contrincantes.add("Nadal");
		contrincantes.add("Djokovic");
		
		Partido partido = new Partido("3-2", contrincantes, tenis);
		
		//Verify
		verify(servidor1, times(1)).recibirNotificacion(partido);
		verify(servidor2, times(0)).recibirNotificacion(partido);
	}
	
	@Test
	public void testAplicacionNotificada() {
		
		//Teardown and Setup
		aplicacion1 = mock(AplicacionMovil.class);
		aplicacion2 = mock(AplicacionMovil.class);
		aplicacion3 = mock(AplicacionMovil.class);
		
		tenis.agregarListener(aplicacion1);
		tenis.agregarListener(aplicacion2);
		
		contrincantes = new ArrayList<String>();
		
		//Exercise
		contrincantes.add("Nadal");
		contrincantes.add("Djokovic");
		
		when(aplicacion1.getContrincanteDeInteres()).thenReturn("Nadal");
		
		Partido partido = new Partido("3-2", contrincantes, tenis);
		
		//Verify
		verify(aplicacion1, times(1)).recibirNotificacion(partido);
		verify(aplicacion2, times(1)).recibirNotificacion(partido);
		verify(aplicacion3, times(0)).recibirNotificacion(partido);
	}
}
