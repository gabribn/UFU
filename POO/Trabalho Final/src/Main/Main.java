package Main;
//Gabriel da Silva Reis, Tiago Oliveira Mendonça
import Entidades.Aeroporto.Guiche;
import Entidades.Aeroporto.Loja;

import Entidades.Estacionamento.Aeropista;
import Entidades.Estacionamento.Aeronave;
import Entidades.Estacionamento.Hangar;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	//declaração lojas presentes
        List<Loja> lojas = new ArrayList<>();
        lojas.add(new Loja("3 irmãos", "Venda de produtos artesanais", "Localização: ao lado do banheiro"));
        lojas.add(new Loja("Léo Maneiro Táxis", "Taxis maneiros para pessoas maneiras", "Localização: Em frente giche da Azul"));
        lojas.add(new Loja("Empório Aeroporto", "Conveniência, produtos gerais", "Localização: Em frente portão de desembarque"));
        //declaração guches
        List<Guiche> guiches = new ArrayList<>();
        guiches.add(new Guiche("Azul", "Companhia Aérea 1", "Localização: Em frente Léo Maneiro Taxis"));
        guiches.add(new Guiche("Latam", "Companhia Aérea 2", "Localização: Ao lado do portão de entrada"));
        guiches.add(new Guiche("Gol", "Companhia Aérea 3", "Localização: A direita do Empório Aeroporto"));
        //array auxiliar para verificar tamnho
        List<String> verifica = new ArrayList<>();
        verifica.add("Pequeno");
        verifica.add("Medio");
        verifica.add("Grande");
        //inicialização classes
        Aeropista aeropista = new Aeropista();
        Hangar hangar1 = new Hangar();
        Hangar hangar2 = new Hangar();
        
        String placa;
        String modelo;
        String cor;
        String tamanho;
        String destino;
        String companhia;
        LocalDateTime previsaoPartida;

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        //menu 
        while(opcao!=0) {
        	exibirMenuPrincipal();
        	opcao = scanner.nextInt();
        	
            switch (opcao) {
            	//adicionar aeronave
	            case 1:
	            	System.out.print("Placa: ");
            	    placa = scanner.next();

            	    System.out.print("Modelo: ");
            	    modelo = scanner.next();

            	    System.out.print("Cor(Nome/Hex/Rgb): ");
            	    cor = scanner.next();

            	    System.out.print("Tamanho(Pequeno,Medio,Grande): ");
            	    tamanho = scanner.next();
            	    //verificação tamnho 
            	    int supp2 = 0;
            	    for(int i=0; i<3;i++) {    	
            	    	if(tamanho.equals(verifica.get(i))) {
            	    		supp2++;
            	    	}
            	    }
            	    if(supp2==0) {
            	    	System.out.print("Tamnho não existente, avião invalidado\n");
            	    	break;
            	    }
            	    
            	    System.out.print("Destino: ");
            	    destino = scanner.next();

            	    System.out.print("Companhia(Azul,Latam,Gol): ");
            	    companhia = scanner.next();
            	    int supp = 0;
            	    //verificação companhia existente
            	    for(int i=0; i<3;i++) {    	
            	    	if(companhia.equals(guiches.get(i).getNumero())) {
            	    		supp++;
            	    	}
            	    }
            	    if(supp==0) {
            	    	System.out.print("Companhia não existente, avião invalidado\n");
            	    	break;
            	    }

            	    System.out.print("Previsão de Partida (AAAA-MM-DDTHH:MM, 2018-09-26T10:36): ");
            	    String previsaoPartidaStr = scanner.next();
            	    previsaoPartida = LocalDateTime.parse(previsaoPartidaStr);
            	    //inicializa uma aeronave 
            	    Aeronave aeronave = new Aeronave(placa, modelo, cor, tamanho, destino, companhia, previsaoPartida);
            	    aeropista.adicionarAeronave(aeronave);
            	    
            	    System.out.println("Aeronave armazenada com sucesso.");
            break;
	
	            case 2:
	            	//busca aeronave por placa
	            	System.out.println("Informe a placa da aeronave desejada: ");
	            	placa = scanner.next();
	            	//busca placa na aeropista
	            	Aeronave search = aeropista.buscarAeronavePorPlaca(placa);
	            	if(search == null) {
	            		//verifica se a nave esta no hangar1
	            		if(hangar1.getAeronave(placa) != null) {
	            			System.out.println(hangar1.getAeronave(placa));
	            		} //verifica se nave esta no hangar 2 
	            		else if(hangar2.getAeronave(placa) != null) {
	            			System.out.println(hangar2.getAeronave(placa));
	            		}
	            	} 
	            	else {
	            		System.out.println(search.toString());
	            	}
	            break;
	            //lista aronaves presentes no aeropoto e local que ela está.
	            case 3:
	            	System.out.println("\n Aeronaves na aeropista: ");
	            	aeropista.listarAeronaves();
	            	System.out.println("\n Aeronaves nos hangares: ");
	            	hangar1.listarAeronaves();
	            	hangar2.listarAeronaves();
	            break;
	            //remove aeronave da pista(decola)
	            case 4:
	            	//lista as aeronaves na aeropista e armazena valor 
	            	Boolean b = aeropista.listarAeronaves();
	            	//mesagem caso não existam naves na aeropista e retorna ao menu
	            	if(b==false) {
	            		System.out.println("Não há naves a serem reovidas.\n");
	            		break;
	            	}
	            	System.out.println("Informe a placa da aeronave que deseja remover da pista:");	
	            	placa = scanner.next();
	            	aeropista.moverAeronave(placa);
	            break;
	
	            case 5:
	            	//armazena no hangar
	       
	            	Boolean bol = aeropista.listarAeronaves();
	            	//mesagem caso não existam naves na aeropista e retorna ao menu
	            	if(bol==false) {
	            		System.out.println("Não há naves a serem movidas.\n");
	            		break;
	            	}
	            	System.out.println("Informe a placa da aeronave que deseja armazaenar no hangar");
	            	System.out.println("Placa:");
	            	placa = scanner.next();
	            	search = aeropista.buscarAeronavePorPlaca(placa);
	            	//placa nao existe, volta ao menu
	            	if(search==null) {
	            		break;
	            	}
	            	System.out.println("Qual hangar deseja armazenar a aeronave, 1 ou 2?");
	            	int num;
	            	num = scanner.nextInt();
	            	//armazena no hangar e remove da aeropista
	            	if(num == 1) {
	            		hangar1.armazenaAeronave(search);
	            		aeropista.moverAeronave(placa);
	            	}
	            	if(num == 2) {
	            		hangar2.armazenaAeronave(search);
	            		aeropista.moverAeronave(placa);
	            	} 
	            	if(num != 1 && num != 2) {
	            		System.out.println("Hangar inválido");
	            	}
	            break;
	            
	            case 6:
	            	//remover aronave do hangar
	            	System.out.println("Qual hangar deseja remover a aeronave, 1 ou 2?");
	            	num = scanner.nextInt();
	            	
	            	if(num == 1) {
	            		Boolean bol2 = hangar1.listarAeronaves();
	            		//verifica se ha naves no hangar
		            	if(bol2==false) {
		            		System.out.println("Não há naves a serem movidas.\n");
		            		break;
		            	}
		            	//coloca nave na aeropista, depois remove do hangar
	            		System.out.println("Informe a placa de aeronave que deseja remover: ");
	            		placa = scanner.next();
	            		Aeronave aux = hangar1.getAeronave(placa);
	            		aeropista.adicionarAeronave(aux);
	            		hangar1.removerAeronave(placa);
	            	}
	            	if(num == 2) {
	            		Boolean bol2 = hangar2.listarAeronaves();
	            		//verifica se ha naves no hangar
		            	if(bol2==false) {
		            		System.out.println("Não há naves a serem movidas.\n");
		            		break;
		            	}
		            	//coloca nave na aeropista, depois remove do hangar
	            		System.out.println("Informe a placa de aeronave que deseja remover: ");
	            		placa = scanner.next();
	            		Aeronave aux = hangar2.getAeronave(placa);
	            		aeropista.adicionarAeronave(aux);
	            		hangar2.removerAeronave(placa);
	            	}
	            	if(num != 1 && num != 2) {
	            		System.out.println("Hangar inválido");
	            	}
	            break;
	            
	            case 7:
	            	//printa menu de lojas
	            	System.out.println("Informe qual loja deseja ver detalhes: ");
	            	for(int i = 0; i < lojas.size(); i++) {
	            		System.out.println((i + 1) + ": " + lojas.get(i).getNome());
	            	}
	            	int loja = scanner.nextInt();
	            	//retorna informações das lojas
	            	switch(loja) {
	            		case 1:
	            			System.out.println(lojas.get(0).toString());
	            		break;
	            		
	            		case 2:
	            			System.out.println(lojas.get(1).toString());
	            		break;
	            		
	            		case 3:
	            			System.out.println(lojas.get(2).toString());
	            		break;
	            		
	            		default:
	            			System.out.println("Escolha inválida!");
	            		break;
	            	}
	            break;
	            
	            case 8:
	            	//printa menu de guiches
	            	System.out.println("Informe qual guichê deseja ver detalhes: ");
	            	for(int i = 0; i < guiches.size(); i++) {
	            		System.out.println((i + 1) + ": " + guiches.get(i).getNumero());
	            	}
	            	int guiche = scanner.nextInt();
	            	//retorna informações dos giches
	            	switch(guiche) {
	            	case 1:
	            		System.out.println(guiches.get(0).toString());  		
	            	break;
	            	
	            	case 2:
	            		System.out.println(guiches.get(1).toString());
	            	break;
	            	
	            	case 3:
	            		System.out.println(guiches.get(2).toString());
	            	break;
	            	
	            	default:
	            		System.out.println("Escolha inválida!");
	            	break;
	            	}
	            	break;
	            
	            case 0:
	            	System.exit(0);
	            break;

	            default:
	            	System.out.println("Opção inválida!");
	            break;
            }
        }
        
        scanner.close();
    }
        
    	//menu
    private static void exibirMenuPrincipal() {
        System.out.println("----- Aeroporto -----\n");
        System.out.println("1. Adicionar Aeronave.");
        System.out.println("2. Buscar Aeronave por Placa.");
        System.out.println("3. Listar Aeronaves.");
        System.out.println("4. Remover Aeronave da Pista(Decolar).");
        System.out.println("5. Armazenar Aeronave no Hangar.");
        System.out.println("6. Remover Aeronave do Hangar.");
        System.out.println("7. Exibir Lojas.");
        System.out.println("8. Exibir Guichês.");
        System.out.println("0. Sair.");
        System.out.print("Escolha uma opção: ");
    }

}

