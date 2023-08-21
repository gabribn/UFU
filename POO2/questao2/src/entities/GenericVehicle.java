package entities;

import questao2.interfaces.IVehicle;

public class GenericVehicle implements IVehicle {
	@Override
	public void start() {
		System.out.println("Ligado");
	}

	@Override
	public void drive() {
		System.out.println("Andando");
	}

	@Override
	public void stop() {
		System.out.println("Parado \n");
	}
}
