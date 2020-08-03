package br.maua.enumeracoes;

public enum Status {
    PLATINADO("Platinado"), NAO_INICIADO("Não iniciado"), TERMINADO("Terminado"), JOGANDO("Jogando"), NAO_ACABADO("Não acabado");


    private String name;

    private Status(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}