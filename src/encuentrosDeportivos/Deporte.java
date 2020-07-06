package encuentrosDeportivos;

import java.util.ArrayList;
import java.util.List;

public abstract class Deporte {

	//En esta clase es la "Observada" en cierta forma ya qe es la que conoce los listeners, pero aun asi la observada es Partido.
	private List<Listener> listeners = new ArrayList<Listener>();
	
	public void agregarListener(Listener listener) {
		//attach
		this.listeners.add(listener);
	}

	public void notificar(Partido partido) {
		for(Listener listener: listeners) {
			listener.recibirNotificacion(partido);
		}
	}
}
