



public class Main {
	public static void main(String[] args) {
		Pizza pizza1 = new Topping(new Topping(new MassaFinaPizza(), "queijo"), "tomate");
		System.out.println("Pedido 1: " + pizza1.fazerPizza());
		
		Pizza pizza2 = new Topping(new Topping(new Topping(new MassaEspressaPizza(), "queijo"),"ovo"),"tomate");
		System.out.println("Pedido 2: " + pizza2.fazerPizza());
	}
}