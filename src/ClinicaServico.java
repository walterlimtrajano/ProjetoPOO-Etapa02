import java.util.*;

public class ClinicaServico {

    private Map<String, Paciente> pacientes = new HashMap<>();
    private Map<String, Profissional> profissionais = new HashMap<>();
    private List<Consulta> consultas = new ArrayList<>();

    public ClinicaServico() {
    }

    public Paciente buscarPacientePorCpf(String cpf) {
        return pacientes.get(cpf);
    }

    public Profissional buscarProfissionalPorNome(String nome) {
        return profissionais.get(nome);
    }

    public boolean existeConflito(String profissional, String data, String horario) {
        for (Consulta c : consultas) {
            if (c.nomeProfissional.equals(profissional)
                    && c.data.equals(data)
                    && c.horario.equals(horario)
                    && c.status.equals("agendada")) {
                return true;
            }
        }
        return false;
    }
}
