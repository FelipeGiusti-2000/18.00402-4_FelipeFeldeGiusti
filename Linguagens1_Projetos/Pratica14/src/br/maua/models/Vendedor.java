package br.maua.models;

import br.maua.Interfaces.Validator;

public class Vendedor implements Validator {
    private String id;
    private String name;
    private String password;

    public Vendedor(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean validate(String pass){
        return this.password.equals(pass);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
