public class Atendimento {
    public int indiceConsulta;
    private Prontuario prontuario;

    public Atendimento(int indiceConsulta, String observacoes) {
        this.indiceConsulta = indiceConsulta;
        this.prontuario = new Prontuario(observacoes, "");
    }

    public Atendimento(int indiceConsulta, String observacoes, String diagnostico) {
        this.indiceConsulta = indiceConsulta;
        this.prontuario = new Prontuario(observacoes, diagnostico);
    }

    public Atendimento(int indiceConsulta, String observacoes, String diagnostico,
                       String[] procedimentos, int totalProcedimentos) {
        this.indiceConsulta = indiceConsulta;
        this.prontuario = new Prontuario(observacoes, diagnostico);
        for (int i = 0; i < totalProcedimentos; i++) {
            this.prontuario.adicionarProcedimento(procedimentos[i]);
        }
    }

    public void adicionarProcedimento(String procedimento) {
        this.prontuario.adicionarProcedimento(procedimento);
    }

    public void adicionarProcedimento(String[] procs, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            this.prontuario.adicionarProcedimento(procs[i]);
        }
    }

    public String exibirResumo() {
        return this.prontuario.exibirResumo();
    }

    public String getDiagnostico() {
        return this.prontuario.getDiagnostico();
    }
}
