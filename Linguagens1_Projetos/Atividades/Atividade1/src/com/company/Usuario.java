//Felipe Felde Giusti , RA:18.00402-4
package com.company;

public class Usuario {
    private String nome, senha, email;

    public Usuario(String nome,String senha,String email){
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    public String getNome(){
        return nome;
    }
}
