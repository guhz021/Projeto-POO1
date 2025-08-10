
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BdPizzaria {

    private static BdPizzaria instanciaUnica;
    private List<Cozinheiro> bdCozinheiros;
    private List<Entregador> bdEntregadores;
    private List<Pedido> bdPedidos;

    //=================== Início Singleton BdPizzaria ===============
    BdPizzaria() {
        bdCozinheiros = new ArrayList<>();
        bdEntregadores = new ArrayList<>();
        bdPedidos = new ArrayList<>();
    }

    public static BdPizzaria getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new BdPizzaria();
        }
        return instanciaUnica;
    }
    //====================== Fim Singleton BdPizzaria ===============

    // Gerenciar Cozinheiros
    public List<Cozinheiro> getBdCozinheiros() {
        return bdCozinheiros;
    }

    public Cozinheiro cadCozinheiro(Cozinheiro cozinheiro) {
        if (cozinheiro != null && consCozinheiroCpf(cozinheiro) == null) {
            bdCozinheiros.add(cozinheiro);
            return cozinheiro;
        }
        return null;
    }

    public Cozinheiro consCozinheiroCpf(Cozinheiro cozinheiro) {
        if (cozinheiro == null || cozinheiro.getCpf() == null) {
            return null;
        }
        for (Cozinheiro c : bdCozinheiros) {
            if (cozinheiro.getCpf().trim().equals(c.getCpf().trim())) {
                return c;
            }
        }
        return null;
    }

    public Cozinheiro removeCozinheiroCpf(String cpf) {
        for (Cozinheiro c : bdCozinheiros) {
            if (c.getCpf().trim().equals(cpf.trim())) {
                bdCozinheiros.remove(c);
                return c;
            }
        }
        return null;
    }

    public Cozinheiro atualizaCozinheiroCpf(Cozinheiro cozinheiro) {
        if (cozinheiro == null) {
            return null;
        }
        for (int i = 0; i < bdCozinheiros.size(); i++) {
            if (cozinheiro.getCpf().equals(bdCozinheiros.get(i).getCpf())) {
                bdCozinheiros.set(i, cozinheiro);
                return bdCozinheiros.get(i);
            }
        }
        return null;
    }

    // Gerenciar Entregadores
    public List<Entregador> getBdEntregadores() {
        return bdEntregadores;
    }

    public Entregador cadEntregador(Entregador entregador) {
        if (entregador != null && consEntregadorCpf(entregador) == null) {
            bdEntregadores.add(entregador);
            return entregador;
        }
        return null;
    }

    public Entregador consEntregadorCpf(Entregador entregador) {
        if (entregador == null || entregador.getCpf() == null) {
            return null;
        }
        for (Entregador e : bdEntregadores) {
            if (entregador.getCpf().trim().equals(e.getCpf().trim())) {
                return e;
            }
        }
        return null;
    }

    public Entregador removeEntregadorCpf(String cpf) {
        for (Entregador e : bdEntregadores) {
            if (e.getCpf().trim().equals(cpf.trim())) {
                bdEntregadores.remove(e);
                return e;
            }
        }
        return null;
    }

    public Entregador atualizaEntregadorCpf(Entregador entregador) {
        if (entregador == null) {
            return null; 
        }
        for (int i = 0; i < bdEntregadores.size(); i++) {
            if (entregador.getCpf().equals(bdEntregadores.get(i).getCpf())) {
                bdEntregadores.set(i, entregador);
                return bdEntregadores.get(i);
            }
        }
        return null;
    }

    // Gerenciar Pedidos
    public List<Pedido> getBdPedidos() {
        return bdPedidos;
    }

    public Pedido cadPedido(Pedido pedido) {
        if (pedido != null && consPedido(pedido) == null) {
            bdPedidos.add(pedido);
            return pedido;
        }
        return null;
    }

    public Pedido consPedido(Pedido pedido) {
        if (pedido == null || pedido.getCliente() == null || pedido.getCliente().getCpf() == null) {
            return null;
        }
        for (Pedido p : bdPedidos) {
            if (pedido.getCliente().getCpf().trim().equals(p.getCliente().getCpf().trim())) {
                return p;
            }
        }
        return null;
    }

    public Pedido consPedidoPorCpf(String cpf) {
        if (cpf == null || cpf.trim().isEmpty()) {
            return null;
        }

        cpf = cpf.trim(); 
        for (Pedido p : bdPedidos) {
            if (cpf.equals(p.getCliente().getCpf().trim())) {
                return p;
            }
        }
        return null;
    }
    
}
