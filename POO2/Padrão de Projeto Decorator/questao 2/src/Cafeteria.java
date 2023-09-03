
public class Cafeteria {
	public static void main(String[] args) {
		
        Beb beb = new LeiteDecorator(new CanelaDec(new Espresso()));
        System.out.println("Pedido: " + beb.getDescricao() + ", custo: R$" + beb.calculaCusto());
    }
}