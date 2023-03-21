package entities;

public class ClassE {
	String nome;
	long cpf;
	int idade;
	long telefone;
	
	public ClassE(String nome, long cpf, int idade, long telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}
	public long getCpf() {
		return cpf;
	}
	public int getIdade() {
		return idade;
	}
	public long getTelefone() {
		return telefone;
	}

	public void mostrarDados() {
		System.out.println("Nome: "+ nome);
		System.out.println("Cpf: "+cpf);
		System.out.println("Idade: "+idade);
		System.out.println("Telefone: "+telefone);
	}
	
	}
