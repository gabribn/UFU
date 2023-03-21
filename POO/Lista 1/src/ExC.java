

import java.util.Scanner;

import entities.ClassC;

public class ExC {
    
    public static void main(String a[]) {
        
        int op = -1;
        Scanner s= new Scanner(System.in);
        ClassC v[] = new ClassC[10];
        int ct = 0;
        
        do {
            System.out.println("1) Inserir triangulo;");
            System.out.println("2) Mostrar triangulos cadastrados;");
            System.out.println("3) Mostrar o numero de triangulos equilateros;");
            System.out.println("4) Mostrar o triangulo cadastrado com o maior perimetro.");
            System.out.print("OPCAO: ");
            op = s.nextInt();
            switch (op) {
                case 1:
                    int l1, l2, l3;
                    System.out.print("Lado 1: ");
                    l1 = s.nextInt();
                    System.out.print("Lado 2: ");
                    l2 = s.nextInt();
                    System.out.print("Lado 3: ");
                    l3 = s.nextInt();
                    v[ct] = new ClassC();
                    v[ct].setL1(l1);
                    v[ct].setL2(l2);
                    v[ct].setL3(l3);
                    ct++;
                    break;
                case 2:
                    for (int i=0;i<ct;i++)
                        System.out.println(v[i].mostraDados());
                    break;
                case 3:
                    int total = 0;
                    for (int i=0;i<ct;i++)
                        if (v[i].retornaTipo().equals("equilatero"))
                            total++;
                    System.out.println("Total de triangulos equilateros: "+total+".");
                    break;
                case 4:
                    if (ct > 0) {
                        ClassC maior = v[0];
                        for (int i=1;i<ct;i++)
                            if (v[i].retornaPerimetro() > maior.retornaPerimetro())
                                maior = v[i];
                        System.out.println("Maior perimetro: "+maior.mostraDados()+".");
                    }
            }
        }while (op != 5);
        s.close();
    }
    
}