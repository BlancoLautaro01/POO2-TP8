package cultivo;

public abstract class Cultivo {
	
	//Componente
	public abstract Integer getGanaciaAnual();
	
	public abstract void agregarCultivo(Cultivo cultivo);
	
	public abstract void eliminarCultivo(Cultivo cultivo);

}
