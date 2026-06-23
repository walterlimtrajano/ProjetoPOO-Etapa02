public class RelatorioUnificadoCadastros {
    
    public static void gerar(
            Paciente[] pacientes,
            int totalPacientes,
            Profissional[] profissionais,
            int totalProfissionais) {

        System.out.println("\n=== RELATORIO UNIFICADO DE CADASTROS ===");

        Pessoa[] pessoas =
                new Pessoa[totalPacientes + totalProfissionais];

        int indice = 0;

        for (int i = 0; i < totalPacientes; i++) {
            pessoas[indice++] = pacientes[i];
        }

        for (int i = 0; i < totalProfissionais; i++) {
            pessoas[indice++] = profissionais[i];
        }

        for (Pessoa pessoa : pessoas) {

            if (pessoa instanceof Paciente) {

                Paciente paciente = (Paciente) pessoa;

                System.out.println(
                        "[PACIENTE] "
                        + paciente.exibirResumo());

            } else if (pessoa instanceof Profissional) {

                Profissional profissional = (Profissional) pessoa;

                System.out.println(
                        "[PROFISSIONAL] "
                        + profissional.exibirResumo());
            }
        }
    }
}
