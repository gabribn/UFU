package application;

import entities.Singleton;
import questao2.interfaces.IVehicle;
import questao2.interfaces.IVehicleMaker;

public class Main {

	public static void main(String[] args) {	
        Singleton factorySingleton = Singleton.getInstance();

        IVehicleMaker toyotaFactory = factorySingleton.getToyotaFactory();
        IVehicle corolla = toyotaFactory.makeVehicle("Corolla");

        corolla.start();
        corolla.drive();
        corolla.stop();

        IVehicleMaker hondaFactory = factorySingleton.getHondaFactory();
        IVehicle civic = hondaFactory.makeVehicle("Civic");

        civic.start();
        civic.drive();
        civic.stop();

	}

}
