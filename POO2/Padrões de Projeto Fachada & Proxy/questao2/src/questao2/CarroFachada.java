package questao2;

class CarroFachada {
    private Motor motor;
    private Cinto cinto;
    private Porta porta;
    private Farol farol;
    private Radio radio;

    public CarroFachada() {
        this.motor = new Motor();
        this.cinto = new Cinto();
        this.porta = new Porta();
        this.farol = new Farol();
        this.radio = new Radio();
    }

    public void iniciarCorrida() {
        motor.ligar();
        porta.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizar("Minha Estação Favorita");
    }

    public void finalizarCorrida() {
        motor.desligar();
        porta.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
    }
}
