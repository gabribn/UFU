package Entidades.Aeroporto;

public class Loja {
    private String nome;
    private String descricao;
    private String localizacao;
    //construtor para inicialização classe
    public Loja(String nome, String descricao, String localizacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.localizacao = localizacao;
    }
    //getters
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getLocalizacao() {
        return localizacao;
    }
    //função override que retorna informações do guiche
    @Override
    public String toString() {
    	String detalhes = "\n---------------------------------------\n" + "Nome: " + nome + "\n";
    	detalhes += "Descrição: " + descricao + "\n";
    	detalhes += localizacao + "\n---------------------------------------\n";
    	return detalhes;
    }
}

