package questao2.fabrica;

import entities.GenericVehicle;
import questao2.interfaces.IVehicle;
import questao2.interfaces.IVehicleMaker;

public class ToyotaFactory implements IVehicleMaker{
	public IVehicle makeVehicle(String modelo) {
		switch (modelo) {
		case "Corolla":
			return new GenericVehicle();
		case "Hilux":
			return new GenericVehicle();
		case "Etios":
			return new GenericVehicle();
		default:
			throw new IllegalArgumentException("Modelo nao existente");
		}
	}
}
