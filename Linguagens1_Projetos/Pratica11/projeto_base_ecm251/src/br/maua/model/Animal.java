package br.maua.model;

import br.maua.enumerates.AnimalClasses;
import br.maua.interfaces.Eat;
import br.maua.interfaces.Walk;
/**
 * Representação da abstração dos animais. Ela assina a implementação das interfaces Walk e Eat
 * @author Felipe Felde Giusti - felipe.giusti2000@gmail.com
 * @since 01/06/2020
 * @version 1.0
 */
public abstract class Animal implements Walk, Eat {
    private AnimalClasses animalClass;
    private String name;

    /**
     * @param animalClass Enumeração que define o tipo do nosso animal
     * @param name Nome escolhido para o animal
     */
    public Animal(AnimalClasses animalClass, String name) {
        this.animalClass = animalClass;
        this.name = name;
    }

    /**
     *
     * @return Getter para a enumeração do tipo do animal
     */
    public AnimalClasses getAnimalClass() {
        return animalClass;
    }

    public String getName() {
        return name;
    }
}
