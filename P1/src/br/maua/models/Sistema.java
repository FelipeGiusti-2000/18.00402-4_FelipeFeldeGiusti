package br.maua.models;

import br.maua.enums.Estado;

import java.util.ArrayList;

public class Sistema {
    // Fazer essa classe, colcoar o funcionario aqui + implementacao
    private ArrayList<Pedido> pedidos;

    public Sistema() {
        ArrayList<Pedido> pedidos = new ArrayList<>();
    }

    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    public void alterarPedido(String id, Estado novoEstado){
        for (Pedido pedido : pedidos) {
            if(pedido.getId().equals(id)){
                pedido.setEstado(novoEstado);
            }
        }
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
}
