//Felipe Felde Giusti , RA:18.00402-4
package com.company;
import java.util.Random;

public class Transacao {

    public String criarQRCode(Conta conta, double valor){

        return String.format("%d;%s;%.2f;%d",conta.getIdConta(),conta.getUsuario().getNome(),valor,getRandomNumberInRange(1000,9999));

    }

    //Método copiado da folha do exercicio:
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public boolean pagar(Conta cPaga, Conta cRecebe, String qrCode){
        String[] dados = qrCode.split(";");
        double valorPagar = Double.parseDouble(dados[2].replace(",","."));
        int id = Integer.parseInt(dados[0]);
        String nomeUsuario = dados[1];

        if(id == cRecebe.getIdConta() && nomeUsuario.equals(cRecebe.getUsuario().getNome())){
            if(cPaga.verificarSaldo(valorPagar)){
                cPaga.retirarSaldo(valorPagar);
                //System.out.println(cPaga.getSaldo());
                cRecebe.addSaldo(valorPagar);
                //System.out.println(cRecebe.getSaldo());
                return true;
            }
            else return false;
        }
        else{
            //System.out.println("ID e/ou usuario incorretos.");
            return false;
        }
    }
}
