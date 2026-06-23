public class ClinicaServico {

    private Paciente[] pacientes;
    private int totalPacientes;

    private Profissional[] profissionais;
    private int totalProfissionais;

    private Consulta[] consultas;
    private int totalConsultas;

    public ClinicaServico(
            Paciente[] pacientes,
            int totalPacientes,
            Profissional[] profissionais,
            int totalProfissionais,
            Consulta[] consultas,
            int totalConsultas) {

        this.pacientes = pacientes;
        this.totalPacientes = totalPacientes;
        this.profissionais = profissionais;
        this.totalProfissionais = totalProfissionais;
        this.consultas = consultas;
        this.totalConsultas = totalConsultas;
    }

    public int buscarPacientePorCpf(String cpf) {
        for (int i = 0; i < totalPacientes; i++) {
            if (pacientes[i].getCpf().equals(cpf)) {
                return i;
            }
        }
        return -1;
    }

    public int buscarProfissionalPorNome(String nome) {
        for (int i = 0; i < totalProfissionais; i++) {
            if (profissionais[i].getNome().equals(nome)) {
                return i;
            }
        }
        return -1;
    }

    public boolean existeConflito(String profissional, String data, String horario) {
        for (int i = 0; i < totalConsultas; i++) {

            if (consultas[i].nomeProfissional.equals(profissional)
                    && consultas[i].data.equals(data)
                    && consultas[i].horario.equals(horario)
                    && consultas[i].status.equals("agendada")) {

                return true;
            }
        }
        return false;
    }
}