package questao2;

public class Main {
    public static void main(String[] args) {
        CarroFachada meuCarro = new CarroFachada();
        meuCarro.iniciarCorrida();
        System.out.println("\nCarro andando\n");
        meuCarro.finalizarCorrida();
    }
}
