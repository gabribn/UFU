package Entidades.Estacionamento;

public class Hangar {
    private Aeronave[] aeronaves;
    private int quantidadeAeronaves;
    int n;
    //construtor para incializar classe
    public Hangar() {
        aeronaves = new Aeronave[2];
        quantidadeAeronaves = 0;
    }
    //adiciona a nave no vetor
    public boolean armazenaAeronave(Aeronave aeronave) {
        if (quantidadeAeronaves == 0) {
            aeronaves[0] = aeronave;
            quantidadeAeronaves++;
            return true;
        } else if (quantidadeAeronaves == 1 && aeronave.getTamanho().equals("Pequena")) {
            aeronaves[1] = aeronave;
            quantidadeAeronaves++;
            return true;
        } else {
            System.out.println("Não há espaço disponível para armazenar aeronave.");
            return false;
        }
    }
    //remove nave do vetor e a retorna para aeropista 
    public void removerAeronave(String placa) {
        for(int i = 0; i < quantidadeAeronaves; i++) {
        	if(aeronaves[i].getPlaca().equals(placa)) {
        		aeronaves[i] = null;
        		System.out.println("Aeronave removida do hangar.");
        		quantidadeAeronaves--;
        	} else {
        		System.out.println("Aeronave não encontrada.");
        	}
        }
    }
    //retorna aeronave de placa desejada
    public Aeronave getAeronave(String placa) {
        for(int i = 0; i < quantidadeAeronaves; i++) {
        	if(aeronaves[i].getPlaca().equals(placa)) {
        		return aeronaves[i];
        	} 
        }
        return null;
    }
    //lista aeronaves presentes no hangar
    public Boolean listarAeronaves() {
    	if(quantidadeAeronaves==0) {
    		return false;
    	}
    	for(int i = 0; i < quantidadeAeronaves; i++) {
    		System.out.println(aeronaves[i]);
    	}
    	return true;
    	
    }
 }

