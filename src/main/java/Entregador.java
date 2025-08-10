//Gustavo Alves de Aquino 2503646

import javax.swing.JTextField;

public class Entregador extends Pessoa {
    private String placa;
    private String regiao;
    private double salario;

    public Entregador() {
        super();
        this.placa = "";
        this.regiao = "";
        this.salario = 0.0;
    }

    // Gets
    public String getPlaca() {
        return placa;
    }

    public String getRegiao() {
        return regiao;
    }

    public double getSalario() {
        return salario;
    }

    // Sets
    public void setPlaca(String placa) throws PlacaInvalidaException {
        if (!isPlacaValida(placa)) {
            throw new PlacaInvalidaException("A placa deve conter exatamente 4 letras e 3 números.");
        }
        this.placa = placa;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    private boolean isPlacaValida(String placa) {
        if (placa == null || placa.length() != 7) {
            return false;
        }

        int letrasCount = 0;
        int numerosCount = 0;

        for (char c : placa.toCharArray()) {
            if (Character.isLetter(c)) {
                letrasCount++;
            } else if (Character.isDigit(c)) {
                numerosCount++;
            } else {
                return false; 
            }
        }

        return letrasCount == 4 && numerosCount == 3;
    }

}
