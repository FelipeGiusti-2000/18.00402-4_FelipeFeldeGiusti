package com.company;

public class MinhaClasse {
    //*tenta so usar static se precisa*
    //Com o static tira o this --> Agr ta flando em relação
    //à classe, não mais o objeto.
    //metodos static so podem acessar variaveis do tipo static da classe
    private static int contaObjetos = 0;
    private String nome;

    public MinhaClasse(){
        MinhaClasse.contaObjetos += 1;
    }
    public static int getContaObjetos(){
        return MinhaClasse.contaObjetos;
    }
}
