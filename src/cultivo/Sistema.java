package cultivo;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	
	//Componente
	private List<Cultivo> tierra;

	public Sistema() {
		tierra = new ArrayList<Cultivo>();
	}
	
	public  List<Cultivo> getTierra(){
		return tierra;
	}
	
	public Integer getMontoTotalDeGananciaAnual() {
		Integer ganancias = 0;
		for(Cultivo cultivo : tierra) {
			ganancias += cultivo.getGanaciaAnual();
		}
		return ganancias;
	}

	public void agregarCultivoALaTierra(Cultivo cultivo) {
		tierra.add(cultivo);
	}
}

