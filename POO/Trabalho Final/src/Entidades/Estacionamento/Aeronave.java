package Entidades.Estacionamento;

import java.time.LocalDateTime;


public class Aeronave {
    private String placa;
    private String modelo;
    private String cor;
    private String tamanho;
    private String destino;
    private String companhia;
    private String status;
    private LocalDateTime horarioEntrada;
    private LocalDateTime horarioSaida;
    private LocalDateTime previsaoPartida;
    //construtor para inicializar a classe
    public Aeronave(String placa, String modelo, String cor, String tamanho, String destino, String companhia, LocalDateTime previsaoPartida) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.tamanho = tamanho;
        this.destino = destino;
        this.companhia = companhia;
        this.previsaoPartida = previsaoPartida;
    }
    //getters e setters
    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void atualizarHorarioSaida(LocalDateTime horarioSaida) {
        this.horarioSaida = horarioSaida;
    }
	//função que retorna informações da aeronave
	@Override
    public String toString() {
        String informacoes = "---------------------------------------\n"+"Placa: " + placa + "\n";
        informacoes += "Modelo: " + modelo + "\n";
        informacoes += "Cor: " + cor + "\n";
        informacoes += "Tamanho: " + tamanho + "\n";
        informacoes += "Destino: " + destino + "\n";
        informacoes += "Companhia: " + companhia + "\n";
        informacoes += "Horário de entrada: " + horarioEntrada + "\n";
        informacoes += "Horário de saída: " + horarioSaida + "\n";
        informacoes += "Previsão de partida: " + previsaoPartida + "\n---------------------------------------\n";

        return informacoes;
    }
	//getters e setters
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalDateTime getPrevisaoPartida() {
        return previsaoPartida;
    }

    public void setPrevisaoPartida(LocalDateTime previsaoPartida) {
        this.previsaoPartida = previsaoPartida;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }
}
