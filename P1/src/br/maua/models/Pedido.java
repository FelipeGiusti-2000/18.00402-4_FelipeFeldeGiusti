package br.maua.models;

import br.maua.enums.Estado;
import br.maua.enums.FormaDePagamento;

import java.util.Random;

/**
 * Classe que define um modelo de pedido para o sistema
 * @author Felipe Felde Giusti
 * @since 21/06/2020
 * @version 1.0
 */
public class Pedido {
    private String id;
    private String descricao;
    private double valor;
    private Estado estado;
    private FormaDePagamento formaDePagamento;

    /**
     * @param descricao Descricao do pedido
     * @param valor Valor a ser cobrado pelo pedido
     * @param formaDePagamento Enumeração que define a forma de pagamento do pedido
     */
    public Pedido(String descricao, double valor, FormaDePagamento formaDePagamento) {
        this.id = geradorId();
        this.descricao = descricao;
        this.valor = valor;
        this.estado = Estado.REALIZADO;
        this.formaDePagamento = formaDePagamento;
    }

    /**
     * @return String de um numero inteiro de 3 digitos gerados aleatoriamente
     */
    private String geradorId(){   //Metodo retirado do enunciado
        Random random = new Random();
        String idGerado = "";
        for(int i = 0; i < 3; i++)
            idGerado += random.nextInt(10);
        return idGerado;
    }

    /**
     * @param estado Enumeração que define o estado do pedido
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    /**
     * @return Getter para o id do pedido
     */
    public String getId() {
        return id;
    }

    /**
     * @return Conteúdo de um pedido em forma de um texto, contendo id, descrição, valor, estado e forma de pegamento
     */
    @Override
    public String toString() {
        return "Pedido{" +
                "id='" + id + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", estado=" + estado +
                ", formaDePagamento=" + formaDePagamento +
                '}';
    }
}
