package com.company;

public class RankedNinja extends Ninja{
    protected String mission;

    //Contrutor RankedNinja
    public RankedNinja(String name, String family, String mission){
        super(name, family);
        this.mission = mission;
    }
    @Override
    public void train(){
        System.out.println("No pain no gain");
    }

    //final eh para n poderem dar override/ mudar
    final public void goToMission(){
        System.out.println("indo para missao: "+mission);
    }
}
