package br.maua.models;

import br.maua.enums.Estado;

import java.util.ArrayList;
import java.util.List;
/**
 * Classe que define o sistema principal da aplicacao, onde fica a lista de pedidos do restaurante
 * @author Felipe Felde Giusti
 * @since 21/06/2020
 * @version 1.0
 */
public class Sistema {
    private List<Pedido> pedidos;

    public Sistema() {
        pedidos = new ArrayList<Pedido>();
    }

    /**
     * Método que adiciona um pedido informado na lista de pedidos do sistema
     * @param pedido Pedido a ser adicionado na lista de pedidos
     */
    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    /**
     * Método que altera o estado de um pedido existente na lista de pedidos
     * @param id id do pedido a ser alterado
     * @param novoEstado enumeração que define o tipo do novo estado do pedido
     */
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

    /**
     * @return Getter para a lista de pedidos
     */
    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
