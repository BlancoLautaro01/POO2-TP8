package publicaciones;

import java.util.List;
import java.util.ArrayList;

public class Investigadores {

	private List<Investigador> investigadores = new ArrayList<Investigador>();
	
	public List<Investigador> getInvestigadores(){
		return this.investigadores;
	}
	
	public void addInvestigador(Investigador investigador){
		this.investigadores.add(investigador);
	}
}
