import java.util.*;

public class ClinicaServico {

    private Map<String, Paciente> pacientes = new HashMap<>();
    private Set<String> cpfsCadastrados = new HashSet<>();
    private Map<String, Profissional> profissionais = new HashMap<>();
    private List<Consulta> consultas = new ArrayList<>();

    public ClinicaServico() {
    }

    public void adicionarPaciente(Paciente paciente) {
        if (!cpfsCadastrados.contains(paciente.getCpf())) {
            pacientes.put(paciente.getCpf(), paciente);
            cpfsCadastrados.add(paciente.getCpf());
        }
    }

    public Paciente buscarPacientePorCpf(String cpf) {
        return pacientes.get(cpf);
    }
    
    public boolean cpfExiste(String cpf) {
        return cpfsCadastrados.contains(cpf);
    }

    public Profissional buscarProfissionalPorNome(String nome) {
        return profissionais.get(nome);
    }
    
    public void adicionarProfissional(Profissional p) {
        profissionais.put(p.getNome(), p);
    }
    
    public void adicionarConsulta(Consulta c) {
        consultas.add(c);
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
