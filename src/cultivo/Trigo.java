package cultivo;

public class Trigo extends Cultivo{
	
	//Leaf
	@Override
	public Integer getGanaciaAnual() {
		return 300;
	}

	@Override
	public void agregarCultivo(Cultivo cultivo) {
		System.out.println("No se pueden agregar en la leaf(Trigo)");
	}

	@Override
	public void eliminarCultivo(Cultivo cultivo) {
		System.out.println("No se pueden eliminar en la leaf(Trigo)");
	}

}
