
public class CanelaDec implements Beb {
    private Beb bebida;

    public CanelaDec(Beb bebida) {
        this.bebida = bebida;
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 0.3;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com canela";
    }
}
