
public class Main {

	public static void main(String[] args) {
        CalculadoraAdapter calculadora = new CalculadoraAdapter();

        int decimal = calculadora.somar(5, 5);
        System.out.println("Soma: " + decimal);

        decimal = calculadora.subtrair(10, 5);
        System.out.println("Subtração: " + decimal);

        //nao consegui implementar multiplicação com numeros binarios.
	}

}
