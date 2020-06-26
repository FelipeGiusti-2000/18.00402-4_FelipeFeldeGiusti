package br.maua.interfaces;

/**
 * Interface usada para verificar uma senha
 * @author Felipe Felde Giusti
 * @since 21/06/2020
 * @version 1.0
 */
public interface VerificarSenha {
     /**
      * Método que verifica
      * @param senha Senha informada por um usuário
      * @return booleano que informa se a senha passada é igual
      */
     boolean verificarSenha(String senha);
}
