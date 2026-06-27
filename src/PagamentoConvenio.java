public class PagamentoConvenio extends Pagamento {
    private String nomeConvenio;
    private double percentualCobertura;

    public PagamentoConvenio(int indiceConsulta, double valorBase, String nomeConvenio, double percentualCobertura) {
        super(indiceConsulta, valorBase, "convenio");
        this.nomeConvenio = nomeConvenio;
        this.percentualCobertura = percentualCobertura;
    }

    // Jornada 23: se o convenio nao cobre, lanca excecao. Senao paga so a diferenca
    @Override
    public double calcularValorFinal() throws ConvenioNaoCobreException {
        if (percentualCobertura <= 0) {
            throw new ConvenioNaoCobreException("O convenio " + nomeConvenio + " nao cobre este procedimento.");
        }
        double coberto = valorBase * percentualCobertura / 100;
        valorFinal = valorBase - coberto;
        if (valorFinal < 0) {
            valorFinal = 0;
        }
        return valorFinal;
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }

    public double getPercentualCobertura() {
        return percentualCobertura;
    }

    public void setPercentualCobertura(double percentualCobertura) {
        this.percentualCobertura = percentualCobertura;
    }
}
