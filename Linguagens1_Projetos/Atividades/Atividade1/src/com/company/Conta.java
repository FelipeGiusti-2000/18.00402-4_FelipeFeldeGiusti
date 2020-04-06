//Felipe Felde Giusti , RA:18.00402-4
package com.company;

public class Conta {
    private double saldo;
    private int idConta;
    private static int totalContas;
    private Usuario usuario;

    public Conta(Usuario usuario,double saldoInicial) {
        Conta.totalContas += 1;
        this.saldo = saldoInicial;
        this.idConta = getTotalContas();
        this.usuario = usuario;
    }

    public void addSaldo(double valor){
        this.saldo += valor;
    }

    public boolean retirarSaldo(double valor) {
        if (verificarSaldo(valor)) {    // verifico aqui e depois na transacao
                                        // tem problema?
            this.saldo -= valor;
            return true;
        } else return false;
    }


    public double getSaldo() {
        return saldo;
    }

    public int getIdConta() {
        return idConta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public static int getTotalContas(){
        return Conta.totalContas;
    }
    public boolean verificarSaldo(double valorPago){
        if(valorPago <= getSaldo()){
           return true;
        }
        else{
            //System.out.println("Valor invalido");
            return false;
        }
    }

}

