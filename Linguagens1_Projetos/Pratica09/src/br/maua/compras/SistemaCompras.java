package br.maua.compras;

import br.maua.models.Produto;

import java.util.ArrayList;
import java.util.List;

public class SistemaCompras {
    private final List<Produto> produtos;
    private final ListaCompras listaCompras;

    public SistemaCompras(){
        produtos = new ArrayList<>();
        produtos.add(new Produto(1,"Final Fantasy",299));
        produtos.add(new Produto(2,"p2",123));

        listaCompras = new ListaCompras();
    }


    public void exibirListaProdutos(){
        produtos.forEach((produto)-> System.out.println(produto));
    }

    public void run(){
        exibirListaProdutos();
    }

}
