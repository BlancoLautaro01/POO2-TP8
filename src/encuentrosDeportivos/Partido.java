package encuentrosDeportivos;

import java.util.ArrayList;
import java.util.List;

public class Partido {

	//Objeto Observado gracias a su variable Deporte.
	String resultado;
	List<String> contrincantes = new ArrayList<String>();
	Deporte deporte;
	
	public Partido(String resultado, List<String> contrincantes, Deporte deporte) {
		super();
		this.resultado = resultado;
		this.contrincantes = contrincantes;
		this.deporte = deporte;
		
		//Esta seria la invocacion al metodo update
		deporte.notificar(this);
	}
	
	public String getResultado() {
		return this.resultado;
	}
	
	public List<String> getContrincantes() {
		return this.contrincantes;
	}
	
	public Deporte getDeporte() {
		return this.deporte;
	}
}
