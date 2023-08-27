package Entidades.Estacionamento;
import Entidades.Aeroporto.Manutencao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aeropista {
    private static final int LIMITE_AERONAVES = 50;
    private List<Aeronave> aeronaves;
    private Manutencao manutencao;
    private int quantidadeAeronaves;
    int n;
    Scanner scanner = new Scanner(System.in);
    //construtor para incializar classe 
    public Aeropista() {
        aeronaves = new ArrayList<>();
        manutencao = new Manutencao();
        quantidadeAeronaves=0;
    }
    //adiciona uma aeronave no arraylist
    public void adicionarAeronave(Aeronave aeronave) {
        if (aeronaves.size() < LIMITE_AERONAVES) {
            aeronaves.add(aeronave);
            quantidadeAeronaves++;
            manutencao.verificarNecessidadeManutencao(aeronave);
        } else {
            System.out.println("Limite máximo de aeronaves atingido.");
        }
    }
    //busca no arraylist aeronave com a palaca passada no parametro
    public Aeronave buscarAeronavePorPlaca(String placa) {
        for (Aeronave aeronave : aeronaves) {
            if (aeronave.getPlaca().equals(placa)) {
                return aeronave;
            }
        }
        System.out.println("placa não encontrada\n");
        return null;
    }
    //percorre array list e chama função que printa
    public Boolean listarAeronaves() {
    	if(quantidadeAeronaves==0) {
    		return false;
    	}
        for(int i = 0; i < aeronaves.size(); i++) {
        	
        	System.out.println(aeronaves.get(i).toString());
        }
        return true;
    }
    
    
    //Remove aeronave do array list e move para hangar 
    public Boolean moverAeronave(String placa) {
    	//armazena em aeronave a Aeronave da placa entrada 
        Aeronave aeronave = buscarAeronavePorPlaca(placa);
        //se nao encontrada retorna false
        if(aeronave == null) {
        	return false;
        }
        //procura a posição da nave (previne arrayOutOfBounds)
        int index = aeronaves.indexOf(aeronave);
        if(aeronaves.get(index) == null) {
        	System.out.println("Aeronave não encontrada.");
        	return false;
        } else {	
        	aeronaves.remove(aeronaves.get(index));
            System.out.println("Aeronave removida da aeropista.");
            quantidadeAeronaves--;
        }
        return true;
    }
    //Remove aeronave do aeroporto
    public void delcolarAeronave(String placa) {
    	//busca placa 
        Aeronave aeronave = buscarAeronavePorPlaca(placa);
        //se nao achada retorna null
        if(aeronave == null) {
        	System.out.println("Aeronave não encontrada.");
        } else {	
        	//atualiza horario de saida 
        	aeronave.atualizarHorarioSaida(LocalDateTime.now());
        	//emprime(notwork)
        	aeronave.toString();
        	//remove
        	aeronave = null;
            System.out.println("Aeronave removida da aeropista.");
            quantidadeAeronaves--;
        }
    }
}
