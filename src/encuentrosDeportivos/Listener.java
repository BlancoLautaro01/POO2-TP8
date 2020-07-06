package encuentrosDeportivos;

public abstract class Listener {
	
	private String nombre;
	
	public Listener(String nombre) {
		super();
		this.setNombre(nombre);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void subscribirseA(Deporte deporte) {
		deporte.agregarListener(this);
	}
	
	public abstract void recibirNotificacion(Partido partido);
}
