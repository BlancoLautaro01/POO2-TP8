package publicaciones;

import java.util.List;
import java.util.ArrayList;

public class ArticuloCientifico {

	private String titulo, tipo, lugarCreacion;
	private List<String> autores, palabrasClave, filiaciones;
	
	public ArticuloCientifico(String titulo, String tipo, String lugarCreacion, List<String> autores, List<String> palabrasClave, List<String> filiaciones, Investigadores investigadores) {
		super();
		this.setTitulo(titulo);
		this.setTipo(tipo);
		this.setLugarCreacion(lugarCreacion);
		this.autores = new ArrayList<String>(autores);
		this.palabrasClave = new ArrayList<String>(palabrasClave);
		this.filiaciones = new ArrayList<String>(filiaciones);
		
		this.notificar(investigadores);
	}

	//Getters y Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getLugarCreacion() {
		return lugarCreacion;
	}

	public void setLugarCreacion(String lugarCreacion) {
		this.lugarCreacion = lugarCreacion;
	}

	public List<String> getAutores() {
		return autores;
	}

	public void addAutor(String autor) {
		this.autores.add(autor);
	}

	public List<String> getFiliaciones() {
		return filiaciones;
	}

	public void addFiliacion(String filiacion) {
		this.filiaciones.add(filiacion);
	}

	public void addPalabraClave(String palabraClave) {
		this.palabrasClave.add(palabraClave);
	}	
	
	//Implementacion
	private void notificar(Investigadores investigadores) {
		for(Investigador investigador: investigadores.getInvestigadores()) {
			this.notificarSi(investigador);
		}
	}
	
	private void notificarSi(Investigador investigador) {
		
		List<String> palabrasClave = new ArrayList<String>(this.getPalabrasClave());
		String palabraClaveActual = palabrasClave.remove(0);
		boolean fueNotificado = false;
		while(!fueNotificado && !palabrasClave.isEmpty()) {
			if(investigador.getIntereses().contains(palabraClaveActual)) {
				investigador.recibirMensaje(this);
				fueNotificado = true;
			} else {
				palabraClaveActual = palabrasClave.remove(0);
			}
		}
	}
	
	private List<String> getPalabrasClave() {
		
		List<String> palabrasClave = this.palabrasClave;
		palabrasClave.addAll(this.getAutores());
		palabrasClave.addAll(this.getFiliaciones());
		palabrasClave.add(this.getLugarCreacion());
		palabrasClave.add(this.getTitulo());
		palabrasClave.add(this.getTipo());
		
		return palabrasClave;
	}
	
}
