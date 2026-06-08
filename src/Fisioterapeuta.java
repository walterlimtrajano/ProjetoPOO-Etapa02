public class Fisioterapeuta extends Profissional {
    private String crefito;

    public Fisioterapeuta(String nome, String cpf, String telefone, String dataNascimento, 
                          String registroProfissional, double valorConsulta, String crefito) {
        super(nome, cpf, telefone, dataNascimento, "fisioterapia", registroProfissional, valorConsulta);
        this.crefito = crefito;
    }

    @Override
    public String exibirResumo() {
        return super.exibirResumo() + " | CREFITO: " + crefito;
    }

    public String getCrefito() {
        return crefito;
    }

    public void setCrefito(String crefito) {
        this.crefito = crefito;
    }
}