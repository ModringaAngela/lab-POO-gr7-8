package pregatire.zoo;

import pregatire.zoo.animals.Animal;
import pregatire.zoo.exception.AnimalNotFoundException;

import java.util.Set;

public class Zoo {

    public final static int MAX_NR_ANIMALE = 1000;
    private Set<Animal> animals; // puteti folosi si List, dar Set este mai corect deoarece animalele sunt unice (id unic)

    public Zoo(Set<Animal> animale) {
        this.animals = animale;
    }

    public Set<Animal> getAnimals() {
        return this.animals;
    }

    /*
    exemplu cum putem sa luam animalul dupa tip
    (o abordare a cerintei:
    faceti o gradina zoo cu animalele ...
    leul primeste hrana zilnica. leul face etc, etc)
    puteti face si altfel :)
     */
    public Animal getAnimalByType(Class<?> t) throws AnimalNotFoundException {
        return animals.stream()
                .filter(e -> e.getClass()==t)
                .findFirst()
                .orElseThrow(() -> new AnimalNotFoundException(t.getSimpleName()));
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                '}';
    }
}
