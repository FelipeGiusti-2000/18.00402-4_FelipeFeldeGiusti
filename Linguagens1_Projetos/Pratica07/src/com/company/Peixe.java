package com.company;

public class Peixe extends Animal implements Locomover{
    @Override
    public void comer() {
        System.out.println("gloob");
    }
    @Override
    public void comoMeLocomovo(){
        System.out.println("Nadando");
    }
}
