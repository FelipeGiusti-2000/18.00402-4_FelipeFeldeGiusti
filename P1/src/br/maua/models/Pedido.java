package br.maua.models;

import br.maua.enums.Estado;
import br.maua.enums.FormaDePagamento;

import java.util.Random;

public class Pedido {
    private String id;
    private String descricao;
    private double valor;
    private Estado estado;
    private FormaDePagamento formaDePagamento;

    public Pedido(String descricao, double valor, FormaDePagamento formaDePagamento) {
        this.id = geradorId();
        this.descricao = descricao;
        this.valor = valor;
        this.estado = Estado.REALIZADO;
        this.formaDePagamento = formaDePagamento;
    }

    private String geradorId(){   //Metodo retirado do enunciado
        Random random = new Random();
        String idGerado = "";
        for(int i = 0; i < 3; i++)
            idGerado += random.nextInt(10);
        return idGerado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

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
