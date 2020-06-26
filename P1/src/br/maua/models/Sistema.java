package br.maua.models;

import br.maua.enums.Estado;
import br.maua.interfaces.VerificarSenha;
import br.maua.models.Pedido;
import br.maua.models.Usuario;

import java.util.ArrayList;

public class Sistema {
    // Fazer essa classe, colcoar o funcionario aqui + implementacao
    private Usuario usuario;


    public Sistema(Usuario usuario) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        this.usuario = usuario;
    }

}
