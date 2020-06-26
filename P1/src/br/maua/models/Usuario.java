package br.maua.models;

import br.maua.enums.Estado;
import br.maua.interfaces.VerificarSenha;

public class Usuario implements VerificarSenha{
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;         //Talvez a senha tenha que fazer 123456 direto
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public boolean verificarSenha(String senha) {
        if(senha.equals(getSenha())){
            return true;
        }
        return false;
    }
}
