package br.maua.models;

import br.maua.enums.Estado;
import br.maua.enums.FormaDePagamento;

import java.util.Random;

public class Pedido {
    private String id;
    private String descrição;
    private double valor;
    private Estado estado;
    private FormaDePagamento formaDePagamento;

    public Pedido(String descrição, double valor) {
        this.id = geradorId();
        this.descrição = descrição;
        this.valor = valor;
        this.estado = Estado.REALIZADO;
    }

    private String geradorId(){   //Metodo retirado do enunciado
        Random random = new Random();
        String idGerado = "";
        for(int i = 0; i < 3; i++)
            idGerado += random.nextInt(10);
        return idGerado;
    }
}
