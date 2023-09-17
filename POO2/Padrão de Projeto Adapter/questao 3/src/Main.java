/*Crie um adpatador para adaptar uma tomada 110 em uma tomada 220*/
public class Main {

	public static void main(String[] args) {
		Tomada110 tomada110 = new Tomada110();
		Adaptador adaptador = new Adaptador(tomada110);

		adaptador.conectar220V();

	}

}
