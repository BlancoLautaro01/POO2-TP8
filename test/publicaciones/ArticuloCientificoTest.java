package publicaciones;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.util.List;
import java.util.ArrayList;

public class ArticuloCientificoTest {

	List<String> autores;
	List<String> palabrasClave;
	List<String> filiaciones;
	List<String> intereses1;
	List<String> intereses2;
	
	Investigadores investigadores;
	Investigador investigador1;
	Investigador investigador2;
	
	@Before
	public void setUp() throws Exception {
		
		autores = new ArrayList<String>();
		palabrasClave = new ArrayList<String>();
		filiaciones = new ArrayList<String>();
		intereses1 = new ArrayList<String>();
		intereses2 = new ArrayList<String>();
		
		investigadores = new Investigadores();
		
		//Como los estoy haciendo con mock y no usando su constructor, tengo que agregarlos manualmente a Investigadores.
		investigador1 = mock(Investigador.class);
		investigadores.addInvestigador(investigador1);
		
		investigador2 = mock(Investigador.class);
		investigadores.addInvestigador(investigador2);
		
	}
	
	@Test
	public void testConstructor() {
		//Este test toma 2 investigadores, uno sin intereses y otro con "mockito", y se fija si al correr el constructor 
		//de ArticuloCientifico este recibe la notificacion.
		
		intereses1.add("mockito");
		filiaciones.add("mockito");
	
		when(investigador1.getIntereses()).thenReturn(intereses1);
	
		ArticuloCientifico articulo = new ArticuloCientifico("", "", "", autores, palabrasClave, filiaciones, investigadores);
		
		assertEquals(articulo.getFiliaciones(), filiaciones);
		verify(investigador1, times(1)).recibirMensaje(articulo);
		verify(investigador2, times(0)).recibirMensaje(articulo);
	}
	
}
