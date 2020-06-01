package br.maua.models;

import java.util.Objects;

public class Compra {
    private String nome;
    private int numero;

    public Compra(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Compra compra = (Compra) o;
        return numero == compra.numero &&
                Objects.equals(nome, compra.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }
}


