package br.maua.models;

import br.maua.enums.Estado;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Pedido> pedidos;

    public Sistema() {
        pedidos = new ArrayList<Pedido>();
    }

    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    public void alterarPedido(String id, Estado novoEstado){
        for (Pedido pedido : pedidos) {
            if(pedido.getId().equals(id)){
                pedido.setEstado(novoEstado);
            }
            else{
                System.out.println("id nao encontrado!");
            }
        }
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
