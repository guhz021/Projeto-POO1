//Gustavo Alves de Aquino 2503646

public class Pizzaria {
    private int num;
    private String rua;
    private String bairro;

    public Pizzaria() {
        num = 1527;
        rua = "Alameda da Paixão";
        bairro = "Copacabana";
    }

    // POLIMORFISMO POR SOBRECARGA
    public Pizzaria(int num, String rua, String bairro) {
        this.num = num;
        this.rua = rua;
        this.bairro = bairro;
    }

    public void setEndereco(int num) {
        this.num = num;
    }

    public void setEndereco(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    // Gets
    public int getNum() {
        return num;
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    // Sets
    public void setNum(int num) {
        this.num = num;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}