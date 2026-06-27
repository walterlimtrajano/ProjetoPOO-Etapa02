import java.util.ArrayList;
import java.util.List;

public class Prontuario {
    private String observacoes;
    private String diagnostico;
    private List<String> procedimentos = new ArrayList<>();

    public Prontuario(String observacoes, String diagnostico) {
        this.observacoes = observacoes;
        this.diagnostico = diagnostico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void adicionarProcedimento(String procedimento) {
        procedimentos.add(procedimento);
    }

    public String exibirResumo() {
        String resumo = "Observacoes: " + observacoes;
        if (!diagnostico.isEmpty()) {
            resumo += "\nDiagnostico: " + diagnostico;
        }
        if (!procedimentos.isEmpty()) {
            resumo += "\nProcedimentos: " + String.join(", ", procedimentos);
        }
        return resumo;
    }
}
