package encuentrosDeportivos;

public class AplicacionMovil extends Listener {
	
	private String resultadoObtenido;
	private String contrincanteDeInteres = "";
	
	public AplicacionMovil(String nombre, String contrincanteDeInteres) {
		super(nombre);
		this.contrincanteDeInteres = contrincanteDeInteres;
	}

	public String getContrincanteDeInteres() {
		return this.contrincanteDeInteres;
	}
	
	public String getResultadoObtenido() {
		return this.resultadoObtenido;
	}
	
	public void setResultadoObtenido(String resultado) {
		this.resultadoObtenido = resultado;
	}
	
	@Override
	public void recibirNotificacion(Partido partido) {
		//Notify/Update
		String resultado;
		if( partido.getContrincantes().contains(this.getContrincanteDeInteres()) ) {
			resultado = partido.getResultado();
		} else {
			resultado = "El contrincante de interes no jugo este partido.";
		}
		this.setResultadoObtenido(resultado);
	}
}
