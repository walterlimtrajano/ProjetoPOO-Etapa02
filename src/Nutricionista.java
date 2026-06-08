public class Nutricionista extends Profissional {
    public String crn;

    public Nutricionista(String nome, String cpf, String telefone, String dataNascimento, 
                         String registroProfissional, double valorConsulta, String crn) {
        super(nome, cpf, telefone, dataNascimento, "nutricao", registroProfissional, valorConsulta);
        this.crn = crn;
    }

    @Override
    public String exibirResumo() {
        return super.exibirResumo() + " | CRN: " + crn;
    }
}