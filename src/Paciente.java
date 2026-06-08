public class Paciente extends Pessoa {
    public int idade;
    public String convenioNome;
    public boolean ativo;

    public Paciente(String nome, String cpf, String telefone, String dataNascimento) {
        super(nome, cpf, telefone, dataNascimento);
        this.idade = 0;
        this.convenioNome = "";
        this.ativo = true;
    }

    public Paciente(String nome, String cpf, String telefone, String dataNascimento, int idade) {
        super(nome, cpf, telefone, dataNascimento);
        this.idade = idade;
        this.convenioNome = "";
        this.ativo = true;
    }

    // construtor com todos os dados
    public Paciente(String nome, String cpf, String telefone, String dataNascimento, int idade, String convenioNome) {
        super(nome, cpf, telefone, dataNascimento);
        this.idade = idade;
        this.convenioNome = convenioNome;
        this.ativo = true;
    }

    // atualiza so idade e telefone
    public void complementar(int idade, String telefone) {
        this.idade = idade;
        this.setTelefone(telefone);
    }

    // atualiza tudo incluindo convenio
    public void complementar(int idade, String telefone, String convenioNome) {
        this.idade = idade;
        this.setTelefone(telefone);
        this.convenioNome = convenioNome;
    }

    public void desativar() {
        this.ativo = false;
    }

    public String exibirResumo() {
        String status = "Sim";
        if (!ativo) {
            status = "Nao";
        }
        return "Nome: " + this.getNome() + " | CPF: " + this.getCpf() + " | Idade: " + this.idade
                + " | Tel: " + this.getTelefone() + " | Convenio: " + this.convenioNome
                + " | Ativo: " + status;
    }
}