 package Entidades.Aeroporto;


public class Guiche {
    private String numero;
    private String companhiaAerea;
    private String localizacao;
    
    //construtor para inicialização classe
    public Guiche(String numero, String companhiaAerea, String localizacao) {
        this.numero = numero;
        this.companhiaAerea = companhiaAerea;
        this.localizacao = localizacao;
    }
    //getters
    public String getNumero() {
        return numero;
    }

    public String getCompanhiaAerea() {
        return companhiaAerea;
    }

    public String getLocalizacao() {
        return localizacao;
    }
 //função override que retorna informações do guiche
    @Override
    public String toString() {
    	String detalhes = "\n---------------------------------------\n" + "Numero: " + numero + "\n";
    	detalhes += "Companhia Aérea: " + companhiaAerea + "\n";
    	detalhes += "Localização: " + localizacao + "\n" ;
    	return detalhes;
    }
}
