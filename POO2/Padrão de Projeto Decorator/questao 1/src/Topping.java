public class Topping implements Pizza {
	private Pizza pizza;
	private String topping;
	
	public Topping(Pizza pizza, String topping) {
		this.pizza = pizza;
		this.topping = topping;
	}
	
	@Override
	public String fazerPizza() {
		return pizza.fazerPizza() + ", com " + topping;
	}
}