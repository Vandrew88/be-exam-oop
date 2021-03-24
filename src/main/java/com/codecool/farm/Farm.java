package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {
    private List<Animal> animals = new ArrayList<>();

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public void feedAnimals() {
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    public void butcher(Butcher butcher) {
        animals.removeIf(butcher::canButcher);
    }

    public boolean isEmpty() {
        return animals.isEmpty();
    }

    public List<String> getStatus() {
        List<String> animalStatus = new ArrayList<>();
        for (Animal animal : animals) {
            animalStatus.add(String.valueOf("There is a " + animal.getSize() + " sized " + animal.getType() + " in the farm."));
        }
        return animalStatus;
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
