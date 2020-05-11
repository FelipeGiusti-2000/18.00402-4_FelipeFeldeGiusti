package br.maua.implementacoes;

import br.maua.models.Dog;

public class ArrayVersion {
    public static void run(){
        //variaveis primitivas
//        int[] meusInteiros = new int[10];
//        meusInteiros[3] = 42;
//
//        System.out.println("run" + meusInteiros[3]);

        Dog [] dogs = new Dog[3];
        Dog dog = new Dog("Thor", "Golden", 2);
        dogs[0] = dog;
        dogs[1] = new Dog("Fido", "Rosquinha", 12);
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i]);
        }
    }
}
