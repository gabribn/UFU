package application;

import entities.Singleton;
import questao2.interfaces.IVehicle;
import questao2.interfaces.IVehicleMaker;
/*
 * O medodo Fábica é integrado no sistema com intuito de lidar de forma mais flexivel
 * com a criação de objetos, além de permitir a reutilização de código e possuir um
 * melhor encapsulamento.
 * 
 * O padrão Singleton é implementado para garantir que uma classe tenha apenas uma instância,
 * , assim, economizando recursos e gerando um código mais limpo e elegante.
 * */
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
