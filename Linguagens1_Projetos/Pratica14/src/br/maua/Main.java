package br.maua;

import br.maua.dao.AplicacaoDAO;
import br.maua.testes.Aplicacao;

public class Main {

    public static void main(String[] args) {
        AplicacaoDAO app = new AplicacaoDAO();
        app.run();

    }
}
