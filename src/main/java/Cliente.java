//Gustavo Alves de Aquino 2503646


public class Cliente extends Pessoa implements Telefone {
    private String telefone;
    private String endereco;

    public Cliente() {
        super();
        this.telefone = "";
        this.endereco = "";
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Gets
    public String getEndereco() {
        return endereco;
    }

    // Sets
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // POLIMORFISMO POR SOBRESCRITA
    public String getNome() {
        return super.getNome();
    }
}
