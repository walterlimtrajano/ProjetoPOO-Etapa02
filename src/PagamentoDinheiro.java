public class PagamentoDinheiro extends Pagamento {
    private double percentualDesconto;

    public PagamentoDinheiro(int indiceConsulta, double valorBase) {
        super(indiceConsulta, valorBase, "dinheiro");
        this.percentualDesconto = 10;
    }

    public PagamentoDinheiro(int indiceConsulta, double valorBase, double percentualDesconto) {
        super(indiceConsulta, valorBase, "dinheiro");
        this.percentualDesconto = percentualDesconto;
    }

    // Jornada 21: pagamento a vista ganha desconto
    @Override
    public double calcularValorFinal() {
        double desconto = valorBase * percentualDesconto / 100;
        valorFinal = valorBase - desconto;
        if (valorFinal < 0) {
            valorFinal = 0;
        }
        return valorFinal;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
}
