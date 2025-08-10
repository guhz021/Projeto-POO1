//Gustavo Alves de Aquino 2503646

public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa() {
        this.nome = "";
        this.cpf = "";
    }

    // Gets
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    // Sets
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) throws CPFInvalidoException {
        if (cpf.length() != 11) {
            throw new CPFInvalidoException("CPF deve ter 11 dígitos.");
        }
        this.cpf = cpf;
    }
}