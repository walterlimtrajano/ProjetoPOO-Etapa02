public class Psicologo extends Profissional {
    private String crp;

    public Psicologo(String nome, String cpf, String telefone, String dataNascimento, 
                     String registroProfissional, double valorConsulta, String crp) {
        super(nome, cpf, telefone, dataNascimento, "psicologia", registroProfissional, valorConsulta);
        this.crp = crp;
    }

    @Override
    public String exibirResumo() {
        return super.exibirResumo() + " | CRP: " + crp;
    }

    public String getCrp() {
        return crp;
    }

    public void setCrp(String crp) {
        this.crp = crp;
    }
}