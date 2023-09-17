
class PavaoAdapter implements Ave {
    private Pavao pavao;

    public PavaoAdapter(Pavao pavao) {
        this.pavao = pavao;
    }

    @Override
    public void voar() {
        System.out.println("Pavao nao pode voar");
    }

    @Override
    public void emitirSom() {
        pavao.emitirSom();
    }
}