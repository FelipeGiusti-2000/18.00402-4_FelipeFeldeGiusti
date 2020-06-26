package br.maua.models;

import br.maua.interfaces.VerificarSenha;

/**
 * Representação de um usuário no sistema. A classe assina a implementação da interface VerificarSenha
 * @author Felipe Felde Giusti
 * @since 21/06/2020
 * @version 1.0
 */
public class Usuario implements VerificarSenha{
    private String nome;
    private String email;
    private String senha;

    /**
     * @param nome Nome do usuário
     * @param email Email do usuário
     * @param senha Senha do usuário
     */
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;         //Talvez a senha tenha que fazer 123456 direto?
    }

    /**
     * @return Getter para a senha do usuário
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Método implementado da interface VerificarSenha que checa a senha do usuário
     * @param senha Senha a ser testada
     * @return true se a senha informada for igual a senha do usuário
     */
    @Override
    public boolean verificarSenha(String senha) {
        return senha.equals(this.getSenha());
    }
}
