package Entidades.Aeroporto;
import Entidades.Estacionamento.Aeronave;

import java.time.LocalDateTime;

public class Manutencao {
    private LocalDateTime ultimaManutencao;
    private int contadorAeronaves;
    //Construtor para inicializar classe 
    public Manutencao() {
        this.ultimaManutencao = LocalDateTime.now();;
        this.contadorAeronaves = 0;
    }
    //atualiza data da ultima manutenção 
    public void realizarManutencao() {
        ultimaManutencao = LocalDateTime.now();
        System.out.println("\n-------------------------\n"+"Limpeza de aeroporto realizada"+ "\n-------------------------\n");
    }
    //função que a cada 3 aeronaves desmbarcadas realiza limpesa
    public void verificarNecessidadeManutencao(Aeronave aeronave) {
        contadorAeronaves++;
        if (contadorAeronaves % 3 == 0) {
            realizarManutencao();
        }
    }
}
