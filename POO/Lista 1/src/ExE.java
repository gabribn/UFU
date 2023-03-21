import java.util.Scanner;
import entities.ClassE;

public class ExE {

	public static void main(String[] args) {
		String nome;
		long cpf,telefone;
		int idade;
		Scanner s = new Scanner( System.in );
		
		System.out.println("Cadastro de cliente");
        System.out.println("Nome do cliente:");
        nome = s.nextLine();

        System.out.println("CPF do cliente:");
        cpf = s.nextLong();

        System.out.println("Idade do cliente:");
        idade = s.nextInt();

        System.out.println("Telefone do cliente:");
        telefone = s.nextLong();
		
		ClassE cadastro = new ClassE(nome,cpf,idade,telefone);
		
		cadastro.mostrarDados();
		
		s.close();
	}

}
