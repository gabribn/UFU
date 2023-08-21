package questao2.fabrica;

import entities.GenericVehicle;
import questao2.interfaces.IVehicle;
import questao2.interfaces.IVehicleMaker;

public class HondaFactory implements IVehicleMaker{
	public IVehicle makeVehicle(String modelo) {
		switch (modelo) {
		case "City":
			return new GenericVehicle();
		case "Civic":
			return new GenericVehicle();
		case "Fit":
			return new GenericVehicle();
		default:
			throw new IllegalArgumentException("Modelo não existente");
		}
	}
}
