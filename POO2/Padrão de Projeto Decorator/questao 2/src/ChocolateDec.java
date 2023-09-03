
public class ChocolateDec implements Beb{
    private Beb bebida;

    public ChocolateDec(Beb bebida) {
        this.bebida = bebida;
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 0.7; 
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com chocolate";
    }
}
