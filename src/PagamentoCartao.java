public class PagamentoCartao extends Pagamento {
    private double jurosPorParcela;

    public PagamentoCartao(int indiceConsulta, double valorBase, int parcelas) {
        super(indiceConsulta, valorBase, "cartao");
        if (parcelas < 1) parcelas = 1;
        if (parcelas > 3) parcelas = 3;
        this.parcelas = parcelas;
        this.jurosPorParcela = 5;
    }

    // Jornada 22: parcelou acima de 1x paga juros
    @Override
    public double calcularValorFinal() {
        if (parcelas > 1) {
            double juros = valorBase * (jurosPorParcela / 100) * (parcelas - 1);
            valorFinal = valorBase + juros;
        } else {
            valorFinal = valorBase;
        }
        return valorFinal;
    }

    public double getValorParcela() {
        return Math.round((valorFinal / parcelas) * 100.0) / 100.0;
    }

    public double getJurosPorParcela() {
        return jurosPorParcela;
    }

    public void setJurosPorParcela(double jurosPorParcela) {
        this.jurosPorParcela = jurosPorParcela;
    }
}
