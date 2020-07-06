package cultivo;

import java.util.ArrayList;
import java.util.List;

public class RegionMixta extends Cultivo {

	//Compuesto
	private List<Cultivo> cultivos;	
	
	public RegionMixta() {
		cultivos = new ArrayList<Cultivo>(4);
	}

	@Override
	public Integer getGanaciaAnual() {
		Integer ganancia=0;
		for(Cultivo cultivo : cultivos){
			ganancia = ganancia + cultivo.getGanaciaAnual();
		}
		return ganancia / cultivos.size();
	}
	
	public void agregarCultivo(Cultivo cultivo) {
		cultivos.add(cultivo);
	}

	@Override
	public void eliminarCultivo(Cultivo cultivo) {
		if(this.cultivos.contains(cultivo)) {
			this.cultivos.remove(cultivo);
		}
	}
	
	public List<Cultivo> getCultivos(){
		return cultivos;
	}
}
