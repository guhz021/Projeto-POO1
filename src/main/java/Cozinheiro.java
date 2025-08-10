//Gustavo Alves de Aquino 2503646

public class Cozinheiro extends Pessoa {
    private String especialidade;
    private String turno;
    private double salario;

    public Cozinheiro() {
        super();
	this.especialidade = "";
        this.turno = "";
        this.salario = 0.0;
    }

    // Gets
    public String getEspecialidade() {
        return especialidade;
    }

    public String getTurno() {
        return turno;
    }

    public double getSalario() {
        return salario;
    }

    // Sets
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
