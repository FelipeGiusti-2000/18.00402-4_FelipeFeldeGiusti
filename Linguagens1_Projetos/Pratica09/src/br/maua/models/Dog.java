package br.maua.models;

public class Dog {
    private String name;
    private String raca;
    private int peso;

    public Dog(String name, String raca, int peso) {
        this.name = name;
        this.raca = raca;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", raca='" + raca + '\'' +
                ", peso=" + peso +
                '}';
    }



    public String getName() {
        return name;
    }

    public String getRaca() {
        return raca;
    }

    public int getPeso() {
        return peso;
    }
}
