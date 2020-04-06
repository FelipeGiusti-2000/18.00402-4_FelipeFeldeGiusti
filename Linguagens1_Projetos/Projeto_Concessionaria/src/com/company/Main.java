package com.company;

public class Main {

    public static void main(String[] args) {
        Gerente g1,g2;
        Vendedor v1,v2;
        double totalDeVendas = 1000;
        g1 = new Gerente(1000);
        v1 = new Vendedor(1000,g1);
        System.out.println("Gerente 1: "+g1.getSalarioFinal(totalDeVendas));
        System.out.println("Vendedor 1: "+ v1.getSalarioFinal(totalDeVendas));
        g1.darAumento(v1, 0.1);
        System.out.println("Vendedor 1: "+ v1.getSalarioFinal(totalDeVendas));

    }
}