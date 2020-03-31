package com.company;

public class RH {
    public static void rodarRh(){
        Funcionario f1, f2;
        f1 = new Funcionario(1000);
        f2 = new Funcionario(3500);

        System.out.println("Funcionario 1: ");
        System.out.println("Salario Base: " + f1.getSalarioBase());
        System.out.println("Comissao: "+ f1.getComissao());
        System.out.println("Salario Total: " + f1.getSalarioFinal(10000));

        System.out.println("Funcionario 2: ");
        System.out.println("Salario Base: " + f2.getSalarioBase());
        System.out.println("Comissao: "+ f2.getComissao());
        System.out.println("Salario Total: " + f2.getSalarioFinal(10000));

    }
}
