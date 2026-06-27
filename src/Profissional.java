import java.util.ArrayList;
import java.util.List;

public abstract class Profissional extends Pessoa {
    private String especialidade;
    private String registroProfissional;
    private double valorConsulta;
    private List<String> horariosDisponiveis = new ArrayList<>();

    // so nome e especialidade
    public Profissional(String nome, String cpf, String telefone, String dataNascimento, String especialidade) {
        super(nome, cpf, telefone, dataNascimento);
        this.especialidade = especialidade;
        this.registroProfissional = "";
        this.valorConsulta = 0;
    }

    public Profissional(String nome, String cpf, String telefone, String dataNascimento, String especialidade, String registroProfissional, double valorConsulta) {
        super(nome, cpf, telefone, dataNascimento);
        this.especialidade = especialidade;
        this.registroProfissional = registroProfissional;
        this.valorConsulta = valorConsulta;
    }

    // construtor completo com dias
    public Profissional(String nome, String cpf, String telefone, String dataNascimento, String especialidade, String registroProfissional,
                        double valorConsulta, String[] dias, int totalDias) {
        super(nome, cpf, telefone, dataNascimento);
        this.especialidade = especialidade;
        this.registroProfissional = registroProfissional;
        this.valorConsulta = valorConsulta;
        for (int i = 0; i < totalDias; i++) {
            this.horariosDisponiveis.add(dias[i]);
        }
    }

    public void atualizar(String registro, double valor) {
        this.registroProfissional = registro;
        this.valorConsulta = valor;
    }

    public void atualizar(String registro, double valor, String[] dias, int totalDias) {
        this.registroProfissional = registro;
        this.valorConsulta = valor;
        this.horariosDisponiveis.clear();
        for (int i = 0; i < totalDias; i++) {
            this.horariosDisponiveis.add(dias[i]);
        }
    }

    // verifica se o profissional atende naquele dia
    public boolean atendeNoDia(String dia) {
        return horariosDisponiveis.contains(dia);
    }

    // valida as especialidades aceitas pela clinica
    public static boolean especialidadeValida(String esp) {
        if (esp.equals("clinica geral")) return true;
        if (esp.equals("fisioterapia")) return true;
        if (esp.equals("psicologia")) return true;
        if (esp.equals("nutricao")) return true;
        return false;
    }

    public String exibirResumo() {
        return "Nome: " + getNome() + " | Espec: " + especialidade + " | Reg: " + registroProfissional
                + " | Valor: R$" + valorConsulta + " | Dias: " + String.join(", ", horariosDisponiveis);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
}