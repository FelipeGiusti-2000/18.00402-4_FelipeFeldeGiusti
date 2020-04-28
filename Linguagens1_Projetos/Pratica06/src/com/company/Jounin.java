package com.company;

public class Jounin extends RankedNinja{
    public Jounin(String name, String family, String descMission) {
        super(name, family, descMission);
    }

    @Override
    public void train(){
        System.out.println("Treinando para: " +mission);
    }
}
