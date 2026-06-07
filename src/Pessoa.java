public abstract class Pessoa {
    public String nome;
    public String cpf;
    public String telefone;
    public String dataNascimento;

    public Pessoa(String nome, String cpf, String telefone, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public abstract String exibirResumo();
}