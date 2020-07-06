package cultivo;

public class Soja extends Cultivo {

	//Leaf
	@Override
	public Integer getGanaciaAnual() {
		return 500;
	}

	@Override
	public void agregarCultivo(Cultivo cultivo) {
		System.out.println("No se pueden agregar en la leaf(Soja)");
	}

	@Override
	public void eliminarCultivo(Cultivo cultivo) {
		System.out.println("No se pueden eliminar en la leaf(Soja)");
	}
}
