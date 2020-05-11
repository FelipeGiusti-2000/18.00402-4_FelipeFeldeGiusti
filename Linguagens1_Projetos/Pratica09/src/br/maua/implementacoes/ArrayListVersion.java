package br.maua.implementacoes;

import br.maua.models.Dog;

import java.util.ArrayList;

public class ArrayListVersion {
    public static void run(){
        ArrayList<Dog> dogs = new ArrayList<>();
        Dog dog = new Dog("D1", "cachorro", 1);
        dogs.add(dog);
        dogs.add(new Dog("D2", "asd", 22));
        dog = new Dog("D3", "Dado", 4);
        if(!dogs.contains(dog))
            dogs.add(dog);

        //Método classico do foreach
        for(Dog dogNovo : dogs){
            System.out.println(dogNovo);
        }

        //Foreach do Java8
        dogs.forEach((cachorroDaLambda)->{
            System.out.println(cachorroDaLambda);
        });
    }
}

