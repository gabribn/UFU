
public class LeiteDecorator implements Beb {
	private Beb bebida;
	
	public LeiteDecorator(Beb bebida) {
		this.bebida = bebida;
	}
	
	@Override
	public double calculaCusto() {
		return bebida.calculaCusto() + 0.5;
	}
	
	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", com leite";
	}
}