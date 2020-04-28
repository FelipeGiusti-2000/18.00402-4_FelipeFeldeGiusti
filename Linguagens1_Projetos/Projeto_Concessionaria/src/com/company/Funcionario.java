package com.company;

public class Funcionario {
    protected double salarioBase;
    protected double comissao;

    //Construtor
    public Funcionario(double salarioBase){
        this.salarioBase = salarioBase;
        this.comissao = 0.05;
    }
    //qunado fala os 2 ele invoca esse:
    public Funcionario(double salarioBase, double comissao) {
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public double getSalarioFinal(double totalVendasMes){
        return salarioBase + comissao * totalVendasMes;
    }
}
