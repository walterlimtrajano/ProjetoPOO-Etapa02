public class ClinicoGeral extends Profissional {
    private String crm;

    public ClinicoGeral(String nome, String cpf, String telefone, String dataNascimento, 
                        String registroProfissional, double valorConsulta, String crm) {
        super(nome, cpf, telefone, dataNascimento, "clinica geral", registroProfissional, valorConsulta);
        this.crm = crm;
    }

    @Override
    public String exibirResumo() {
        return super.exibirResumo() + " | CRM: " + crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}