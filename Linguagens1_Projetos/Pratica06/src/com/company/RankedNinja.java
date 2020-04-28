package com.company;

public class RankedNinja extends Ninja{
    protected Mission mission;

    //Contrutor RankedNinja
    public RankedNinja(String name, String family, String rankNinja){
        super(name, family);
        this.rank;
    }
    @Override
    public void train(){
        System.out.println("No pain no gain");
    }
    public boolean conferirRank(){
        if(){

        }
    }

    //final eh para n poderem dar override/ mudar
    final public void goToMission(){
        System.out.println("indo para missao em " + mission.getLocal());
    }
}
