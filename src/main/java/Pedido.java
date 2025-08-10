public class Pedido {
    private Cliente cliente;
    private Cozinheiro cozinheiro;
    private Entregador entregador;
    private String prato;
    private String bebida;
    private int tempoPreparo;

    public Pedido() {
        this.cliente = cliente;
        this.cozinheiro = cozinheiro;
        this.entregador = entregador;
        this.prato = prato;
        this.bebida = bebida;
	this.tempoPreparo = 0;
     }	


    // Gets
    public Cliente getCliente() {
        return cliente;
    }

    public Cozinheiro getCozinheiro() {
        return cozinheiro;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public String getPrato() {
        return prato;
    }

    public String getBebida() {
        return bebida;
    }
    
    public int getTempoPreparo() {
        return tempoPreparo;
    }

    // Sets
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCozinheiro(Cozinheiro cozinheiro) {
        this.cozinheiro = cozinheiro;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }
}
