package encuentrosDeportivos;

public abstract class Listener {
	
	String nombre;
	
	public Listener(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void subscribirseA(Deporte deporte) {
		deporte.agregarListener(this);
	}
	
	public abstract void recibirNotificacion(Partido partido);
}
