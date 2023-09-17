
public class Main {

	public static void main(String[] args) {
		Ave pato = new Pato();
        Pavao pavao = new Pavao();
        Ave pavaoAdapter = new PavaoAdapter(new Pavao());
        
        System.out.println("Pato:");
        pato.voar();
        pato.emitirSom();

        System.out.println("\nPavao:");
        pavao.emitirSom();

        System.out.println("\nPavao Adapter:");
        pavaoAdapter.voar();
        pavaoAdapter.emitirSom();

	}

}
