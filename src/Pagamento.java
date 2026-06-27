public abstract class Pagamento implements Exportavel {
    public int indiceConsulta;
    public double valorBase;
    public double valorFinal;
    public String tipoPagamento;
    public int parcelas;

    public Pagamento(int indiceConsulta, double valorBase, String tipoPagamento) {
        this.indiceConsulta = indiceConsulta;
        this.valorBase = valorBase;
        this.valorFinal = valorBase;
        this.tipoPagamento = tipoPagamento;
        this.parcelas = 1;
    }

    // cada tipo de pagamento calcula o valor final do seu jeito (polimorfismo)
    public abstract double calcularValorFinal() throws ConvenioNaoCobreException;

    // sem desconto nenhum
    public static double calcularValor(double valorBase) {
        return valorBase;
    }

    // com desconto em percentual
    public static double calcularValor(double valorBase, double percentualDesconto) {
        double desconto = valorBase * percentualDesconto / 100;
        double valor = valorBase - desconto;
        if (valor < 0) {
            valor = 0;
        }
        return valor;
    }

    // com desconto e multa somada
    public static double calcularValor(double valorBase, double percentualDesconto, double multa) {
        double desconto = valorBase * percentualDesconto / 100;
        double valor = valorBase - desconto + multa;
        if (valor < 0) {
            valor = 0;
        }
        return valor;
    }

    public String exibirResumo() {
        // arredonda pra 2 casas
        double valorArredondado = Math.round(valorFinal * 100.0) / 100.0;
        String resumo = "Consulta #" + indiceConsulta + " | Valor: R$" + valorArredondado
                + " | Tipo: " + tipoPagamento + " | Parcelas: " + parcelas;
        if (parcelas > 1) {
            double valorParcela = Math.round((valorFinal / parcelas) * 100.0) / 100.0;
            resumo = resumo + " (R$" + valorParcela + " cada)";
        }
        return resumo;
    }

    @Override
    public String exportarDados() {
        double valorArredondado = Math.round(valorFinal * 100.0) / 100.0;
        return indiceConsulta + ";" + tipoPagamento + ";" + valorArredondado + ";" + parcelas;
    }
}
