package entities;

import questao2.fabrica.HondaFactory;
import questao2.fabrica.ToyotaFactory;
import questao2.interfaces.IVehicleMaker;

public class Singleton {
	  private static Singleton instance;

	    private Singleton() {}

	    public static Singleton getInstance() {
	        if (instance == null) {
	            instance = new Singleton();
	        }
	        return instance;
	    }

	    public IVehicleMaker getToyotaFactory() {
	        return new ToyotaFactory();
	    }

	    public IVehicleMaker getHondaFactory() {
	        return new HondaFactory();
	    }
}
