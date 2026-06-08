public class Nutricionista extends Profissional {
    private String crn;

    public Nutricionista(String nome, String cpf, String telefone, String dataNascimento, 
                         String registroProfissional, double valorConsulta, String crn) {
        super(nome, cpf, telefone, dataNascimento, "nutricao", registroProfissional, valorConsulta);
        this.crn = crn;
    }

    @Override
    public String exibirResumo() {
        return super.exibirResumo() + " | CRN: " + crn;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }
}