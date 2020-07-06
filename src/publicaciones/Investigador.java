package publicaciones;

import java.util.List;
import java.util.ArrayList;

public class Investigador {

	//Objeto observador
	private List<String> intereses;
	
	public Investigador(List<String> intereses){
		
		this.intereses = new ArrayList<String>(intereses);
	}
	
	public void recibirMensaje(ArticuloCientifico articulo) {
		//Accion a ejecutar cuando recive aviso.
		//Metodo Update/Notify
	}

	public List<String> getIntereses() {
		return this.intereses;
	}
}
