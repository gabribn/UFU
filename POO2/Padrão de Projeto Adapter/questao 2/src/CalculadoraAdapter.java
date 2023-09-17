
public class CalculadoraAdapter{
	
	private CalculadoraBinaria calculadoraBinaria;

    public CalculadoraAdapter() {
        this.calculadoraBinaria = new CalculadoraBinaria();
    }

    public int somar(int a, int b) {

        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);
        String resultadoBinario = calculadoraBinaria.soma(binA, binB);

        return Integer.parseInt(resultadoBinario, 2);
    }

    public int subtrair(int a, int b) {
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);
        String resultadoBinario = calculadoraBinaria.sub(binA, binB);

        return Integer.parseInt(resultadoBinario, 2);
    }
}
